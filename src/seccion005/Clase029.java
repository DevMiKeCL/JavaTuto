package seccion005;

import java.util.Scanner;

public class Clase029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2);
        //var resultado = (numero1 > numero2) ? "El numero mayor es:\n" + numero1 : "El numero mayor es:\n" + numero2;
        //System.out.println(resultado);
    }
}
