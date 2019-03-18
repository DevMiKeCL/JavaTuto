package seccion039;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles() {
        /**
         * Observar como accedemos directamente al atributo heredado
         * debido a que se declaró como protected en la clase padre
         * y por tanto la clase hija lo hereda y accede directamente
         */
        return "Nombre: " + nombre + ", sueldo: " + sueldo + ", departamento: " + departamento;
    }

}
