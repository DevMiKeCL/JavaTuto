package seccion017;

class Persona {
    /*
        String nombre; //valor por default es null

        public Persona(String nombre){
            this.nombre = nombre;
        }

        public String obtenerNombre(){
            return this.nombre; // uso opcional de this
        }
*/

    private String nombre; //Uso de private en un atributo

    public Persona(String nombre){//Uso de public en un metodo
        this.nombre = nombre;
    }

    public String obtenerNombre(){//Uso de public en un metodo
        return this.nombre;
    }



}
