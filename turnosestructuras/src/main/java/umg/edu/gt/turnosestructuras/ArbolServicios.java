/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.turnosestructuras;

/**
 *
 * @author ladul
 */
public class ArbolServicios {

    private NodoServicio raiz;

    public void insertar(String servicio) {
        raiz = insertarRec(raiz, servicio);
    }

    private NodoServicio insertarRec(NodoServicio actual, String servicio) {
        if (actual == null) {
            return new NodoServicio(servicio);
        }

        if (servicio.compareToIgnoreCase(actual.getServicio()) < 0) {
            actual.setIzquierdo(insertarRec(actual.getIzquierdo(), servicio));
        } else if (servicio.compareToIgnoreCase(actual.getServicio()) > 0) {
            actual.setDerecho(insertarRec(actual.getDerecho(), servicio));
        }

        return actual;
    }

    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(NodoServicio nodo) {
        if (nodo != null) {
            inOrdenRec(nodo.getIzquierdo());
            System.out.println(nodo.getServicio());
            inOrdenRec(nodo.getDerecho());
        }
    }
    
    public boolean contiene(String servicio) {
    return buscar(raiz, servicio);
}

private boolean buscar(NodoServicio actual, String servicio) {
    if (actual == null) return false;
    if (servicio.equalsIgnoreCase(actual.getServicio())) return true;

    return servicio.compareToIgnoreCase(actual.getServicio()) < 0
            ? buscar(actual.getIzquierdo(), servicio)
            : buscar(actual.getDerecho(), servicio);
}
}
