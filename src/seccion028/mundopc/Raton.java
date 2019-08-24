package seccion028.mundopc;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private static int contadorRatones;

    Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" +
                "idRaton=" + idRaton +
                '}';
    }
}
