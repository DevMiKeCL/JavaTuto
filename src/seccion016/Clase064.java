package seccion016;

public class Clase064 {
    public static void main(String[]args){
        Persona p = new Persona("MiKe");
        p.imprimirNombre();
    }
}

class Persona{
    String nombre; // atributo de la clase

    Persona(String nombre){
        this.nombre = nombre; //this es el objeto Persona (actual)

        //imprimimos el objeto Persona
        Imprimir i = new Imprimir();
        i.imprimir(this);//this es el objeto Persona (actual)
    }

    public void imprimirNombre(){
        System.out.println("persona this.nombre = " + this.nombre);
    }
}

class Imprimir{
    public void imprimir(Object o){
        System.out.println("Imprimir parametro: " + o);//el parametro es el objeto persona
        System.out.println("Imprimir objeto actual (this): " + this);//this es el objeto imprimir actual
    }
}