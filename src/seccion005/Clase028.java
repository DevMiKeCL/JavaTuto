package seccion005;

public class Clase028 {
    public static void main(String[] args) {
        
        int numero = 11;
        
        var resultado = (numero % 2 == 0) ? "Es numero par" : "Es numero impar";
        System.out.println("resultado = " + resultado);

        var par = (numero % 2 == 0) ? true : false;
        if(par)
            System.out.println("numero par");
        else
            System.out.println("numero impar");

    }
}
