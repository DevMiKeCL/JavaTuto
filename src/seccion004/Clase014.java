package seccion004;

public class Clase014 {
    public static void main(String[] args) {
        //byte, short, int, long
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("Valor mínimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo tipo byte: " + Byte.MAX_VALUE);
        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("Valor mínimo tipo short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo tipo short: " + Short.MAX_VALUE);
        System.out.println("bits tipo integer: " + Integer.SIZE);
        System.out.println("bytes tipo integer: " + Integer.BYTES);
        System.out.println("Valor mínimo tipo integer: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo tipo integer: " + Integer.MAX_VALUE);
        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("Valor mínimo tipo long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo tipo long: " + Long.MAX_VALUE);

        byte byteVar = 15;
        System.out.println("byteVar = " + byteVar);
        short shortVar = 100;
        System.out.println("shortVar = " + shortVar);
        int intVar = 500;
        System.out.println("intVar = " + intVar);
        long longVar = 1000;
        System.out.println("longVar = " + longVar);

        var numero = 10L;
        System.out.println("numero = " + numero);

    }
}
