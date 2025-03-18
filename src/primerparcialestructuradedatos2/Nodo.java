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
    private int valor;

    public int getNivel(Nodo raiz, Nodo objetivo, int nivel){
        if (raiz.getValor() == objetivo.getValor()) {
            return nivel; // Nodo encontrado
        }

        if (objetivo.getValor() < raiz.getValor()) {
            // Buscar en el subárbol izquierdo
            return getNivel(raiz.getIzq(), objetivo, nivel + 1);
        } else {
            // Buscar en el subárbol derecho
            return getNivel(raiz.getDer(), objetivo, nivel + 1);
        }
    }
    
    public String status(ABB arbol){
        if(this == arbol.getRaiz()){
            return "Nodo raiz";
        }
        if (this.getIzq()==null & this.getDer()==null){
            return "Nodo hoja";
        }
        return "Nodo rama";
    }
    
    public Nodo(int valor) {
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
