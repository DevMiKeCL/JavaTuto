package seccion014;

public class Clase051 {
    //paso de parámetros por valor

    public static void main(String[]args){
        int x = 10;
        imprimir(x);
        cambiarValor(x);
        imprimir(x);
    }
    public static void cambiarValor(int i){
        i=200;
    }

    public static void imprimir(int arg){
        System.out.println("Valor recibido: " + arg);
    }
}
