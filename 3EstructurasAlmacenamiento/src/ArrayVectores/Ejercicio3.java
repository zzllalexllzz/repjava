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
public class Ejercicio3 {
/*
 *Igual que el anterior, pero implementa una función para 
 *cada tarea (media, mayor y menor de los elementos almacenados 
 *en un array pasado como parámetro).
 */
	/**
	 * funcion que da el numero mayor de todos en el vector
	 * @param numeros
	 * @return
	 */
	public static int numeroMayor(int numeros[]) {
		int mayor=0;
		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i]>mayor) {
				mayor=numeros[i];
			}
		}
		return mayor;
	}
	/**
	 * funcion que da el numero menor de todos en el vector
	 * @param numeros
	 * @return
	 */
	public static int numeroMenor(int numeros[]) {
		int menor=100;
		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i]<menor) {
				menor=numeros[i];
			}
		}
		return menor;
	}
	/**
	 * funcion da la media del vector entero
	 * @param numeros
	 * @return
	 */
	public static double numeroMedia(int numeros[]) {
		double suma=0;
		for (int i = 0; i < numeros.length; i++) {
			suma=suma+numeros[i];
		}
		return suma/numeros.length;
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
		//llena el vector con numero introducidos
		int numeros[]=new int[10];
		
		rellenaVector(numeros, tcl);
		
		System.out.println("el mayor es "+numeroMayor(numeros));
		System.out.println("el menor es "+numeroMenor(numeros));
		System.out.println("la media es "+numeroMedia(numeros));
		
		tcl.close();
	}

}
