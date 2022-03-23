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
public class Ejercicio15 {
/*
 * Programa (utilizando bucles) que muestre por pantalla la 
 * siguiente figura. Debe funcionar para n = número de líneas.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("introduce un numero");
		int n=tcl.nextInt();
		
		//bucle numero filas
		for (int i = 1; i<n+1 ; i++) {
			//bucle pinta los espacios
			for (int j = n+1; j>i+1 ; j--) {
				System.out.print(" ");
			}
			//bucle pinta * segun la i
			for (int k = 0; k <i; k++) {
				System.out.print("*");
			}
			//bucle pinta * 
			for (int l =1; l <i; l++) {
				System.out.print("*");
			}
			//pinta el salto de linea
			System.out.println("");
		}
		
		tcl.close();
	}

}
