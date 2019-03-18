package seccion007;

import java.util.Scanner;

public class clase037 {
    public static void main(String[] args){
        int limite = 10;
        for (int contador = 0; contador < limite; contador++){
            System.out.println("Contador = " + contador);
        }
        System.out.println("Por favor introduce el número de elementos a iterar:");
        Scanner entradaEscaner = new Scanner(System.in);
        limite = entradaEscaner.nextInt();
        for (int contador = 0; contador < limite; contador++){
            System.out.println("Contador = " + contador);
        }
    }
}
