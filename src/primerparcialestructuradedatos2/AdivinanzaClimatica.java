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

    public static String[] climateData = {
            "Aumento del nivel del mar: Desde 1880, el nivel global del mar ha aumentado aproximadamente 23 cm, y se espera que aumente entre 30 cm y 1.2 metros para el año 2100 debido al derretimiento de los glaciares y la expansión térmica del agua. Fuente: NASA Climate Change.",
            "Pérdida de hielo ártico: La extensión del hielo marino del Ártico ha disminuido un 13% por década desde 1979. Fuente: National Snow and Ice Data Center.",
            "Eventos climáticos extremos: La frecuencia e intensidad de los eventos climáticos extremos, como huracanes y olas de calor, han aumentado debido al calentamiento global. Fuente: Intergovernmental Panel on Climate Change (IPCC).",
            "Impacto en la biodiversidad: Se estima que entre el 20% y el 30% de las especies evaluadas están en riesgo de extinción si las temperaturas globales aumentan entre 1.5°C y 2.5°C. Fuente: World Wildlife Fund (WWF).",
            "Desaparición de glaciares: Los glaciares del mundo están perdiendo hielo a un ritmo acelerado. Se estima que los glaciares han perdido más de 9 billones de toneladas de hielo desde 1961. Fuente: World Glacier Monitoring Service.",
            "Aumento de las temperaturas globales: La temperatura global promedio ha aumentado aproximadamente 1.1°C desde la era preindustrial, y se espera que continúe aumentando si no se reducen las emisiones de gases de efecto invernadero. Fuente: Intergovernmental Panel on Climate Change (IPCC).",
            "Impacto en la agricultura: El cambio climático está afectando los rendimientos de los cultivos, con proyecciones que indican una disminución del 10-25% en la producción de maíz, trigo y arroz para 2050 en algunas regiones. Fuente: Food and Agriculture Organization (FAO).",
            "Migración climática: Se estima que para 2050, más de 200 millones de personas podrían verse obligadas a desplazarse debido a los impactos del cambio climático, como la subida del nivel del mar y la desertificación. Fuente: Internal Displacement Monitoring Centre (IDMC).",
            "Aumento de las enfermedades transmitidas por vectores: El cambio climático está expandiendo el rango de enfermedades como la malaria y el dengue, ya que los mosquitos y otros vectores pueden sobrevivir en áreas previamente demasiado frías para ellos. Fuente: World Health Organization (WHO).",
            "Pérdida de bosques: La deforestación y la degradación de los bosques contribuyen significativamente al cambio climático, y se estima que se pierden alrededor de 10 millones de hectáreas de bosque cada año. Fuente: Global Forest Watch."
        };
        
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
    
    public static String getDatoClimatico(){
        Random random = new Random();
        int randomIndex = random.nextInt(climateData.length);
        String datoClimatico = climateData[randomIndex];
        return datoClimatico;
    }
}
