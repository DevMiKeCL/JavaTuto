package seccion036;

public class Clase108 {
    public static void main(String []args){
//        creamos un arreglo de enteros
        int edades[] = {15, 20, 41, 50};
//        Iteramos el arreglo
        for (int edad : edades){
            System.out.println("Edad: " + edad);
        }

//        creamos un arreglo personas
        Persona personas [] = {new Persona("Mike"), new Persona("Katherine")};
//        Iteramos cada elemento del arreglo de personas
        for (Persona persona : personas){
            System.out.println("Nombre Persona: " + persona.getNombre());
        }


    }
}
