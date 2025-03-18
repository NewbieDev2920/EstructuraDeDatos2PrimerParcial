/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcialestructuradedatos2;

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
        for (int numero : numeros) {
            arbol.insertar(numero);
        }
        
        /*
        AdivinanzaClimatica.imprimirVector(AdivinanzaClimatica.generarVectorInsercion(-10, 50, 5));
        System.out.println("");
        System.out.println(AdivinanzaClimatica.generarVectorInsercion(-10, 50, 5).length);
        */
        
        Interfaz gui = new Interfaz(arbol);
    }
    
}
    

