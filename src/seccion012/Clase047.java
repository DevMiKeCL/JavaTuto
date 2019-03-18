package seccion012;

public class Clase047 {
    public static void main(String []args){
        //Variables locales
        int operandoA = 6;
        int operandoB = 2;

        // creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica obj1 = new Aritmetica(operandoA, operandoB);

        //Imprimir oerandos
        System.out.println("Operando A: " + operandoA + " y operando B " +operandoB);

        //Resultado de la suma
        System.out.println("\nResultado suma: " + obj1.sumar());

        //Resultado de la resta
        System.out.println("\nResultado resta: " + obj1.restar());

        //Resultado de la multiplicacion
        System.out.println("\nResultado de multiplicar: " + obj1.multiplicar());

        //Resultado de dividir
        System.out.println("\nResultado de dividir: " +obj1.dividir());
}
/*
void otroMetodo(){
    //No se puede acceder a una variable local declarada en otro metodo
    System.out.println("Valor Operando A: " + operandoA);
    }
*/
}
