package seccion038.paquete2;

import seccion038.paquete1.Clase1;

public class Clase3 extends Clase1 {

    public Clase3(){
        /**
         * Constructor protegido, al ser una subclase puede acceder
         * aunque esté en otro paquete
         */
        super(1,2);
        /**
         * Accesp package, y al estar fuera de paquete esta restringido
         * super(1,2,3);
         * Acceso privado restringido
         * super(1,2,3,4);
         */
    }

    public void pruebaDesdeClase3(){
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo público: " + c1.atrPublico + " o heredado " + atrPublico);
        System.out.println("Atributo protegido Heredado: " + atrProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: acceso negado");
//        Constructor publico
        new Clase1();
        /**
         * Los demás constructores no se puede probar así, sino desde el constructor de esta clase
         * ya que está en una subclase en otro paquete
         */
        System.out.println("");
        System.out.println("Método publico:" + c1.metodoPublico());
        System.out.println("Método protegido:" + metodoProtegido());
        System.out.println("Método default: No se puede acceder desde un paquete externo");
        System.out.println("Método privado: Acceso negado");

    }



}
