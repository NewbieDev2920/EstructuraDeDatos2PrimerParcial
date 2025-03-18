/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialestructuradedatos2;

/**
 *
 * @author cande
 */
public class ABB {
    private Nodo raiz;

    public void insertar(int valor) {
        Nodo nodo = new Nodo(valor);
        if (this.raiz == null) {
            this.raiz = nodo;
        } else {
            insertarRecursivo(this.raiz, nodo);
        }
    }

    void insertarRecursivo(Nodo nodo, Nodo nuevoNodo) {
        if (nuevoNodo.getValor() < nodo.getValor()) {
            if (nodo.getIzq() == null) {
                nodo.setIzq(nuevoNodo);
            } else {
                insertarRecursivo(nodo.getIzq(), nuevoNodo);
            }
        } else {
            if (nodo.getDer() == null) {
                nodo.setDer(nuevoNodo);
            } else {
                insertarRecursivo(nodo.getDer(), nuevoNodo);
            }
        }
    }
    
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    
}
