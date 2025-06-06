/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miumg.edu.gt.turnospersistencia;

/**
 *
 * @author ladul
 */
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String observacion;
    private LocalDateTime fechaAtencion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Historial() {}

    public Long getId() {
        return id;
    }

    public String getObservacion() {
        return observacion;
    }

    public LocalDateTime getFechaAtencion() {
        return fechaAtencion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setFechaAtencion(LocalDateTime fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
