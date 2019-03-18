package seccion029;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private static int contRaton;

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++contRaton;
    }

    @Override
    public String toString(){
        return super.toString() + " idRaton: " + idRaton;
    }
}
