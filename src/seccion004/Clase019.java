package seccion004;

import java.util.Scanner;

public class Clase019 {
    public static void main(String[] args) {
        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        var edad2 = Integer.parseInt("20");
        System.out.println("edad = " + edad2);

        double valorPi = Double.parseDouble("3.14");
        System.out.println("valorPi = " + valorPi);

        char c = "hola".charAt(0);
        System.out.println("c = " + c);

        var scanner = new Scanner(System.in);
        int edad3 = Integer.parseInt(scanner.nextLine());
        System.out.println("edad3 = " + edad3);

        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);

        String valorPiTexto = String.valueOf(valorPi);
        System.out.println("valorPiTexto = " + valorPiTexto);
        
        String valorPiTexto2 = "" + valorPi;
        System.out.println("valorPiTexto2 = " + valorPiTexto2);

        byte b = 10;
        short s = b;

        short s2 = 15;
        byte b2 = (byte) s2;
        System.out.println("b2 = " + b2);


        
    }
}
