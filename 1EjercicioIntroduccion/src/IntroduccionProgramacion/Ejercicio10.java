/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 *�Qu� mostrar� el siguiente c�digo por pantalla?
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		num += num - 1 * 4 + 1;
		System.out.println(num);// sale 7
		num=4;
		num %= 7 * num % 3 * 5;
		System.out.println(num);// sale 4
	}

}
