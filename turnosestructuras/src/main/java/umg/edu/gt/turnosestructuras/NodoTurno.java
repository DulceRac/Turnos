/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.turnosestructuras;

/**
 *
 * @author ladul
 */
public class NodoTurno<T> {
    private T dato;
    private NodoTurno<T> siguiente;

    public NodoTurno(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public NodoTurno<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTurno<T> siguiente) {
        this.siguiente = siguiente;
    }
}
