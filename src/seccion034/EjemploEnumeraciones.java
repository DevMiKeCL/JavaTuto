package seccion034;

public class EjemploEnumeraciones {


    public static void main(String []args){
//        Utilizamos la enumeracion de paises
        System.out.println("Continente No. 4 : " + Continentes.AMERICA);
        System.out.println("Paises en AMERICA : " + Continentes.AMERICA.getPaises());

//        Hacemos un tes del numero de paises por continente
        indicarPaises(Continentes.AMERICA);
        imprimirContinentes();

    }

    public enum Continentes{
        AFRICA(53,1),
        EUROPA(46,2),
        ASIA(44,3),
        AMERICA(34,4),
        OCEANIA(14,5);
//        atributo de cada elemento de una enumeracion
        private int paises;
        private int idiomas;
//        Constructor de cada elemento de la enumeracion
        Continentes(int paises, int idiomas){
            this.paises = paises;
            this.idiomas = idiomas;
        }

        public int getPaises() {
            return paises;
        }

        public int getIdiomas() {
            return idiomas;
        }
    }

    public static void indicarPaises(Continentes continentes){
//        Podemos usar algun valor constante de la enumeracion directamente
        switch (continentes){
            case AFRICA:
                System.out.println("No Paises en : " + continentes + ": " + continentes.getPaises() + " y se hablan: " +continentes.getIdiomas() + " idiomas");
                break;
            case ASIA:
                System.out.println("No Paises en : " + continentes + ": " + continentes.getPaises() + " y se hablan: " +continentes.getIdiomas() + " idiomas");
                break;
            case EUROPA:
                System.out.println("No Paises en : " + continentes + ": " + continentes.getPaises() + " y se hablan: " +continentes.getIdiomas() + " idiomas");
                break;
            case AMERICA:
                System.out.println("No Paises en : " + continentes + ": " + continentes.getPaises() + " y se hablan: " +continentes.getIdiomas() + " idiomas");
                break;
            case OCEANIA:
                System.out.println("No Paises en : " + continentes + ": " + continentes.getPaises() + " y se hablan: " +continentes.getIdiomas() + " idiomas");
                break;
        }
    }

    public static void imprimirContinentes(){
//        Utilizamos Foreach
        for (Continentes c: Continentes.values()){
            System.out.println("Continente: " + c + " contiene " + c.getPaises() + " paises y se hablan: " + c.getIdiomas() + " idiomas.");
        }
    }
}
