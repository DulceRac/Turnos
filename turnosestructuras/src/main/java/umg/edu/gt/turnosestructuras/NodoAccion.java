/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.turnosestructuras;

/**
 *
 * @author ladul
 */
public class NodoAccion<T> {
    private T dato;
    private NodoAccion<T> siguiente;

    public NodoAccion(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public NodoAccion<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAccion<T> siguiente) {
        this.siguiente = siguiente;
    }
}

