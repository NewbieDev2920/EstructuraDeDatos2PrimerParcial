/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialestructuradedatos2;

/**
 *
 * @author cande
 */
public class Nodo {
    private Nodo izq;
    private Nodo der;
    private Nodo valor;

    public Nodo(Nodo valor) {
        this.valor = valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo getValor() {
        return valor;
    }

    public void setValor(Nodo valor) {
        this.valor = valor;
    }
    
    
}
