package seccion025;

public class Clase085 {
    public static void main(String[] args) {
        int enteros [];
        enteros = new int [3];
        enteros[1] = 15;
        enteros[0] = 13;
        enteros[2] = 19;
        System.out.println("enteros[1] = " + enteros[1]);
        System.out.println("enteros[0] = " + enteros[0]);
        int mayor = 0;

        for (int i = 0; i <= enteros.length-1; i++) {
            System.out.println("enteros["+i+"] = " + enteros[i]);
            if (mayor < enteros[i]){
                    mayor = enteros[i];
            }
        }
        System.out.println("El numero mayor es: "+ mayor);
    }
}
