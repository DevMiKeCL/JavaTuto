/**
 * 
 */
package seccion004;

/**
 * @author Miguel
 * Manejo de variables
 */
public class clase020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables Boolean, declaracion
		boolean bool1;
		bool1 = true;
		//Declaracion e inicializacion
		boolean bool2 = false;
		System.out.println("Valor bool1: " + bool1);
		System.out.println("Valor bool2: " + bool2);
		System.out.println("");
		
		//Variables byte
		byte b1 = 10;
		//Literal en hexadecimal
		byte b2 = 0xa;
		System.out.println("Valor byte b1: " + b1);
		System.out.println("Valor byte b2: " + b2);
		System.out.println("");
		
		//Variables short
		short s1 = 2;
		System.out.println("Valor short s1: " + s1);
		System.out.println("");
		
		//Variable char, declaracion e inicializacion en una sola linea
		//La primera declaracion es en UNICODE
		
		char ch1 = 65, ch2 = 'A';
		System.out.println("Valor char ch1: " + ch1);
		System.out.println("Valor char ch2: " + ch2);
		System.out.println("");
		
		//Variables enteras
		int decimal = 100;
		int octal = 0144; //Valor octal se inicia con 0
		int hexa = 0x64; //Valor hexadecimal se inica en 0x
		System.out.println("Valor int decimal: " + decimal);
		System.out.println("Valor int octal: " + octal);
		System.out.println("Valor int hexa: " + hexa);
		System.out.println("");
		
		//Variables long
		long long1 = 10, long2 = 20L;
		System.out.println("Valor long long1: " + long1);
		System.out.println("Valor long long2: " + long2);
		System.out.println("");
		
		//Variables float
		float f1 = 15, f2 = 22.3F;
		System.out.println("Valor float f1: " + f1);
		System.out.println("Valor float f2: " + f2);
		System.out.println("");
		
		//Variables double
		double d1 = 11.0, d2 = 30.15D;
		System.out.println("Valor double d1: " + d1);
		System.out.println("Valor double d2: " + d2);
		System.out.println("");
		
	}

}
