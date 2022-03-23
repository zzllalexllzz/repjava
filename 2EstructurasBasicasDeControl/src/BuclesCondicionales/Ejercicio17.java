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
public class Ejercicio17 {
/*
 *Programa que lea dos números positivos e imprima por 
 *pantalla todos los números pares que estén entre los 
 *dos números dados. También debe indicar cuántos 
 *números pares hay en ese intervalo.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("introduce el primer numero");
		int num1=tcl.nextInt();
		System.out.println("introduce el segundo numero");
		int num2=tcl.nextInt();
		int cont=0;
		
		//bucle de pares de un rango determinado y conteo de pares
		for (int i = num1; i <=num2 ; i++) {
			//condicion de pintar solo pares
			if ((i%2==0)) {
				System.out.println(i);
				cont++;//cuenta cada vez que hay un par
						//si esta en 0 y pasa un par sube +1
			}
		}
		System.out.println("------------------------------");
		System.out.println("El numero de enteros es "+cont);
		
		
		tcl.close();
	}

}
