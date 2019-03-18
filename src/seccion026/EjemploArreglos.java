package seccion026;

public class EjemploArreglos {
    public static void main(String []args){
//        Declaramos un arreglos de enteros
        int edades[];
//        Instanciamos el arreglo de enteros
        edades = new int[3];
//        inicializamos los valores del arreglo de enteros
        edades[0] = 30;
        edades[1] = 15;

//        leemos los valores de cada elemento del arreglo
//        System.out.println("arreglo entero indice 0 " + edades[0]);
//        System.out.println("arreglo entero indice 1 " + edades[1]);
        for (int i = 0; i < edades.length; i++){
            System.out.println("arreglo entero indice " + i + " " + edades[i]);
        }

        Persona personas[];
        personas = new Persona[4];
        personas[0] = new Persona("Mike");
        personas[1] = new Persona("Katherine");
        personas[2] = new Persona("Cristina");

//        System.out.println("arreglo persona indice 0 " + personas[0]);
//        System.out.println("arreglo persona indice 1 " + personas[1]);
        for (int i = 0; i < personas.length; i++){
            System.out.println("arreglo Persona indice " + i + " " + personas[i]);
        }


//        arreglo String, notacion simplificada
        String nombres[] = {"Ana", "Cristina", "Maximiliano", "Michael"};
//        imprimimos los valores a la salida estandar
//        leemos los valores de cada elemento del arreglo
        System.out.println("");
//        Iteramos el arreglo de String con un for
        for (int i = 0; i < nombres.length; i++){
            System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
        }
    }
}
