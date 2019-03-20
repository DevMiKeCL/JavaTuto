package seccion005;

public class Clase027 {
    public static void main(String[] args) {
        int a = 18;
        int valorMinimo = 0, valorMaximo = 10;
        if (a >= valorMinimo && a <= valorMaximo)
            System.out.println("dentro de rango");
        else
            System.out.println("Fuera de rango");

        boolean vacaciones = false;
        boolean diaDescanso = false;
        if(vacaciones || diaDescanso)
            System.out.println("Padre puede asistir al juego con el hijo");
        else
            System.out.println("padre ocupado");
    }
}
