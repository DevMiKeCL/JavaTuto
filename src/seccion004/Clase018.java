package seccion004;

public class Clase018 {
    public static void main(String[] args) {
        //System.out.println("bits tipo boolean: " + Boolean.SIZE);
        //System.out.println("bytes tipo boolean: " + Boolean.BYTES);
        System.out.println("Valor mínimo tipo boolean: " + Boolean.TRUE);
        System.out.println("Valor máximo tipo boolean: " + Boolean.FALSE);
        System.out.println();

        boolean booleanVar = false;
        System.out.println("booleanVar = " + booleanVar);

        if (booleanVar)
            System.out.println("La variable contiene un valor verdadero");
        else
            System.out.println("La variable contiene un valor falso");

        var edad =23;
        System.out.println("edad = " + edad);
        var adulto = edad >= 18;
        if (adulto)
            System.out.println("Eres mayor de edad, puedes pasar");
        else
            System.out.println("Eres menor de edad, no puedes pasar");
    }
}
