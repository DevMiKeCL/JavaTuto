package seccion007.old;

import java.util.Scanner;

public class clase036 {
    public static void main(String[] args){
        int contador = 0;
        int limite = 10;
        do{
            System.out.println("Contador = " + contador);
            contador++;
        } while (contador < limite);
        System.out.println("Por favor introduce el número de elementos a iterar:");
        Scanner entradaEscaner = new Scanner(System.in);
        limite = entradaEscaner.nextInt();
        contador = 0;
        do{
            System.out.println("Contador = " + contador);
            contador++;
        } while (contador < limite);
    }
}
