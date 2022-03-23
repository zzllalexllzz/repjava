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
public class Ejercicio11 {
/*
 *Crea un m�todo que, dado un n�mero entero pasado como par�metro, 
 *devuelva cu�ntos d�gitos forman el n�mero. Por ejemplo: el 
 *n�mero 54326 consta de 5 d�gitos. Pista: cu�ntas veces se puede 
 *dividir entre 10.
 */	
	/**
	 * 
	 * @param num
	 * @return devuelve el numero de digitos con el contador
	 */
	public static int numDigitos(int num) {
		int cont=0;
	
		while (num!=0) {
			num=(num/10);
			cont++;
		}
		return cont;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("introduce un numero entero");
		int num=tcl.nextInt();
		//imprime y llama al metodo
		System.out.println("el numero de digitos es "+numDigitos(num));
		tcl.close();
	}

}
