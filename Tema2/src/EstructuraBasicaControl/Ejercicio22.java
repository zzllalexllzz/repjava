/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int num1;
		
		System.out.println("introduce un numero entero");
		num1= tcl.nextInt();
		
		for(int i=1; i<=num1; i++) {
			if(num1%i==0) {
				System.out.print(i+" ");
			}
		}
		
		tcl.close();
	}

}
