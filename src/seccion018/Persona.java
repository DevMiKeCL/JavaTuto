package seccion018;

public class Persona {
    //Atributos privados
    private String nombre;
    private String apellidoPaterno;

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
}