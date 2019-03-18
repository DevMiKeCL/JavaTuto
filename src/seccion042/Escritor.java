package seccion042;

public class Escritor extends Empleado {
//    Utilizamos una enumeracion para las opciones de tipo de escritura
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    /**
     * Observamos que para no repetir codigo, podemos utilizar
     * el metodo del padre y solo agregar a este metodo de la clase hija
     * es es invocar un metedo sobreescrito
     */

    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String getTipoDeEscrituraEnTexto(){
        return tipoEscritura.getDescripcion();
    }
}
