package seccion038.paquete1;

/**
 * Clase2 se encuentra en el mismo paquete de Clase1 y no funcionará los atributos y funciones de acceso privado
 */

public class Clase2 {

    public Clase2(){
//        Prueba constructores
        System.out.println("");
//        Constructor publico
        new Clase1(1);

//        Constructor protegido
        new Clase1(1,2);

//        Constructor default o package
        new Clase1(1,2,3);

//        Constructor private
//        new Clase1(1, 2,3, 4);
        System.out.println("Constructor private: acceso negado");
    }

    public void pruebaDesdeClase2(){
//        Acceso a Clase1 desde Clase2
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico:" + c1.atrPublico);
        System.out.println("Atributo protegido:" + c1.atrProtegido);
        System.out.println("Atributo default:" + c1.atrPaquete);
//        System.out.println("Atributo privado: " + c1.atrPrivado);
        System.out.println("Atributo privado: Acceso negado");

        System.out.println("");
        System.out.println("Método publico:" + c1.metodoPublico());
        System.out.println("Método protegido:" + c1.metodoProtegido());
        System.out.println("Método default:" + c1.metodoPaquete());
        System.out.println("Método privado: Acceso negado");

    }
}
