package seccion020.ejercicio;

public class Empleado extends Persona{
    private String direccion;
    private int sueldo;

    public Empleado(){

    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " Direccion: " + direccion + " idPersona: " + getIdPersona() + " Fecha: " + getFechaRegistro() + " Sueldo: " + sueldo ;
    }

}
