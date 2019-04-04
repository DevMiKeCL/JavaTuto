package seccion015;

public class Clase060 {
    public static void main(String []args){
        int resultado = sumar(3,6);
        System.out.println("Resultado: " + resultado);
        Suma s = crearObjetoSuma();
        resultado = s.a + s.b;
        System.out.println("Resultado: " + resultado);
    }
    public static int sumar(int a, int b){
        return a + b;
    }
    public static Suma crearObjetoSuma(){
        Suma s = new Suma(3, 4);
        return s;
    }

}

class Suma{
    int a;
    int b;

    Suma(int a, int b){
        this.a = a;
        this.b = b;
    }
}