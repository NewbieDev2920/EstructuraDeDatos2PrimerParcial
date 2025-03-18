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
    private ABB arbol;
    
    public int[] generarVectorInsercion(int limiteInferior, int limiteSuperior, int nivelDelArbol){
        Random r = new Random();
        int res[] = {};
        for (int i = 0; i < Math.pow(2,nivelDelArbol-1); i++) {
            int nuevoValor = r.nextInt((limiteSuperior-limiteInferior+1)+ limiteInferior);
            res[res.length] = nuevoValor;
        }
        
        return res;
    }

    public ABB getArbol() {
        return arbol;
    }

    public AdivinanzaClimatica() {
        this.arbol = new ABB();
    }
    
    
    
    
    
    
}
