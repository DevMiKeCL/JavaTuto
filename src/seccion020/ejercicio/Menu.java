package seccion020.ejercicio;

import java.util.Scanner;

public class Menu {

    public void Iterador(){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Persona p1= new Persona();
        Persona p2 = new Persona();
        while (num != 4){
            System.out.println("Seleccione que desea ingresar:");
            System.out.println("1) Empleado");
            System.out.println("2) Cliente");
            System.out.println("3) Estado de Cliente");
            System.out.println("4) Salir");
            num = sc.nextInt();
            switch (num){
                case 1:
                    // se crea empleado
                    Empleado e1 = new Empleado();
                    System.out.println("Ingrese nombre de empleado");
                    e1.setNombre(sc.next());
                    System.out.println("Ingrese Dirección:");
                    e1.setDireccion(sc.next());
                    System.out.println("Ingrese Sueldo:");
                    e1.setSueldo(sc.nextInt());
                    System.out.println("Empleado Ingresado: ");
                    System.out.println(e1);
                    p1 = e1;
                    break;
                case 2:
                    //Se crea Cliente
                    Cliente c1 = new Cliente();
                    System.out.println("Ingrese nombre de cliente: ");
                    c1.setNombre(sc.next());
                    System.out.println("Ingrese dirección: ");
                    c1.setDireccion(sc.next());
                    System.out.println("Indique si es VIP: si/no ");
                    String opcion = sc.next();
                    if (opcion.equals("si")){
                        c1.setVip(true);
                    }else {
                        c1.setVip(false);
                    }
                    System.out.println("Cliente Ingresado: ");
                    System.out.println(c1);
                    p2 = c1;
                    break;
                case 3:
                    System.out.println("Estado de Empleado");
                    System.out.println(p1);
                    System.out.println("Estado de Cliente ");
                    System.out.println(p2);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                    default:
                        System.out.println("Opción no válida");
                        break;
            }

        }
    }
}
