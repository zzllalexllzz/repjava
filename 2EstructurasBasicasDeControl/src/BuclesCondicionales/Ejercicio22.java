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
public class Ejercicio22 {
/*
 * Programa que, dado un número entero positivo introducido 
 * por teclado, visualice por pantalla todos los números 
 * primos menores que él. Utiliza la función del ejercicio 
 * anterior
 */
	/**
	 * 
	 * @param num
	 * @return devuelve falso o verdadero si es primo
	 */
	public static boolean numPrimo(int num) {
		int cont=0;
		//bucle 1 al numero dado 
		for (int i = 1; i <= num; i++) {
			//si num divide con i y sale 0 cuenta 1
			if (num%i==0) {
				cont++;
			}
		}
		//si num se divide dos ves  sera primo 
		if (cont<=2) {
			return true;
		}else {//si se divide mas de dos  no sera primo
			return false;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("introduce un numero");
		int num=tcl.nextInt();
		//bucle del i al num determinado 
		for (int i = 1; i <= num; i++) {
			//comprueba y compara si (i) es primo realmente
			if (numPrimo(i)==true) {
				//printa i
				System.out.println(i);
			}
		}
		
		
		tcl.close();
	}

}
