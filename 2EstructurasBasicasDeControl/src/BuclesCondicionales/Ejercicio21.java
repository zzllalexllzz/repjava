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
public class Ejercicio21 {
/*
 *Dise�a un m�todo que indique si un n�mero entero pasado como 
 *par�metro es o no un n�mero primo (devuelve un boolean). 
 *Un n�mero primo es aquel que tiene por divisores el 1 y el 
 *propio n�mero, �nicamente.
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
		//pinta una vez comprovada si es primo con la llamada de la funcion
		System.out.println(numPrimo(num));
		
		tcl.close();
	}

}
