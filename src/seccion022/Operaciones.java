package seccion022;

public class Operaciones {
    //Metodo sumar
    public static int sumar(int a, int b){
        System.out.println("Metodo sumar (int,int)");
        return a + b;
    }

    //Sobrecarga del método sumar
    public static double sumar(double a, double b){
        System.out.println("Método sumar (double, double)");
        return a + b;
    }

    //Sobrecarga del método sumar
    public static double sumar(int a, double b){
        System.out.println("Método sumar (int,double)");
        return a + b;
    }

    //Sobrecarga del método sumar
    public static double sumar(double a, int b){
        System.out.println("Método sumar (double,int)");
        return a + b;
    }

    public static int sumar(int a, int b, int c){
        System.out.println("Metodo sumar (int,int,int)");
        return a + b + c;
    }

    public static double sumar(int a, double b, int c){
        System.out.println("Metodo sumar (int,double,int)");
        return a + b + c;
    }


}
