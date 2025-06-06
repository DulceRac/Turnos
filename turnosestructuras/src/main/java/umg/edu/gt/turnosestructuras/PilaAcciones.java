/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.turnosestructuras;

/**
 *
 * @author ladul
 */
public class PilaAcciones<T> {

    private NodoAccion<T> cima;

    public void apilar(T dato) {
        NodoAccion<T> nuevo = new NodoAccion<>(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    public T desapilar() {
        if (estaVacia()) return null;
        T dato = cima.getDato();
        cima = cima.getSiguiente();
        return dato;
    }

    public boolean estaVacia() {
        return cima == null;
    }
}

