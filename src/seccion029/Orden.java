package seccion029;

public class Orden {
    private final int idOrden;
    private final Computadora computadoras[];
    private static int contadorOrden;
    private int contadorComputador;
    private static final int MAX_COMPUTADORES = 10;

    public Orden(){
        this.idOrden = ++contadorOrden;
        computadoras = new Computadora[MAX_COMPUTADORES];
    }

    public void agregarPC(Computadora computador){
        if (contadorComputador < MAX_COMPUTADORES){
            computadoras[contadorComputador++] = computador;
        } else {
            System.out.println("Se ha superado el limite de computadores para la orden");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i=0; i < contadorComputador; i++){
            total += computadoras[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden #" + idOrden);
        System.out.println("Precio total de la Orden #" + idOrden + " : $" + calcularTotal());
        System.out.println("Articulos de la orden Orden #" + idOrden + ":");
        for (int i=0; i < contadorComputador; i++){
            System.out.println(computadoras[i]);
        }
    }

}
