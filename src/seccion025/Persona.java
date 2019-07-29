package seccion025;

public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    Persona(String arg1, String arg2, String arg3) {
        this.nombre = arg1;
        this.apellidoPaterno = arg2;
        this.apellidoMaterno = arg3;
    }

    Persona() {

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido paterno='" + apellidoPaterno + '\'' +
                ", apellido materno='" + apellidoMaterno + '\'' +
                '}';
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
}
