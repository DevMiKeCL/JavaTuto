package seccion028.mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    Monitor(){
        this.idMonitor = ++contadorMonitores;
    }

    Monitor(String marca, double tamano){
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamano=" + tamano +
                '}';
    }
}

