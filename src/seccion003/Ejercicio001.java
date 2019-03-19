package seccion003;

import java.util.Scanner;

public class Ejercicio001 {
    public static void main(String[] args) {
        String color;
        color = "Rojo";
        System.out.println(color);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);

    }
}
