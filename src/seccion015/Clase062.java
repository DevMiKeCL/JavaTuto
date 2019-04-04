package seccion015;

public class Clase062 {
    public static void main(String[] args) {
        var resultado = sumar(3, 6);
        System.out.println("resultado = " + resultado);

    }

    private static int sumar(int a, int b){
        if ( a == 0 && b == 0){
            System.out.println("Debe ingresar valores distintos a cero");
            return 0;
        }
        return a + b;
    }
}
