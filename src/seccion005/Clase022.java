package seccion005;

public class Clase022 {
    public static void main(String[] args) {
        int a= 3, b = 2;
        
        int c = a + b;
        System.out.println("c = " + c);
        System.out.println("resultado: " + (a + b));
        System.out.println(a + b + " resultado");

        int d = a - b;
        System.out.println("d = " + d);

        System.out.println("Resultado resta: " + (a - b));

        int e = a * b;
        System.out.println("e = " + e);

        double f = 3D / b;
        System.out.println("f = " + f);

        int g = a % b;
        System.out.println("g = " + g);

        int z = 6 % 2;
        System.out.println("z = " + z);
        if (z == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");

    }

}
