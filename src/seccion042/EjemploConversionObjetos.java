package seccion042;

import seccion039.EjemploSobreEscritura;

public class EjemploConversionObjetos {

    public static void main(String []args) {
//        Creamos un tipo de mas alta jeraquía
        Empleado empleado;
//        asignamos una referencia de un objeto de menor jerarquía
//        es es upcasting, no hay necesidad de notacion especial
        empleado = new Escritor("Roy", 15000, TipoEscritura.MODERNO);

//        Sin embargo si quisieramos acceder al detalle de la clase Escritor
//        No es posible, ya que esas características no estan en comun
//        entre todas las clases de la jerarquia de clases
//        empleado.getTipoDeEscrituraEnTexto();
//        System.out.println("Probando Downcasting: ");
//        System.out.println(((Escritor)empleado).getTipoDeEscrituraEnTexto());


//        Imprimirmos los detalles de un metodo genérico
        imprimirDetalles(empleado);


//        Podemos hacer lo mismo con la clase Gerente
//        Esto es upcasting, por lo que no requiere una sintaxis especial
        empleado = new Gerente("Laura", 18000, "Sistemas");

//        Pero si queremos acceder directo por la variable empreado
//        al detalle del objeto Gerente no es posible, se pierde el acceso
//        empleado.getDepartamento();

//        Utilizamos el mismo metodo para imprimir los detalles
        imprimirDetalles(empleado);



//        Metodo genérico para imprimir los detalles de la jerarquía Empleado
    }

        private static void imprimirDetalles(Empleado empleado){
            String resultado = null;
//            Imprimir detalles es general para todos ya que es por polimorfismo
//            no se necesita de ninguna conversion
            System.out.println("\nDetalle: " + empleado.obtenerDetalles());

//            Pero los detalles de cada clase debemos hacer un downcasting
            if (empleado instanceof Escritor){
//                Convertimos el objeto al tipo inferior deseado
//                Convierte objeto - downcasting
//                Escritor escritor = (Escritor) empleado;
//                Finalmente podemos acceder a los metodos de la clase Escritor
//                resultado = escritor.getTipoDeEscrituraEnTexto();
                resultado = ((Escritor) empleado).tipoEscritura.getDescripcion();
                System.out.println("Resultado tipoEscritura: " + resultado);
            } else if (empleado instanceof Gerente){
//                Hacemos el downcasting en la misma linea de código
//                nos ahorramos una variable
                resultado = ((Gerente) empleado).getDepartamento();
                System.out.println("Resultado departamento: " + resultado);

            }
        }
}
