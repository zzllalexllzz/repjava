/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio17 {

	/**
	 * @param 8args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		
		System.out.println("introduce el primer numero");
		int num1 = tcl.nextInt();
		System.out.println("introduce el segundo numero");
		int num2 = tcl.nextInt();
		//numeros pares entre los dos numeros pedidos
		for (int i=num1+1; i<num2; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		tcl.close();	
	}

}
