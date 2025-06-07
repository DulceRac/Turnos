/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miumg.edu.gt.turnosbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.gt.turnosestructuras.ColaTurnos;
import umg.edu.gt.turnosestructuras.PilaAcciones;
import java.time.LocalDateTime;
import java.util.Optional;
import miumg.edu.gt.turnospersistencia.Cliente;
import miumg.edu.gt.turnospersistencia.ClienteRepository;
import miumg.edu.gt.turnospersistencia.Turno;
import miumg.edu.gt.turnospersistencia.TurnoRepository;

@Service
public class TurnoService {

    private ColaTurnos<Turno> colaTurnos = new ColaTurnos<>();
    private PilaAcciones<Turno> pilaCancelados = new PilaAcciones<>();

    @Autowired
    private TurnoRepository turnoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TurnoEventPublisher publisher;

    public String crearTurno(TurnoDTO dto) {
        Cliente cliente = clienteRepository.findByDpi(dto.getDpi())
                .orElseGet(() -> clienteRepository.save(new Cliente(dto.getNombreCliente(), dto.getDpi())));

        Turno turno = new Turno();
        turno.setCliente(cliente);
        turno.setTipoServicio(dto.getTipoServicio());
        turno.setEstado("PENDIENTE");
        turno.setFechaGeneracion(LocalDateTime.now());

        turnoRepository.save(turno);
        colaTurnos.encolar(turno);
        publisher.publicarEvento(turno);

        return "Turno generado correctamente.";
    }

    public Turno atenderTurno() {
        Turno turno = colaTurnos.desencolar();
        if (turno != null) {
            turno.setEstado("ATENDIDO");
            turnoRepository.save(turno);
        }
        return turno;
    }

    public String cancelarTurno(Long id) {
        Optional<Turno> optionalTurno = turnoRepository.findById(id);

        if (optionalTurno.isPresent()) {
            Turno turno = optionalTurno.get();

            if (!turno.getEstado().equalsIgnoreCase("PENDIENTE")) {
                return "El turno no está pendiente, no se puede cancelar.";
            }

            turno.setEstado("CANCELADO");
            turnoRepository.save(turno);

            pilaCancelados.apilar(turno);
            return "Turno cancelado y agregado a pila de deshacer.";
        } else {
            return "Turno no encontrado.";
        }
    }

    public String deshacerUltimaCancelacion() {
        if (pilaCancelados.estaVacia()) {
            return "No hay cancelaciones para deshacer.";
        }

        Turno turno = pilaCancelados.desapilar();

        turno.setEstado("PENDIENTE");
        turnoRepository.save(turno);

        colaTurnos.encolar(turno); // Lo reencolamos
        return "Se deshizo la última cancelación y se reencoló el turno.";
    }
}
