package seccion008.personas;

public class clase040 {
    public static void main(String []args){
        //Creacion de un objeto
        Persona p1 = new Persona();

        //Llamado a un metodo del objeto creado
        System.out.println("Valores por default del objeto persona");
        p1.desplegarNombre();

        //Modificar valores

        p1.nombre = "Miguel";
        p1.apellidoPaterno= "Peralta";
        p1.apellidoMaterno= "Díaz";

        System.out.println("\nNuevos valores del objeto persona");
        p1.desplegarNombre();


    }
}
