package OCA;

public class inicio {
    public static void main(String[] args) {
        int numero;
        numero = 0b10; //binario
        System.out.println("numero binario = " + numero);
        numero = 017; // octal
        System.out.println("numero octal = " + numero);
        numero = 0x9f; //hexadecimal
        System.out.println("numero hexadecimal = " + numero);
        numero = 38; // decimal
        System.out.println("numero decimal = " + numero);
        numero = 1_000_000;
        System.out.println("numero = " + numero);
        String reference = "Hello";
        int len = reference.length();
        System.out.println("len = " + len);
        int i1 = 0, i2 = 0, i3 = 0;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);

        boolean b1, b2;
        String s1 = "1", s2;
        double d1, d2; // no permite double d1, double d2;
        int n1; int n2;
        int n3; int i4;
        String string = "hola";
        System.out.println("string = " + string);

        int okidentifier;
        int $OK2Identifier;
        int _alsoOK1d3ntifi3r;
        int __SStillOkbutKnotsonice$;





    }

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2; //Understanding Variable Scope 33
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
}
