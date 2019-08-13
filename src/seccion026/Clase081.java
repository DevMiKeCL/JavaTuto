package seccion026;
// Ingreso de datos a arreglo
import java.util.Scanner;

public class Clase081 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // int [] numeros;
        int numeros[];
        int cantidad;
        int i;
        System.out.println("Ingrese cantidad de numeros a imprimir: ");
        cantidad = sc.nextInt();
        numeros = new int[cantidad];
        for (i=0; i<cantidad; i++){
            numeros[i] = i+1;
        }
        for (i=0; i<cantidad; i++){
            System.out.println(numeros[i]);
        }
    }
}
