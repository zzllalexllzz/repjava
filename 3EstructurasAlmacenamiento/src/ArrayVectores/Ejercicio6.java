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
public class Ejercicio6 {
/*
 *Leer por teclado una serie de 5 números enteros. El programa debe 
 *indicarnos si los números están ordenados de forma creciente, 
 *decreciente o si están desordenados. Crea una función para 
 *mejorar el código.
 */
	/**
	 *metodo booleano que saca si es asendente
	 * @param vector
	 * @return
	 */
	public static boolean vectorAcendente(int vector[]) {
		boolean orden=false;
		for (int i = 0; i < vector.length-1; i++) {
			if (vector[i]<vector[i+1]) {
				orden=true;
			}
		}
		return orden;
	}
	/**
	 * metodo booleano que saca si es decendente
	 * @param vector
	 * @return
	 */
	public static boolean vectorDecendente(int vector[]) {
		boolean orden=false;
		for (int i = 0; i < vector.length-1; i++) {
			if (vector[i]>vector[i+1]) {
				orden=true;
			}
		}
		return orden;
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
	 * metodo determan el orden del vector 
	 * @param vector
	 */
	public static void determinarOrden(int vector[]) {
		if (vectorAcendente(vector)==true && vectorDecendente(vector)==false) {
			System.out.println("Ascendente");
		} else if (vectorDecendente(vector)==true && vectorAcendente(vector)==false) {
			System.out.println("Descendente");
		}else {
			System.out.println("Desordenado");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int vector[]=new int[5];
		
		rellenaVector(vector, tcl);//funcion llenado de vector
		determinarOrden(vector);//funcion determian el orden del vector
		
		tcl.close();
	}

}
