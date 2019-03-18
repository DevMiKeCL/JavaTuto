package seccion023;

//Import a todas las clases dentro de un paquete
import seccion023.com.gm.*; //se importa el paquete a utilizar

//Import estático
import static seccion023.com.gm.Utileria.imprimir;



public class Principal {
    public static void main(String []args){
        Utileria.imprimir("Hola");
        //Modo directo
        //seccion023.com.gm.Utileria.imprimir("");

        //Import estático simple
        imprimir("Hola");
    }
}
