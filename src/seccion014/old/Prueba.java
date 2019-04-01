package seccion014.old;

import java.util.Scanner;

public class Prueba {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre ");
        String nombre = sc.nextLine();
        System.out.println("Escriba el apellido paterno ");
        String apellidoP = sc.nextLine();
        System.out.println("Escriba el apellido materno ");
        String apellidoM = sc.nextLine();
        System.out.println("Hola " + nombre + " " + apellidoP + " " + apellidoM);
    }
}
