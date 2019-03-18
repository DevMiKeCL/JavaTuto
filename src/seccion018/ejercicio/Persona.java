package seccion018.ejercicio;

public class Persona {
    private String nombre;
    private String apellido;
    private boolean estado;

    //Constructor vacío
    public Persona(){
    }
    //Constructor con 3 argumentos
    public Persona(String nombre, String apellido, boolean estado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado =  estado;
    }
    //Métodos públicos para acceder y/o modificar los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Método que imprime el estado del objeto
    @Override
    public String toString(){
        return "Persona{" + "nombre=" + nombre + ", apellido=" +
                apellido + ", estado=" + estado + '}';
    }

}
