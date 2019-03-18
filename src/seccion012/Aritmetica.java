package seccion012;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    /*
    Constructor vacio
    Recordar que si agregamos un constructir distinto
    al vacio ya no se crea este constructor
    y nosotros debemos crearlo si lo necesitamos
    */
    Aritmetica(){}

    //Constructor con 2 argumentos

    Aritmetica(int arg1, int arg2){
        // uso del operador this
        this.a = arg1;
        this.b = arg2;
    }


    //Este método toma los atributos de la clase para hacer la suma
    int sumar(){
        return a + b;
    }

    //Método restar
    int restar(){
        return a - b;
    }

    //Método multiplicar
    int multiplicar(){
        return a * b;
    }

    //Método dividir
    int dividir(){
        return a / b;
    }
}
