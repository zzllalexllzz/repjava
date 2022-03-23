/**
 * 
 */
package BuclesCondicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio20 {
/*
 *Programa que lea un entero positivo introducido por el usuario 
 *y que muestre por pantalla todos sus divisores
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("introduce un numero");
		int num=tcl.nextInt();
		//bucle de 1 al num dado
		for (int i = 1; i <= num; i++) {
			//condicion que si es divisible y da 0 lo imprima
			if (num%i==0) {
				System.out.println(i);
			}
		}
		
		tcl.close();
	}

}
