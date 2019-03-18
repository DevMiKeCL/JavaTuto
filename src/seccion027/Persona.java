package seccion027;

public class Persona {
    private String nombre;
    private String spellido;


    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Persona{nombre= " + getNombre() + "}";
    }
}
