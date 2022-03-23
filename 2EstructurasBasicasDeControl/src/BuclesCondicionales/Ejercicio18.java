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
public class Ejercicio18 {
/*
 * Programa que lea números hasta que le den el cero, 
 * y que diga cuál ha sido el mayor y cuál el menor de
 * los números introducidos (sin tener en cuenta el cero).
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		int num;
		
		int mayor=0;
		int menor=1000;
		
		//bucle para sacar el numero mayor y menor
		do {
			System.out.println("introduce un numero");
			num = tcl.nextInt();
			//saca el numero mayor  de los dados sin contar el 0
			if(num>mayor && num!=0) { 
				mayor = num;
			}
			//saca el numero menor  de los dados sin contar el 0
			if(num<menor && num!=0) {
				menor = num;
			}
		}while(num!=0);//si el numero dado es 0 sale del bucle
		
		//imprime el mayor y el menor numero
		System.out.println("el mayor es "+mayor);
		System.out.println("el menor es "+menor);
		
		tcl.close();
	}

}
