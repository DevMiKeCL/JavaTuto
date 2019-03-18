package seccion012;

public class Clase048 {
    public static void main(String[] args){
        int alto = 2;
        int ancho = 3;
        int profundo = 6;
        Caja c = new Caja(alto, ancho, profundo);
        // se almacena la referencia del objeto c al objeto e
        Caja e = c;
        System.out.println("El volumen de la caja es: " + c.calcularVolumen());
        //se actualizan las variables locales
        alto = 3;
        ancho = 4;
        profundo = 2;
        //se crea un nuevo objeto
        Caja d = new Caja(alto, ancho, profundo);
        System.out.println("El volumen de la caja es: " + d.calcularVolumen());
        //Se asignan nuevos valores
        c = new Caja(alto, ancho, profundo);
        System.out.println("El volumen de la caja es: " + c.calcularVolumen());
        // se imprimen los valores referenciados
        System.out.println("El volumen de la caja es: " + e.calcularVolumen());

    }
}
