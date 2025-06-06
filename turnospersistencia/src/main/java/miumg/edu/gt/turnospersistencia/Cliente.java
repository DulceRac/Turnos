package miumg.edu.gt.turnospersistencia;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String dpi;

    public Cliente() {} // Constructor vacío obligatorio

    public Cliente(String nombre, String dpi) {
        this.nombre = nombre;
        this.dpi = dpi;
    }

    // Getters y setters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDpi() { return dpi; }

    public void setId(Long id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDpi(String dpi) { this.dpi = dpi; }
}
