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
public class Ejercicio4 {
/*
 *Leer 10 números enteros. Debemos mostrarlos en el siguiente 
 *orden: el primero, el último, el segundo, el penúltimo, 
 *el tercero, etc…
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
		//metoddo llenar un vector con 10 numeros
		rellenaVector(numeros, tcl);
		
		
		//pinta el vector en el siguiente orden: el primero, 
		//el último, el segundo, el penúltimo, el tercero, etc.
		for (int i = 0; i < numeros.length/2; i++) {
			System.out.print(numeros[i]+" ");
			System.out.print(numeros[9-i]+" ");
		}
		
		tcl.close();		
	}	

}
