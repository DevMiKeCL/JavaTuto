package seccion042;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

//    sobreescribimos el metodo padre heredado
    @Override

    /**
     * Observamos que para no repetir codigo, podemos utilizar
     * el metodo del padre y solo agregar a este metodo de la clase hija
     * es es invocar un metodo sobreescrito
     */
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", departamento: " + departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
