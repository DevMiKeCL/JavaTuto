package seccion003;

import java.util.Scanner;

public class Clase012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona tu nombre:");
        var usuario = scanner.nextLine();
        String saludar = "Saludos";
        System.out.println(saludar + " " + usuario);
    }
}
