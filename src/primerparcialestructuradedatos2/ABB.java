/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialestructuradedatos2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author cande
 */
public class ABB {

    private Nodo raiz;
    public ArrayList<Integer> ruta = new ArrayList<>();

    public void completar(int[] numeros) {
        Arrays.sort(numeros);
        insertarBalanceado(numeros, 0,30);
    }

    private void insertarBalanceado(int[] numeros, int inicio, int fin) {
        if (inicio > fin) {
            return;
        }
        
        int medio = (inicio + fin) / 2;
        this.insertar(numeros[medio]);

        insertarBalanceado(numeros, inicio, medio - 1);
        insertarBalanceado(numeros, medio + 1, fin);
    }
    
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

    public void imprimir(Nodo n1, int nivel) {
        if (n1 != null) {
            imprimir(n1.getDer(), nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("      ");
            }
            System.out.println("X");
            imprimir(n1.getIzq(), nivel + 1);

        }
    }

    public Nodo busqueda(Nodo raiz, int objetivo) {
        if (raiz == null) {
            return raiz;       
        }
        ruta.add(raiz.getValor());
        if (raiz.getValor() == objetivo) {
            return raiz;
        }
        Nodo encontrado = busqueda(raiz.getIzq(), objetivo);
        if (encontrado != null) {
            return encontrado;
        }
        return busqueda(raiz.getDer(), objetivo);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public ArrayList<Integer> getRuta() {
        return ruta;
    }

}
