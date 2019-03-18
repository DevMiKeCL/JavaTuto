package seccion020;

public class Clase066 {
    public static void main(String []args){
        Empleado e1 = new Empleado("Mike", 1200000);
        System.out.println("Imprimimos el objeto empleado1");
        System.out.println(e1);

        Empleado e2 = new Empleado("Katty", 1200000);
        e2.setEdad(33);
        e2.setGenero('F');
        e2.setDireccion("La Serena, Chile");
        System.out.println("\nImprimimos el objeto empleado2");
        System.out.println(e2);

        //Al crear un nuevo objeto de java.util.Date nos regresa la fecha actual
        Cliente c1 = new Cliente(new java.util.Date(), false);
        System.out.println("\nImprimimos el objeto cliente1");
        System.out.println(c1);
        //Completamos el objeto persona asociado a este objeto cliente
        c1.setNombre("Con Collar");
        c1.setEdad(6);
        c1.setGenero('M');
        c1.setDireccion("Coquimbo, Chile");
        System.out.println("\nImprimimos el objeto cliente1");
        System.out.println(c1);

    }

}
