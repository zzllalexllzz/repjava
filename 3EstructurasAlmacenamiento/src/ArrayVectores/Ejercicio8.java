/**
 * 
 */
package ArrayVectores;

import java.util.Locale;
import java.util.Scanner;


/**
 * @author darge
 *
 */
public class Ejercicio8 {
/*
* Crear un programa que lea por teclado una tabla de 5 números 
* enteros y la desplace una posición hacia la derecha: el primero 
* pasa a ser el segundo, el segundo pasa a ser el tercero y así 
* sucesivamente. El último pasa a ser el primero.
*/
	/**
	 * pinta el vector
	 * @param numeros
	 */
	public static void pintarVector(int[] numeros) {
		System.out.print("[ ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+"  ");
		}
		System.out.print("]");
	}
	/**
	 * metodo rrellena un vector
	 * @param vector
	 * @param tcl
	 * @return
	 */
	public static int[] rellenaVector(int vector[], Scanner tcl) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("introduce un numero vector "+(i+1));
			vector[i]=tcl.nextInt();
		}
		return vector;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int num[]=new int[5];
		//rrellena el vector mediante teclado
		rellenaVector(num, tcl);
		//pinta el vector
		pintarVector(num);
		//guarda la ultima posicion
		int posicionUlt=num[4];
		
		System.out.println();
		
		//desplasa una posicion
		for (int i =num.length-2; i >= 0; i--) {
			num[i+1]=num[i];
		}
		//asigna la ultima posicion al primero
		num[0]=posicionUlt;
		
		pintarVector(num);
		
		tcl.close();
		
	}

}
