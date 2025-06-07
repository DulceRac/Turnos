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
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TurnoEventListener {

    @RabbitListener(queues = "turno.queue")
    public void recibirTurno(Turno turno) {
        System.out.println(" Turno recibido por RabbitMQ: " + turno);
    }
}
