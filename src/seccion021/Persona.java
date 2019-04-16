package seccion021;

public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersona;

    private Persona(){
        this.idPersona = ++contadorPersona;
    }

    //Constructor completo sobrecarga
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
