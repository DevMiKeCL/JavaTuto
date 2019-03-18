/**
 * Derechos reservados
 */
package seccion032;

import seccion032.clases.Aritmetica;

/**
 * Clase para probar el concepto de javadoc
 * @author Miguel
 * @version 1.0
 */
public class EjemploJavaDoc {

    /**
     * Metodo que ejecuta la prueba de la clase Aritmetica
     * @param args argumentos de la linea de comandos
     */
    public static void main(String []args){
        int resultado = new Aritmetica(3, 2).sumar();
        System.out.println("Resultado: " + resultado);
    }
}
