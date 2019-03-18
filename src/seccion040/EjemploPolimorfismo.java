package seccion040;

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Empleado emp = new Empleado("MiKe", 1500000);
        imprimirDetalles(emp);

        Gerente ger = new Gerente("Katherine", 2000000, "Finanzas");
        imprimirDetalles(ger);
    }

    /**
     * Observamos que el tipo que recube el metodo es de tipo padre (Empleado)
     * Sin embargo al momento de ehecutar el metodo, se ejecuta el del hijo (Gerente)
     * eso es el polimorfismo, multiples formas pero en tiempo de ejecución
     *
     * @param emp
     */

    private static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
