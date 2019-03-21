package seccion006;

public class Clase037 {
    public static void main(String[] args) {
        var numero = 0;
        var texto = "numero desconocido";

        switch (numero){
            case 1:
                texto = "numero uno";
                break;
            case 2:
                texto = "numero dos";
                break;
            case 3:
                texto = "numero tres";
                break;
            default:
                texto = "numero desconocido";
                break;
        }
        System.out.println("texto = " + texto);
    }
}
