package seccion021;

public class Empleado extends Persona {
    private double sueldo;


    public Empleado(String nombre, int edad, double sueldo){
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "sueldo=" + sueldo +
                '}';
    }
}
