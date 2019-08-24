package seccion028.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclados;

    Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" +
                "idTeclado=" + idTeclado +
                '}';
    }
}
