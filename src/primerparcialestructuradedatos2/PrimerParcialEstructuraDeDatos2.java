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
        ABB arbol = new ABB();
        int[] numeros = AdivinanzaClimatica.generarVectorInsercion(-10, 50, 5);
        arbol.completar(numeros);
        /*for (int numero : numeros) {
            arbol.insertar(numero);
        }*/
        arbol.imprimir(arbol.getRaiz(), 0);
        Scanner leer = new Scanner(System.in);
        int intentos = 1;
        while (intentos <= 4) {
            System.out.println("Escriba nodo: ");
            int nodo = leer.nextInt();
            if (arbol.busqueda(arbol.getRaiz(), nodo) == null) {
                System.out.println();
                System.out.println("Nodo no encontrado");
                intentos++;
            } else {
                System.out.println("Nivel: " + arbol.busqueda(arbol.getRaiz(), nodo).getNivel(arbol.getRaiz(), arbol.busqueda(arbol.getRaiz(), nodo), 0));
                System.out.println(arbol.busqueda(arbol.getRaiz(), nodo).status(arbol));
                intentos = 10;
            }
        }
        if (intentos == 10) {
            System.out.println("Felicidades!");
        } else {
            System.out.println("Dato climatico");
        }
<<<<<<< HEAD
        
        /*
        AdivinanzaClimatica.imprimirVector(AdivinanzaClimatica.generarVectorInsercion(-10, 50, 5));
        System.out.println("");
        System.out.println(AdivinanzaClimatica.generarVectorInsercion(-10, 50, 5).length);
        */
        
        Interfaz gui = new Interfaz(arbol);
    }
    
}
    
=======
>>>>>>> 2315df7ce032cb8b1a19705271b7f894bcc79c2e

    }

}
