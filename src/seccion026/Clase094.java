package seccion026;

public class Clase094 {
    public static void main(String[] args) {
        // Declaramos una matriz de enteros
        int edades[][];
        // instanciamos la matriz de enteros
        edades = new int[3][2];
        // inicializamos los valores de la matrz de enteros
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        // imprimimos los valores a la salida estandar
        // leemos los valores de cada elementos de la matriz
        System.out.println("Matriz enteros indice 0-0: " + edades[0][0]);
        System.out.println("Matriz enteros indice 0-1: " + edades[0][1]);
        System.out.println("Matriz enteros indice 1-0: " + edades[1][0]);
        System.out.println("Matriz enteros indice 1-1: " + edades[1][1]);
        System.out.println("Matriz enteros indice 2-0: " + edades[2][0]);
        System.out.println("Matriz enteros indice 2-1: " + edades[2][1]);


        for (int i = 0; i < edades.length; i++){
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("Matriz indice: " + i + " - " + j + " = " + edades[i][j]);
            }
        }
    }
}
