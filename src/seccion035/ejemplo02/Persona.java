package seccion035.ejemplo02;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    /**
     * es importante indicar que el orden de ejecucion de bloques de código
     * prioriza los estáticos y luego los anonimos para continuar con el contructor y sus funciones
     */

    static {
        System.out.println("Ejecuta bloque estático");
        contadorPersonas = 10;
    }

    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona = ++contadorPersonas;
    }

    Persona(){
        System.out.println("Ejecuta constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
}
