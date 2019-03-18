package seccion006;

public class clase031 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int mes = 4;//Mes del año
        String estacion;
        String saludo = "Hola Mundo";
        switch (mes){
            case 1: case 2: case 12:
                estacion = "Verano";
                break;
            case 3: case 4: case 5:
                estacion = "Otoño";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion = "Primavera";
                break;
            default:
                estacion = "mes incorrecto";
        }
        System.out.println("La estación para el mes " + mes + " es: " + estacion);
    }

}
