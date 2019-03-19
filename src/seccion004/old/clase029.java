package seccion004.old;

public class clase029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejemplo IF
		int x = 10;
		
		if (x < 20) {
			System.out.println("X menor que 20\n");
		}
		
		//Ejemplo IF-ELSE
		
		x = 30;
		if (x < 20) {
			System.out.println("X menor que 20\n");
		} else {
			System.out.println("X mayor que 20\n");
		}
		
		//Ejemplo IF-ELSE IF-ELSE
		
		x = 10;
		if (x == 10) {
			System.out.println("X igual a 10\n");
		} else if (x == 20){
			System.out.println("X igual a 20\n");
		} else if (x == 30) {
			System.out.println("X igual a 30\n");
		} else {
			System.out.println("X no es igual ni a 10, ni 20, ni 30\n");
		}
	}

}
