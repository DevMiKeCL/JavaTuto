package seccion021;

public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersona;

    public Persona(){
        this.idPersona = ++contadorPersona;
    }

    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " Edad: " + edad + " idPersona: " + idPersona;
    }
}
