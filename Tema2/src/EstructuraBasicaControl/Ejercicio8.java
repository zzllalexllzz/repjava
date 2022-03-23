/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int num1;
		//introducimos por teclado el numero
		System.out.println("introduce un numero positivo");
		num1= tcl.nextInt();
		//bucle de dobles
		System.out.println("--------dobles--------");
		for (int i=1; i<=num1; i++) {
			System.out.println(2+" * "+i+" = "+2*i);
		}
		//bucle de triples
		System.out.println("--------triples--------");
		for (int i=1; i<=num1; i++) {
			System.out.println(3+" * "+i+" = "+3*i);
		}
		
		tcl.close();
	}

}
