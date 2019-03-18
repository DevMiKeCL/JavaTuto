package seccion017;

public class Clase058 {
    public static void main(String[]args){
        Persona p1 = new Persona("Katherine");
        System.out.println("Nombre p1: " + p1.obtenerNombre());

        Persona p2 = p1; //p2 apunta al mismo objeto que p1
        System.out.println("Nombre p2: " + p2.obtenerNombre());

        //Hacemos que p1 ya no apunte al objeto p1
        p1 = null;

        System.out.println("Nombre p2: " + p2.obtenerNombre());

        /*
        La siguiente linea marca error de tipo NullPointerException
        System.out.println("Nombre p1: " + p1.obtenerNombre());
        Solo en caso de que no sea nulo podemos utilizar este metodo en esta variable
         */

        if (p1 != null){
            System.out.println("Nombre p1: " + p1.obtenerNombre());
        }
    }
}


