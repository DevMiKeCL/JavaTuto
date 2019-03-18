package seccion019;

public class Clase062 {

    public static void main(String []args){
        Persona p1 = new Persona("MiKe");
        Persona p2 = new Persona("Katty");
//        Persona p2 = new Persona("MiKe");
        System.out.println(p1);
        System.out.println(p2);
//        imprimimos el contaorPersonas
        System.out.println("No. Personas: " + Persona.getContadorPersonas());
    }

}

class Persona{
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;

    public Persona (String nombre){
//        Cada vez que creamos un objeto persona incrementamos el contrador para obtener un nuevo idPersona
        contadorPersonas++;
//        asignamos el nuevo valor al idPersona
        idPersona = contadorPersonas;
//        asignamos el nombre recibido
        this.nombre = nombre;
    }

    public static int getContadorPersonas(){
        return contadorPersonas;
    }

    public String toString(){
        return "Persona[idPersona: " + idPersona + ", nombre: " + nombre +"]";
    }
}
