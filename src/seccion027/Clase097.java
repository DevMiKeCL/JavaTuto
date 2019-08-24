package seccion027;

public class Clase097 {
    public static void main(String[] args) {
        //creamos varios objetos de tipo producto
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalón", 100);
        // creamos un objeto de tipo orden
        Orden orden1 = new Orden();
        //Agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        //imprimimos la orden
        orden1.mostrarOrden();
    }
}
