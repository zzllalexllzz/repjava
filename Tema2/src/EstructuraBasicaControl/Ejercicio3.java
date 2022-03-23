/**
 * 
 */
package EstructuraBasicaControl;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ctl = new Scanner(System.in);
		int num1;
		System.out.println("introduce un numero positivo");
		
		
	try {
		num1 = ctl.nextInt();
		switch (num1) {
			case 1:
				System.out.println(num1+" uno");
				break;
			case 2:
				System.out.println(num1+"  dos");
				break;
			case 3:
				System.out.println(num1+"  tres");
				break;
			case 4:
				System.out.println(num1+" cuatro");
				break;
			case 5:
				System.out.println(num1+"  cinco");
				break;
			case 6:
				System.out.println(num1+"  seis");
				break;
			case 7:
				System.out.println(num1+"  siete");
				break;
			case 8:
				System.out.println(num1+"  ocho");
				break;
			case 9:
				System.out.println(num1+"  nueve");
				break;
			default:
				System.out.println("numero no es positivo o no es un numero");	
		}
	
	}catch (InputMismatchException ex) {
		System.out.println("Error: no es un numero");
	}
		
		ctl.close();
	}

}
