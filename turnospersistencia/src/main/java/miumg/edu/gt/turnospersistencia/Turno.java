package miumg.edu.gt.turnospersistencia;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private String tipoServicio;
    private String estado;
    private LocalDateTime fechaGeneracion;

    public Turno() {}

    // GETTERS
    public Long getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public String getTipoServicio() { return tipoServicio; }
    public String getEstado() { return estado; }
    public LocalDateTime getFechaGeneracion() { return fechaGeneracion; }

    // SETTERS
    public void setId(Long id) { this.id = id; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public void setTipoServicio(String tipoServicio) { this.tipoServicio = tipoServicio; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
  
}
