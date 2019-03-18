package seccion020.ejercicio;

import java.util.Date;

public class Persona {
    private String nombre;
    private int idPersona;
    private Date fechaRegistro;
    private static int contadorPersona;

    public Persona(){
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        setIdPersona();
        setFechaRegistro();
    }

    public String getNombre() {
        return nombre;
    }

    private void setFechaRegistro() {
        this.fechaRegistro = new Date();
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    private void setIdPersona() {
        this.idPersona = ++contadorPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString(){
        return "nombre: " + nombre + " idPersona: " + idPersona + " Fecha: " + fechaRegistro;
    }

}
