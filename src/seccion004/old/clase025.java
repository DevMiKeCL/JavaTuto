package seccion004.old;

public class clase025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primer ejemplo de procedencia operadores");
		int x = 5;
		int y = 10;
		int z = ++x * y--;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		System.out.println("\nEjemplo Evaluacion");
		System.out.println(4 + 5 * 6 / 3);
		System.out.println((4 + 5) * (6 / 3));
		
		System.out.println("\nOtro Ejemplo Evaluacion");
		System.out.println(1 + 2 - 3 * 4 / 5);
		System.out.println(1 + 2 - (3 * (4 / 5)));
		
		System.out.println("\nOtro Ejemplo");
		//Si detecta la cadena, lo demas lo convierte en cadena
		System.out.println("1 + 2 = " + 1 + 2);
		//Los parentesis rompen esta regla, ya que tiene la mayor prioridad
		System.out.println("1 + 2 = " + (1 + 2));
		
		System.out.println("\nOtro Ejemplo");
		//El operador + es asociativo a la izquierda
		System.out.println(1 + 2 + "abc");//Detecta una operacion primero
		System.out.println("abc" + 1 + 2);//Detecta una cadena primero
		
	}

}
