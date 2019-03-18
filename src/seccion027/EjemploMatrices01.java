package seccion027;

public class EjemploMatrices01 {
    public static void main(String []args){
//        Declaramos una matriz de enteros
        int edades[][];
//        instanciamos la matriz de enteros
        edades = new int[3][2];
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

//        Imprimos los valores a la salida estándar
//        leemos los valores de cada elementos de la matriz
        System.out.println("Matriz de enteros indice 0-0: " + edades[0][0]);
        System.out.println("Matriz de enteros indice 0-1: " + edades[0][1]);
        System.out.println("Matriz de enteros indice 1-0: " + edades[1][0]);
        System.out.println("Matriz de enteros indice 1-1: " + edades[1][1]);
        System.out.println("Matriz de enteros indice 2-0: " + edades[2][0]);
        System.out.println("Matriz de enteros indice 2-1: " + edades[2][1]);

        System.out.println("Largo de filas: " + edades.length);
        System.out.println("Largo de columnas: " + edades[0].length);

//        recorrido de fila
        for (int i=0; i < edades.length; i++){

//            recorrido de columna
            for (int j=0; j < edades[0].length; j++){
                System.out.println("Matriz de enteros indice {" + i + "," + j +"} =" + edades[i][j]);
            }
        }

//        Declaramos e instanciamos una matriz de personas
        Persona personas[][] = new Persona[3][2];
//        inicializamos los valores de la matriz de personas
        personas[0][0] = new Persona("Miguel");
        personas[0][1] = new Persona("Michael");
        personas[1][0] = new Persona("Maximiliano");
        personas[1][1] = new Persona("Katherine");
        personas[2][0] = new Persona("Cristina");
        personas[2][1] = new Persona("Ana");

        //        recorrido de fila
        for (int i=0; i < personas.length; i++){

//            recorrido de columna
            for (int j=0; j < personas[0].length; j++){
                System.out.println("Matriz de personas indice {" + i + "," + j +"} " + personas[i][j]);
            }
        }

//        Matriz de tipo String, notacion simplificada
        String nombres[][] = {{"Teresa", "Cesar", "William"}, {"Yesenia", "Esteban", "Maria"}};
        System.out.println("");
        System.out.println("Largo de filas en matriz: " + nombres.length);
        System.out.println("Largo de columna en matriz: " + nombres[0].length);

        //        recorrido de fila
        for (int i=0; i < nombres.length; i++){

//            recorrido de columna
            for (int j=0; j < nombres[0].length; j++){
                System.out.println("Matriz de personas indice {" + i + "," + j +"} " + nombres[i][j]);
            }
        }


    }
}
