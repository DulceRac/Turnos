/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.turnosestructuras;

/**
 *
 * @author ladul
 */
public class NodoServicio {
    private String servicio;
    private NodoServicio izquierdo;
    private NodoServicio derecho;

    public NodoServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public NodoServicio getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoServicio izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoServicio getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoServicio derecho) {
        this.derecho = derecho;
    }
}
