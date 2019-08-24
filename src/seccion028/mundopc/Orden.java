package seccion028.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORES = 10;

    Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORES];
    }

    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras < MAX_COMPUTADORES){
            computadoras[contadorComputadoras++]=computadora;
        } else {
            System.out.println("se ha superado el limite de computadores para la orden");
        }

    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorComputadoras ; i++) {
            total += computadoras[i].getPrecio();

        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden # ");
        System.out.println("El precio total de la orden #" + idOrden +" $ " + calcularTotal() );
        System.out.println("Articulos de la orden # " + idOrden);
        for (int i = 0; i < contadorComputadoras ; i++) {
            System.out.println(computadoras[i]);
        }

    }
}
