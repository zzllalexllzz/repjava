/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio23 {
	public static  int primo (int num1, int conta) {
		for (int i=1; i<=num1; i++) {
			if((num1%i)==0) {
				conta++;
			}
		}
		return conta;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int num1;
		int conta=0;
		
		System.out.println("introducir un numero");
		num1 = tcl.nextInt();
		
		if (primo(num1,conta)<=2) {
			System.out.println("el numero es primo");
		}else {
			System.out.println("el numero no es primo");
		}
		
		
		tcl.close();
	}

}
