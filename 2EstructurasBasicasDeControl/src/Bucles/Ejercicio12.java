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
public class Ejercicio12 {
/*
 *Haz un método que transforme un número entero pasado como 
 *parámetro a su correspondiente número en formato romano 
 *(String). Ejemplo: 1973 → MCMLXXIII. Recordamos la 
 *correspondencia decimalromano:
 */
	public static int name(int num) {
		 
		return num;	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("introduce un numero entero");
		int num=tcl.nextInt();
		
		
		tcl.close();
	}

}
