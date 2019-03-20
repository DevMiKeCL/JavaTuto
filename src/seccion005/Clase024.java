package seccion005;

public class Clase024 {
    public static void main(String[] args) {
        int a = 3, b = 2;
        int c = a;
        a += 1; // a = a + 1;
        System.out.println("a = " + a);

        a+= 3; //a = a + 3;
        System.out.println("a = " + a);

        b -= 1; //b = b -1;
        System.out.println("b = " + b);

        a /= c;
        System.out.println("a = " + a);
    }
}
