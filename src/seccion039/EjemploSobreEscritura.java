package seccion039;

public class EjemploSobreEscritura {
    public static void main(String []args){
        Empleado empleado = new Empleado("MiKe", 1500000);
        System.out.println(empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Katherine", 2000000, "Finanzas");
        System.out.println(gerente.obtenerDetalles());

    }
}
