package seccion032;

/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar, etc
 *
 * @author Miguel Peralta
 * @version 1.0
 */

public class Aritmetica {
    /**
     * Primer operando
     */
    int operandoA;
    /**
     * Segundo operando
     */
    int operandoB;
    /**
     * Constructor vacío de la clase
     */
    public Aritmetica(){
    }

    /**
     * Este método realiza la suma de dos operandos enteros
     * @return int resultado de la suma
     */

    public Aritmetica(int operandoA, int operandoB){
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    public int sumar(){
        return operandoA + operandoB;
    }

}
