package seccion008;

public class Clase049 {
    public static void main(String[] args) {
        //Creacion de un objeto
        Persona p1 = new Persona();

        //Llamando a un metodo del objeto creadp
        System.out.println("Valores por default del objeto creado");
        p1.desplegarNombre();

        //Modificar valores del objeto creado
        p1.nombre = "Miguel";
        p1.apellidoPaterno = "Peralta";
        p1.apellidoMaterno = "Díaz";

        //Volvemos a llamar al metodo
        System.out.println("\nNuevos valores del objeto Persona");
        p1.desplegarNombre();

        //Creacion de un segundo objeto
        Persona p2 = new Persona();
        System.out.println("\nCreacion nuevo objeto");
        p2.nombre = "Katherine";
        p2.desplegarNombre();


    }
}
