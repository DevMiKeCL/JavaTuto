package seccion014;

public class Clase052 {
    public static void main(String []args){
        Persona p = new Persona();
        p.cambiarNombre("Katherine");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }
    public static void modificarPersona(Persona arg){
        arg.cambiarNombre("MiKe");
    }

    public static void imprimirNombre(Persona p){
        System.out.println("Valor recibido: " + p.obtenerNombre());
    }
}
