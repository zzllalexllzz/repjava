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
public class Ejercicio13 {
/*
 *Programa (utilizando bucles) que muestre por pantalla la 
 *siguiente figura. Debe funcionar para n = número de líneas.
 *
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("introduce un numero");
		int n=tcl.nextInt();
		
		//bucle numero de lineas
		for (int i = 0; i <n ; i++) {
			//bucle pinta un * segun la i
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			//pinta el salto de linea
			System.out.println(" ");
		}
		tcl.close();
	}

}
