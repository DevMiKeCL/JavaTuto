package seccion010;

public class clase051 {
    /*
    Creacion de metodos en java
     */
    public static void main(String[] args){
        //crear un objeto de la clase a llamar su método
        Aritmetica a = new Aritmetica();

        //Llamamos el método, enviando argumentos si se requieren
        //Si el método regresa un valor podemos recibirlo según el tipo
        int resultado = a.sumar(1, 2);
        System.out.println("La suma total es : " + resultado);
    }
}
