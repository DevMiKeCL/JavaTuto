package seccion026;

public class Clase095 {
    public static void main(String[] args) {
        // declarar una matriz de int
        int edades[][];
        // instanciar la matriz int
        edades = new int [3][2];
        //instanciar los valores de la matriz
        edades[0][0]= 30;
        edades[0][1]= 15;
        edades[1][0]= 20;
        edades[1][1]= 45;
        edades[2][0]= 5;
        edades[2][1]= 38;

        // imprimir
        System.out.println("edades[1][3] = " + edades[1][1]);
        System.out.println("edades[2][1] = " + edades[2][1]);

        //declarar e instanciar matriz de tipo object
        Persona personas[][] = new Persona[1][2];
        //Inicializamos valores
        personas[0][0] = new Persona("Miguel", "Peralta", 38);
        personas[0][1] = new Persona("Katherine", "Aliste", 33);

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("matriz personas["+i+"]["+j+"] " + personas[i][j]);
            }

        }
    }
}
