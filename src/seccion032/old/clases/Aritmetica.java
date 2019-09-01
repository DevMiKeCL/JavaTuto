package seccion032.old.clases;
/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar, etc
 * @author : Miguel Peralta
 * @version : 1.0
 */
public class Aritmetica {
    /**
     * Primer operando
     */
    int operandoA;
    /**
     * segundo operando
     */
    int operandoB;
    /**
     * Constructor de la clase
     */
    public Aritmetica(){

    }

    /**
     *
     * @return: operatorias
     */

    public Aritmetica(int operandoA, int operandoB){
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }

    public int sumar(){
        return operandoA + operandoB;
    }

    public int restar(){
        return operandoA - operandoB;
    }

    public double dividir(){
        return operandoA / operandoB;
    }

    public int multiplicar(){
        return operandoA * operandoB;
    }

}
