/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int num1;
	
		System.out.println("introduce un numero positivo");
		num1 = tcl.nextInt();
		//numeros negativos desde num1 al 2
		for(int num2=2; num2<num1; num2++) {
			if (num2%2!=0) {
				System.out.println(num2);
			}
		}
		
		tcl.close();
	}

}
