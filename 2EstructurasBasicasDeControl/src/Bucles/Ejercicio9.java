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

public class Ejercicio9 {
/*
 *Función que calcule el factorial de un número 
 *entero positivo pasado como parámetro 
 *(N!=N*(N-1)*(N2)*…*2*1).
 */
 //metodo o funcion factorial 
	public static int factorial(int num, int fac) {
		
		for (int i = 1; i <=num; i++) {
			fac=fac*i;
		}
		return fac;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		int fac=1;
		System.out.println("introduce un numero");
		int num=tcl.nextInt();
		//imprime y llama al metodo factorial
		System.out.println("el factorial es "+factorial(num, fac));
		
		tcl.close();
		
	}

}
