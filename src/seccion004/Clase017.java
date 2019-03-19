package seccion004;

public class Clase017 {
    public static void main(String[] args) {
        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo char: " + Character.BYTES);
        System.out.println("Valor mínimo tipo char: " + Character.MIN_VALUE);
        System.out.println("Valor máximo tipo char: " + Character.MAX_VALUE);
        System.out.println();

        char c = '@';
        System.out.println("c = " + c);
        char u = '\u03c0';
        System.out.println("u = " + u);

        var b = '!';
        System.out.println("b = " + b);

        var x = '\u21d4';
        System.out.println("x = " + x);

    }
}
