/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miumg.edu.gt.turnosbackend;

/**
 *
 * @author ladul
 */

import miumg.edu.gt.turnospersistencia.Turno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/turno")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    // POST /turno
    @PostMapping
    public void crearTurno(@RequestBody TurnoDTO dto) {
        turnoService.crearTurno(dto);
    }

    // GET /turno/siguiente
    @GetMapping("/siguiente")
    public Turno atenderSiguiente() {
        return turnoService.atenderTurno();
    }

    // DELETE /turno/{id}
    @DeleteMapping("/{id}")
    public String cancelarTurno(@PathVariable Long id) {
        return turnoService.cancelarTurno(id);
    }

    // POST /turno/deshacer
    @PostMapping("/deshacer")
    public String deshacerCancelacion() {
        return turnoService.deshacerUltimaCancelacion();
    }
}