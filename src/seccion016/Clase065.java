package seccion016;

public class Clase065 {
    public static void main(String[] args) {
        Person p = new Person("MiKe");

    }
}

class Person{
    String nombre;

    Person(String nombre){
        this.nombre = nombre;//this apunta a un objeto de tipo persona

        // imprimir el objeto persona
        Imprime i = new Imprime();
        i.imprime(this); // this contiene una referencia al objeto Person
    }
}

class Imprime{
    public void imprime(Person p){
        System.out.println("Impresion argumnento= " + p); // valor del objeto person
        System.out.println("Impresion Objeto actual this= " + this);//this apunta a un objeto de tipo imprimir
    }
}