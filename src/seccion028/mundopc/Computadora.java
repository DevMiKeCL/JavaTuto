package seccion028.mundopc;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private double precio;
    private static int contadorComputadoras;

    Computadora(){
        this.idComputadora = ++contadorComputadoras;
    }

    Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton, double precio){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ", monitor=" + monitor +
                ", teclado=" + teclado +
                ", raton=" + raton +
                ", precio=" + precio +
                '}';
    }
}
