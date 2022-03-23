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
public class Ejercicio6 {
/*
 *Programa que lea un n�mero positivo y muestre por pantalla la 
 *lista de n�meros impares desde 2 hasta el n�mero le�do.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("introduce un numero positivo");
		int num=tcl.nextInt();
		//bucle impares desde 2 al numero leido
		for (int i = 2; i <= num; i++) {
			//se asegura de que son impars
			if (i%2!=0) {
				System.out.println(i);
			}
			
		}
		
		tcl.close();
	}

}
