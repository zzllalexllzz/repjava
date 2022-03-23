/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int num1;
		int pares=0;
		int inpares=0;
		
		do {
			System.out.println("introduce un numero");
			num1 = tcl.nextInt();
			if (num1%2==0 && num1!=0) {
				pares++;
			}
			if (num1%2!=0 && num1!=0) {
				inpares++;
			}
			
		}while(num1!=0);
		
		System.out.println("la cantidad de pares es "+pares);
		System.out.println("la cantidad de inpares es "+inpares);
		
		tcl.close();
	}

}
