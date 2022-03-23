package ArrayVectores;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	/*
	 *Leer por teclado una tabla de 10 elementos numéricos enteros 
	 *y una posición (entre 0 y 9). Eliminar el elemento situado en 
	 *la posición dada sin dejar huecos.
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int numeros[]=new int[10];
		rellenaVector(numeros, tcl);
		
		pintarVector(numeros);
		
		System.out.println();
		System.out.println("introduce una posicion de 0 a 9");
		int posicion=tcl.nextInt();
				
		System.out.println();
				
		//desplasa una posicion
		for (int i =posicion; i < numeros.length-1; i++) {
			numeros[i]=numeros[i+1];
		}
		
		numeros[numeros.length-1]=0;
				
		pintarVector(numeros);
	}

}
