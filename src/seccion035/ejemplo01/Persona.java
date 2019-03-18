package seccion035.ejemplo01;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
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
