/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcialestructuradedatos2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cande
 */
public class PrimerParcialEstructuraDeDatos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a Adivinanza Climática. En este juego tendrás que adivinar una temperatura´promedio global la cual está medida en grados Celsius.");
        System.out.println("Los valores varían entre -10 y 50 grados.");
        System.out.println("Tendrás 4 oportunidades para adivinar una temperatura guardada en el siguiente árbol binario. Suerte!");
        System.out.println("");
        ABB arbol = new ABB();
        int[] numeros = AdivinanzaClimatica.generarVectorInsercion(-10, 50, 5);
        arbol.completar(numeros);
        arbol.imprimir(arbol.getRaiz(), 0);
        Scanner leer = new Scanner(System.in);
        int intentos = 1;
        while (intentos <= 4) {
            System.out.println("Intento #"+intentos);
            System.out.print("Escriba nodo: ");
            int nodo = leer.nextInt();
            if (arbol.busqueda(arbol.getRaiz(), nodo) == null) {
                System.out.println("Ruta: "+arbol.getRuta());
                arbol.getRuta().clear();
                System.out.println("Nodo no encontrado");
                System.out.println("");
                intentos++;
            } else {
                System.out.println("Ruta: "+arbol.getRuta());
                System.out.println("Nivel: " + arbol.busqueda(arbol.getRaiz(), nodo).getNivel(arbol.getRaiz(), arbol.busqueda(arbol.getRaiz(), nodo), 0));
                System.out.println(arbol.busqueda(arbol.getRaiz(), nodo).status(arbol));
                System.out.println("");
                intentos = 10;
            }
        }
        if (intentos == 10) {
            System.out.println("Felicidades! Observe el árbol en la nueva ventana");
            Interfaz interfaz = new Interfaz(arbol);
        } else {
            System.out.println("Lástima! Perdiste. A continuación un dato curioso sobre el impacto del aumento de temperaturas en el planeta:");
            System.out.println(AdivinanzaClimatica.getDatoClimatico());
        }

    }

}


