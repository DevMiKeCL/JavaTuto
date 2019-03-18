package seccion015;

public class Clase054 {
    public static void main(String []args){
        int resultado = sumar(3, 6);
        System.out.println("Resultado: " + resultado);
        resultado = sumar(0, 0);
        System.out.println("Resultado: " + resultado);
        resultado = sumar(3, 2);
        System.out.println("Resultado: " + resultado);
    }

    public static int sumar(int a, int b){
        if (a == 0 && b == 0){
            System.out.println("Puede proporcionar valores distintos a cero");
            return 0;
        }
        return a + b;

    }
}
