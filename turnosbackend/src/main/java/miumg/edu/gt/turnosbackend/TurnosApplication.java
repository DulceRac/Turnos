/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miumg.edu.gt.turnosbackend;

/**
 *
 * @author ladul
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "miumg.edu.gt.turnosbackend",
        "miumg.edu.gt.turnospersistencia",
        "umg.edu.gt.turnosestructuras"
})
public class TurnosApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurnosApplication.class, args);
    }
}

