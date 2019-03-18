package seccion024.ejemplopalabrafinal;

public class EjemploPalabraFinal {
    public static void main(String[] args){
//        Marca error, no se puede modificar el valor de una variable final
//        ClaseFinal.varPrimitivo = 15;
//        No es pósible cambiar la referencia de la variable persona
//        ClaseFinal.persona = new Persona();
        System.out.println("Nombre persona: " + ClaseFinal.persona.getNombre());

//        pero si es posible cambiar el estado del objeto
//        referenciado por la variable persona
        ClaseFinal.persona.setNombre("MiKe");
//
        System.out.println("Nombre persona: " +ClaseFinal.persona.getNombre());
    }
}
