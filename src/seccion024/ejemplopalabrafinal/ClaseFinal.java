package seccion024.ejemplopalabrafinal;

public final class ClaseFinal {

    //Variables marcadas como finales
    public static final int varPrimitivo = 10;

    public static final Persona persona = new Persona();

    //Metodo final
    public final void metodoFinal() {

    }

    // Marca error: no se puede heredar de una clase final
    //public class ClaseHija extends ClaseFinal{}

}
