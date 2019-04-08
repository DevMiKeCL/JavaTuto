package seccion015.old;

public class Clase055 {
    //Return usando tipos object

    public static void main(String []args){
        Operatoria o = craObjetoOp();
        int resultado = o.a + o.b;
        System.out.println("Resultado: " + resultado);
    }

    public static Operatoria craObjetoOp(){
        Operatoria o = new Operatoria(3,4);
        return o;
    }
}

class Operatoria{
    int a;
    int b;

    Operatoria(int a, int b){
        this.a = a;
        this.b = b;
    }
}
