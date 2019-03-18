package seccion029;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contTeclado;

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++contTeclado;
    }

    @Override
    public String toString(){
        return super.toString() + " idTeclado: " +idTeclado;
    }
}
