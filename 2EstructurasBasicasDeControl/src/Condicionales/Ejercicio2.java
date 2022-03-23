/**
 * 
 */
package Condicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 *Programa que lea un número por teclado e indique 
	 *si es múltiplo de 2, 3, 5 o 7.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("introduce un numero");
		int num1=tcl.nextInt();
		//devuelve si es multiplo de 2
		if(num1%2==0) {
			System.out.println(num1+" es multiplo de 2");
		}//devuelve si es multiplo de 3
		if(num1%3==0) {
			System.out.println(num1+" es multiplo de 3");
		}//devuelve si es multiplo de 5
		if(num1%5==0) {
			System.out.println(num1+" es multiplo de 5");
		}//devuelve si es multiplo de 7
		if(num1%7==0) {
			System.out.println(num1+" es multiplo de 7");
		}//devuelve si no es multiplo de nunguno de los pedidos
		if ((num1%2!=0)&&(num1%3!=0)&&(num1%5!=0)&&(num1%7!=0)) {
			System.out.println("no es multiplo de 2,3,5 o 7");
		}
		
		
		tcl.close();
	}

}
