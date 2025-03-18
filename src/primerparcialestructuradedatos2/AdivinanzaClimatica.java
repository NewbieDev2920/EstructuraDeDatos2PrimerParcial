/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialestructuradedatos2;

import java.util.Random;

/**
 *
 * @author cande
 */
public class AdivinanzaClimatica {

    public static int[] generarVectorInsercion(int limiteInferior, int limiteSuperior, int nivelDelArbol) {
        Random r = new Random();
        int res[] = new int[(int) Math.pow(2, nivelDelArbol) - 1];
        boolean[] numerosGenerados = new boolean[limiteSuperior - limiteInferior + 1];
        int i = 0;

        while (i < Math.pow(2, nivelDelArbol) - 1) {
            int numero = r.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
            if (numerosGenerados[numero - limiteInferior]== false) {
                res[i] = numero;
                numerosGenerados[numero - limiteInferior] = true;
                i++;
            }
        }
        return res;
    }

    public static void imprimirVector(int[] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    
}
