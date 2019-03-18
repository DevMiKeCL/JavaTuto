package seccion007;

import java.util.Scanner;

public class clase035 {
    public static void main(String[] args){
        int contador = 0;
        int limete = 10;
        while (contador <= limete){
            System.out.println("Contador = " + contador);
            contador++;
        }

        System.out.println("Por favor introduce el número de elementos a iterar:");
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in); // creacion de objeto Scanner para leer datos
        maxElementos = entradaEscaner.nextInt(); //Leemos el valor proporcionado por el usuario
        contador = 0; //Inicializamos el contador
        while (contador <= maxElementos){
            System.out.println("Contador = " + contador);
            contador++;
        }
    }
}
