package seccion005;

public class Clase026 {
    public static void main(String[] args) {
        int a = 3, b = 2;
        boolean c = a != b;
        System.out.println("c = " + c);

        String d = "hola", e = "adios";
        boolean f = d.equals(e);
        System.out.println("f = " + f);

        boolean g = (a <= b);
        System.out.println("g = " + g);

        if (b % 2 == 0)
            System.out.println("numero par");
        else
            System.out.println("numero impar");

        int edad = 17;
        int adulto = 18;

        if (edad >= adulto)
            System.out.println("es un adulto");
        else
            System.out.println("es menor de edad");

    }
}
