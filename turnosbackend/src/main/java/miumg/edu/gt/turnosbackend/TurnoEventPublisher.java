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
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoEventPublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void publicarEvento(Turno turno) {
        rabbitTemplate.convertAndSend("turno.exchange", "turno.nuevo", turno);
    }
}
