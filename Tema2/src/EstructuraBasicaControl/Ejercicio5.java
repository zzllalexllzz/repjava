/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int num1;
		
		do {
			System.out.println("introduce un numero");
			num1 = tcl.nextInt();
		}while(num1<1 || num1>10);
		
		tcl.close();
	}

}
