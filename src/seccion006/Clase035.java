package seccion006;

public class Clase035 {
    public static void main(String[] args) {
        var numero = 2;
        var texto = "numero desconocido";

        if (numero == 1) {
            texto = "numero uno";
        }
        else if(numero == 2){
            texto = "numero dos";
        }
        else if (numero == 3) {
            texto = "numero tres";
        }
        else {
            texto = "numero desconocido";
        }

        System.out.println("texto = " + texto);
    }
}
