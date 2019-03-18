package seccion020.ejercicio;

public class Cliente extends Persona{
    private boolean vip;
    private String direccion;

    public Cliente(){
        this.vip = false;
    }

    public Cliente(String nombre, String direccion){
        super(nombre);

//        setFechaRegistro();
//        setIdPersona();
        this.direccion = direccion;
        this.vip = false;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " Direccion: " + direccion + " idPersona: " + getIdPersona() + " Fecha: " + getFechaRegistro() + " Estado Vip: " + isVip() ;
    }
}
