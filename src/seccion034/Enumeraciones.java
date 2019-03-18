package seccion034;

public class Enumeraciones {
    public enum Dias{
//        son valores constantes, por eso van en mayusculas
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }

    public static void main(String []args){
//        Valores de enumeracion
        System.out.println("Valor 1: " + Dias.LUNES);

//        Hacemos un test del día utilizado
        indicarDia(Dias.LUNES);
    }

    public static void indicarDia(Dias dias){
        switch (dias){
//            Podemos usar algun valor constante de la enumeracion directamente
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Sétimo día de la semana");
                break;
                default:
                    System.out.println("Día erróneo");
        }
    }
}
