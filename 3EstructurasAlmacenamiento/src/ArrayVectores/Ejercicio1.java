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
public class Ejercicio1 {
/*
 *Leer 10 números enteros y mostrarlos en el mismo orden 
 *introducido. A continuación, mostrarlos en el orden inverso 
 *al introducido.
 */
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

		int numeros[]=new int[10];
		//llama a llenar el vector
		rellenaVector(numeros, tcl);
		
		//pinta el vector en el orden que insertamos el vector
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
		System.out.println(" ");
		//pinta el vector inverso
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i]+" ");
		}
		
		tcl.close();
	}

}
