/**
 * 
 */
package Ampliacion;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		char caracter;
		
		System.out.println("introduce un caracter");
		caracter=tcl.nextLine().charAt(0);
		
		if (caracter>='A' && caracter<='Z') {
			System.out.println("ES MAYUSCULA");
		}
		if (caracter>='a' && caracter<='z') {
			System.out.println("es minuscula");
		}
		if (caracter>='0' && caracter<='9') {
			System.out.println("es digito");
		}
		
		//OTRO MODO
		
		if (Character.isUpperCase(caracter)) {
			System.out.println("ES MAYUSCULA");
		}
		if (Character.isLowerCase(caracter)) {
			System.out.println("es minuscula");
		}
		if (Character.isDigit(caracter)) {
			System.out.println("es digito");
		}
		
	}

}
