package seccion025;

public class Clase088 {
    public static void main(String[] args) {

        // Declaramos el arreglo de enteros
        int enteros [];

        //Dclaramos el arreglo de personas
        Persona personas [];

        // Instanciamos ambos arreglos
        personas = new Persona[2];
        enteros = new int [3];

        // Inicializamos los valores de ambos arreglos
        enteros[1] = 15;
        enteros[0] = 20;
        enteros[2] = 19;

        personas[0] = new Persona("Miguel","Peralta", "Díaz");
        personas[1] = new Persona("Katherine","Aliste", "Ardiles");

        //Modificamos un valor
        personas[1].setNombre("Margarita");

        //Imprimimos valores
        System.out.println("enteros[1] = " + enteros[1]);
        System.out.println("enteros[0] = " + enteros[0]);
        int mayor = 0;

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("enteros["+i+"] = " + enteros[i]);
            if (mayor < enteros[i]){
                    mayor = enteros[i];
            }
        }
        System.out.println("El numero mayor es: "+ mayor);
        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1].getNombre());
    }
}
