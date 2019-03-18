package seccion018.ejercicio;

import java.util.Scanner;


public class Menu {
    public Menu(){
    }
    public void Iterador(){
        int num = 0;
        Persona p1 = new Persona();
        Scanner sc = new Scanner(System.in);
        while (num != 3) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1) Crear una persona ");
            System.out.println("2) Imprimir ");
            System.out.println("3) Salir");
            num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Escriba el nombre ");
                    p1.setNombre(sc.next());
                    System.out.println("Escriba el apellido ");
                    p1.setApellido(sc.next());
                    System.out.println("Escriba el estado ");
                    String estado = sc.next();
                    if (estado.equals("1")){
                        p1.setEstado(true);
                    } else {
                        p1.setEstado(false);
                    }
                    System.out.println("Datos almacenados en memoria ");
                    break;
                case 2:
                    System.out.println("Estado del objeto p1: " + p1);
                    break;
                default:
                    if (num > 3){
                        System.out.println("Número no permitido");
                    }
                    break;
            }
        }
    }
}
