package seccion037;

public class AutoboxingUnboxing {
    public static void main(String []args){
//        Autoboxing (se convierten de tipos primitvos a tipos object
        Integer enteroObj = 10;
        Float flotanteObj = 15.2F;
        Double dobleObj = 40.1;
        System.out.println("Autoboxing");
        System.out.println("Entero Obj " + enteroObj.intValue());
        System.out.println("Flotante Obj " + flotanteObj.intValue());
        System.out.println("Double Obj " + dobleObj.intValue());
//        Unboxing (se convierten de objetos a tipos primitivos)
        int entero = enteroObj;
        float flotante = flotanteObj;
        double doble = dobleObj;
        System.out.println("\nUnboxing");
        System.out.println("Entero " + entero);
        System.out.println("Flotante " + flotante);
        System.out.println("Double " + doble);
    }
}
