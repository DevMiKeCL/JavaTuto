package seccion028;

public class Producto {
    private int idProducto;
    private static int contadorProducto;
    private String nombre;
    private double precio;

//    Constructor vacío
    private Producto(){
//        Asignamos el idProducto único por cada objeto creado
        this.idProducto = ++contadorProducto;
    }

//    Constructor sobrecargado de dos argumentos
    public Producto(String nombre, double precio){
//        llamamos al constructor vacío para asignar el idProducto
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "Producto{idProducto #" + idProducto + " Nombre: " + nombre + " Precio: " + precio + "}";
    }

}
