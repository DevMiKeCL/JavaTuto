package seccion018;

public class Clase068 {
    public static void main(String [] args){
        Persona p1 = new Persona();
        //Marca error
        //No se puede acceder directamente un atributo privado desde otra clase
        //p1.nombre = "Pedro";
        //Si es posible acceder a un metodo o atributo publico desde otra clase
        //p1.obtenerNombre();

        //modificamos el atributo nombre
        p1.setNombre("MiKe");
        p1.setApellidoPaterno("DJ");
        //accedemos al atributo nombre
        System.out.println("Nombre: " + p1.getNombre() + p1.getApellidoPaterno());
    }
}