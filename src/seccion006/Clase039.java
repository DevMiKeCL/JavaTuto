package seccion006;

import java.util.Scanner;

public class Clase039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione mes del año:");
        int mes = Integer.parseInt(scanner.nextLine());
        String estacion;

        switch (mes){
            case 1: case 2: case 12:
                estacion = "Verano";
                break;
            case 3: case 4: case 5:
                estacion = "Otoño";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion = "Primavera";
                break;
            default:
                estacion = "mes inválido";
                break;

        }
        System.out.println("estacion = " + estacion);

    }
}
