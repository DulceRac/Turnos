/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.turnosestructuras;

/**
 *
 * @author ladul
 */
public class ColaTurnos<T> {

    private NodoTurno<T> frente;
    private NodoTurno<T> fin;
    private int tamano; // <- sin tilde

    public ColaTurnos() {
        frente = fin = null;
        tamano = 0;
    }

    public void encolar(T dato) {
        NodoTurno<T> nuevo = new NodoTurno<>(dato);
        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tamano++;
    }

    public T desencolar() {
        if (estaVacia()) return null;
        T dato = frente.getDato();
        frente = frente.getSiguiente();
        tamano--;
        if (frente == null) fin = null;
        return dato;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public int getTamano() {
        return tamano;
    }

    public T verFrente() {
        return estaVacia() ? null : frente.getDato();
    }
}


