/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.turnosestructuras;

/**
 *
 * @author ladul
 */
public class NodoHistorial<T> {
    private T dato;
    private NodoHistorial<T> siguiente;

    public NodoHistorial(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public NodoHistorial<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoHistorial<T> siguiente) {
        this.siguiente = siguiente;
    }
}

