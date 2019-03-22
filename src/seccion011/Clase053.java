package seccion011;

public class Clase053 {
    public static void main(String[]args){
        // Creamos un objeto de la clase Aritmetica con el constructor vacío
        Aritmetica obj1 = new Aritmetica();

        //Llamamos el método sumar y recibimos el valor devuelto
        int resultado = obj1.sumar(5,4);
        System.out.println("Resultado suma directa obj1: " + resultado);

        /*
        si llamamos directamente el metodo sumar sin argumentos
        el valor es cero, ya que los atributos del objeto nunca se inicializaron
        ya que no se usó el constructor con argumentos, sino el constructor vacío
        */
        System.out.println("Resultado suma directa obj1: " + obj1.sumar());

        //Ahora creamos un objeto con el constructor con 2 argumentos

        Aritmetica obj2 = new Aritmetica(2, 1);

        /*
        Imprimimos directamente el resultado
        al llamar directamente al método sumar, nos regresa al valor de la suma
        */
        System.out.println("Resultado suma directa obj2 :" + obj2.sumar());
    }
}
