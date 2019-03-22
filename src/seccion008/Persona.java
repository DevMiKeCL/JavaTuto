package seccion008;

public class Persona {
    //Atributos de una clase
    //no es necesario asignar valores
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;

    //Metodos de la clase
    //Los usaran los objetos de esta clase
    public void desplegarNombre(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellidoPaterno = " + apellidoPaterno);
        System.out.println("apellidoMaterno = " + apellidoMaterno);
    }

}
