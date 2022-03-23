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
public class Ejercicio1 {
	/**
	 * Metodo que devuelve el mayor de tres numeros.
	 * @param a
	 * @param b
	 * @param c
	 * @return el mayor entre a, b y c 
	 */
	public static int numMayor(int a, int b, int c) {
		
		if ((a>=b) && (a>=c)) {
			return a;
		}else if ((b>=a) && (b>=c)) {
			return b;
		}else if ((c>=a) && (c>=b)){
			return c;
		}else {
			return -1;
		}
		
	}
	
	/**
	 * @param args
	 * Crea una función (método) que reciba como parámetros 
	 * tres números enteros y devuelva el mayor delos tres 
	 * números. Utilizar esa función para el calcular el 
	 * mayor de cuatro números enteros. Sería así:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		int a ,b ,c, d, mayor=0;
		System.out.println("introduce el primero numero:");
		a=tcl.nextInt();
		System.out.println("introduce el segundo numero: ");
		b=tcl.nextInt();
		System.out.println("introduce el tercer numero:");
		c=tcl.nextInt();
		//compara tres numeros
		mayor=numMayor(a,b,c);
		System.out.println("el mayor de tres numero es: "+mayor);
		
		System.out.println("introduce el cuarto numero ");
		d=tcl.nextInt();
		//comparara el mayor entre el valor resusultante de 
		//los tres numeros con el cuarto numero
		mayor=numMayor(a, b, (numMayor(c,d,-1)));
		System.out.println("el mayor de cuatro numero es: "+mayor);
		
		tcl.close();
	}

}
