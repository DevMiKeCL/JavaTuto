package seccion026;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;


    public Persona(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre;
    }
}
