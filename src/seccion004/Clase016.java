package seccion004;

public class Clase016 {
    public static void main(String[] args) {
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("Valor mínimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo tipo float: " + Float.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo double: " + Double.SIZE);
        System.out.println("bytes tipo double: " + Double.BYTES);
        System.out.println("Valor mínimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo tipo double: " + Double.MAX_VALUE);

        float floatVar = 0.5F;
        System.out.println("floatVar = " + floatVar);
        double doubleVar = 0.10D;
        System.out.println("doubleVar = " + doubleVar);

        var floatVar2 = 10.0F;
        System.out.println("floatVar2 = " + floatVar2);
        var doubleVar2 = 10.15D;
        System.out.println("doubleVar2 = " + doubleVar2);




    }
}
