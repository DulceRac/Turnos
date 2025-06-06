/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.turnosestructuras;

/**
 *
 * @author ladul
 */
public class ListaHistorial<T> {

    private NodoHistorial<T> cabeza;

    public void agregar(T dato) {
        NodoHistorial<T> nuevo = new NodoHistorial<>(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoHistorial<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public void imprimir() {
        NodoHistorial<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
