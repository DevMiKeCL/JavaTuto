package seccion012;

public class Caja {
    //Inicializamos las variables
    int alto;
    int ancho;
    int profundo;

    //Constructor Vacío
    //Caja(){}

    //Constructor con 3 argumentos
    Caja(int arg1, int arg2, int arg3){
        this.alto = arg1;
        this.ancho = arg2;
        this.profundo = arg3;
    }

    int calcularVolumen(){
        return alto * ancho * profundo;
    }

}
