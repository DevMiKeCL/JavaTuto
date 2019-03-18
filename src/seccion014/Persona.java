package seccion014;

public class Persona {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;

    Persona(String arg1, String arg2, String arg3){
        this.nombre = arg1;
        this.apellidoPaterno = arg2;
        this.apellidoMaterno = arg3;
    }

    Persona() {

    }

    String cambiarNombre(String arg1){
        this.nombre = arg1;
        return nombre;
    }

    String obtenerNombre(){
        return nombre;
    }

    String cambiarApellidoP(String arg1){
        this.apellidoPaterno = arg1;
        return nombre;
    }

    String cambiarApellidoM(String arg1){
        this.apellidoMaterno = arg1;
        return nombre;
    }
    void imprimirNombre(){
        System.out.println("Nombre " + this.nombre);
    }
    void imprimirApellidoP(){
        System.out.println("Apellido Paterno " + this.apellidoPaterno);
    }
    void imprimirApellidoM(){
        System.out.println("Apellido Materno " + this.apellidoMaterno);
    }
}
