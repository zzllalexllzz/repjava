/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio9 {
	/*
	 * funcion factorial de un numero
	 */
	public static int factorial(int num, int mult) {
		for(int i=2; i<=num; i++){
			mult=mult*i;
		}
		return mult;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int mult=1;
		
		System.out.println("introduce un numero");
		int num = tcl.nextInt();
		
		
		System.out.println("el factorial de " +num+ " es "+factorial(num, mult));
		
		tcl.close();
	}

}
