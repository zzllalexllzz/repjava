/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 *¿Cuáles son los valores de a y b después de ejecutar las
 * siguientes instrucciones?
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a , b, c;
		
		a = 3;
		b = 4;
		c = 2 * a * b;
		a = a + 2;
		b = c - a; 
		
		System.out.println("el valor de a: "+a);
		System.out.println("el valor de b: "+b);
	}

}
