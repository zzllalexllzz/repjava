/**
 * 
 */
package Bucles;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio5 {

	/*
	 *Programa que pida al usuario un n�mero repetidamente 
	 *hasta que el n�mero introducido est� entre 1 y 10.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		int num;
		
		
		//repite el bucle hasta introducir numeros del 1 al 10
		do {
			System.out.println("introduce un numero");
			num=tcl.nextInt();
			
		} while ((num<1)||(num>30));
		
		
		tcl.close();
	}

}
