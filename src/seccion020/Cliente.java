package seccion020;

import java.util.Date;

public class Cliente extends Persona {
    private java.util.Date fechaRegistro;
    private int idCliente;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean vip){
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }


    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" +
                "fechaRegistro=" + fechaRegistro +
                ", idCliente=" + idCliente +
                ", vip=" + vip +
                '}';
    }
}
