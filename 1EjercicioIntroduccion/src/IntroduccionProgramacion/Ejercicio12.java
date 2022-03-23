/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 * Realiza un programa en Java que, dadas dos variables
	 *  a y b, intercambie los valores de a y b.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=10;
		int aux;
		
		aux=a;
		a=b;
		b=aux;
		
		System.out.println("el valor de a es "+a);
		System.out.println("el valor de b es "+b);
	}

}
