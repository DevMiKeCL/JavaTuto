package seccion018;

public class Persona {
    //Atributos privados
    private String nombre;
    private String apellidoPaterno;
    private boolean borrado;

    public Persona(String nombre, String apellidoPaterno, boolean borrado){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.borrado = borrado;
    }
    //metodo público para acceder al atributo
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    //metodo público para modificar el atributo
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    //metodo público para acceder al atributo
    public String getNombre() {
        return nombre;
    }

    //metodo público para modificar el atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public String toString(){
        return "Nombre: " + nombre + " Apellido: " + apellidoPaterno + " borrado: " + borrado;
    }
}