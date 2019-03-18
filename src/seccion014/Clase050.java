package seccion014;

import java.util.Scanner;

public class Clase050 {
    public static void main(String[]args){
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);
        //System.out.println(p.nombre);
        int num = 1;
        while (num != 3) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1) Crear una persona ");
            System.out.println("2) Imprimir ");
            System.out.println("3) Salir");

            num = sc.nextInt();
            switch (num){
                case 1:
                    limpiarPantalla();
                    sc.nextLine();
                    System.out.println("Escriba el nombre ");
                    String nombre = sc.nextLine();
                    System.out.println("Escriba el apellido paterno ");
                    String apellidoP = sc.nextLine();
                    System.out.println("Escriba el apellido materno ");
                    String apellidoM = sc.nextLine();
                    Persona x = new Persona(nombre, apellidoP, apellidoM);
                    p = x;

                    System.out.println("Nombre Almacenado en memoria ");
                    limpiarPantalla();
                    break;
                case 2:
                    limpiarPantalla();
                    p.imprimirNombre();
                    p.imprimirApellidoP();
                    p.imprimirApellidoM();

                    break;
                    default:
                        if (num > 3){
                            System.out.println("Número no permitido");
                        }
                        break;


            }
        }
    }
    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
