package seccion014;

public class Clase060 {
    public static void main(String []args){
        Persona p = new Persona();
        p.cambiarNombre("Katherine");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }

    public static void imprimirNombre(Persona p1){
        System.out.println("Valor recibido: " + p1.obtenerNombre());
    }

    public static void modificarPersona(Persona arg){
        arg.cambiarNombre("MiKe");
    }
}
