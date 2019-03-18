package seccion033;

public class EjemploVarArgs {

    public static void main(String []args){
        imprimirNumeros(15,20,3,61,75,18,10);
        impNumForEach(15,20,3,61,75,18,10);
        variosParametros("Mike", true, 10,20,30);

    }

    /**
     * se crea un arreglo de dimension variable para la recepcion de datos e impresion
     * usando el ciclo for
     * @param numeros
     */
    public static void imprimirNumeros(int... numeros){
        int elemento;
        for (int i=0; i < numeros.length; i++){
            elemento = numeros[i];
            System.out.println("Elemento: " + i + " " + elemento);
        }
    }

    /**
     * se crea un arreglo de dimension variable para la recepcion de datos e impresion
     * usando el ciclo foreach
     * @param numeros
     */
    public static void impNumForEach(int... numeros){
        for (int numero : numeros){
            System.out.println("El numero es: " + numero);
        }
    }

    public static void variosParametros(String nombre, boolean valido, int... numeros){
        System.out.println("Nombre: " + nombre);
        System.out.println("Valido: " + valido);
//        Usamos foreach
        for (int numero : numeros){
            System.out.println("El numero es: " + numero);
        }
    }
}
