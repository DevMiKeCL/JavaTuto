package seccion040;

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

        /**
         * Observar como accedemos directamente al atributo heredado
         * debido a que se declaró como protected en la clase padre
         * y por tanto la clase hija lo hereda y accede directamente
         */

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", departamento: " + departamento;
    }
}
