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
public class Ejercicio3 {

	/*
	 * Programa que lea un número positivo de un dígito 
	 * por teclado y diga en letra a qué dígito corresponde
	 * (uno, dos, tres, cuatro, …). Ejemplo: si se 
	 * introduce el 1, se mostrará por pantalla el “uno”;
	 * si se introduce el 11, se mostrará el mensaje 
	 * “Error: no es un número de un dígito”.
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("introduce un numero de un solo digito");
		int num1=tcl.nextInt();	
		//menu dado el numero de una sola cifra devuelve el en cadena (1->uno)
		switch (num1) {
			case 0: {
				System.out.println("cero");break;
			}
			case 1:{
				System.out.println("uno");break;
			}
			case 2:{
				System.out.println("dos");break;
			}
			case 3:{
				System.out.println("tres");break;
			}
			case 4:{
				System.out.println("cuatro");break;
			}
			case 5:{
				System.out.println("cinco");break;
			}
			case 6:{
				System.out.println("seis");break;
			}
			case 7:{
				System.out.println("siete");break;
			}
			case 8:{
				System.out.println("ocho");break;
			}
			case 9:{
				System.out.println("nueve");break;
			}
		}
		
		tcl.close();
	}

}
