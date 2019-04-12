package seccion020;

import java.util.Date;

public class Clase074 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Mike", 1500000);
        empleado1.setEdad(38);
        empleado1.setGenero('m');
        empleado1.setDireccion("y se la creyo 123");
        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Katherine");
        cliente1.setGenero('f');
        cliente1.setEdad(33);
        cliente1.setDireccion("no lo se 123");
        System.out.println("cliente1 = " + cliente1);
    }
}
