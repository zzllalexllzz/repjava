/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ctl = new Scanner(System.in);
		int  num1;
		
		System.out.println("inserte un numero");
		num1 = ctl.nextInt();
		
		if (num1 % 2 == 0) {
            System.out.println("el numero "+num1+" es multiplo de 2");
        }
        if (num1 % 3 == 0) {
            System.out.println("el numero "+num1+" es multiplo de 3");
        }
        if (num1 % 5 == 0) {
            System.out.println("el numero "+num1+" es multiplo de 5");
        }
        if (num1 % 7 == 0) {
            System.out.println("el numero "+num1+" es multiplo de 7");
        }
		ctl.close();
	}

}
