package seccion015;

public class Clase063 {
    public static void main(String[] args) {
        Sumatoria s = creaObjetoSumatoria();
        int resultado = s.a + s.b;
        System.out.println("resultado = " + resultado);
    }
    public static Sumatoria creaObjetoSumatoria(){
        Sumatoria s = new Sumatoria(3, 4);
        return s;
    }

}

class Sumatoria{
    int a;
    int b;

    Sumatoria(int a, int b){
        this.a = a;
        this.b = b;

    }

}