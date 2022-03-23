/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int num1;
		
		System.out.println("introduce un numero");
		num1 = tcl.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num1+" * "+i+" = "+num1*i);
		
		}
		
		
		
		tcl.close();
	}

}
