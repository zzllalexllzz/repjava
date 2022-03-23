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
public class Ejercicio7 {
/*
 *Diseñar una aplicación que declare una tabla de 10 elementos enteros. 
 *Leer mediante el teclado 8 números.
 *Después se debe pedir un número y una posición, insertarlo en la 
 *posición indicada, desplazando los que estén detrás. Crea 
 *una función para mejorar el código.
 */
	public static void pintarVector(int[] numeros) {
		System.out.print("[ ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+"  ");
		}
		System.out.print("]");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//diseña un aplicacion que declare una tabla de 10 elementos
		//enteros.
		
		
		int numeros[]=new int[10];
		
		for (int i = 0; i < 8; i++) {
			numeros[i]=(int)(Math.random()*100+1);
		}
		
		pintarVector(numeros);
		System.out.println();
		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("introduce una posicion  entre 0 y 7");
		
		//introducece la posicion donde vamos a meter un nuevo valor
		int posicion=0;
		do {
			try {
				posicion=tcl.nextInt();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (posicion<0 || posicion>7);
		
		//pide por teclado el valor a introducir en esa posicion
		int numero=0;
		try {
			System.out.println("introduce un numero ");
			numero=tcl.nextInt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//mover todos los elementos desde posicion hasta length-1a la derecha
		//me voy al final , e intercambio lo que hay en la posicion i
		//lo pongo es i+1
		for (int i = 8; i >= posicion; i--) {
			numeros[i+1]=numeros[i];
		}
		
		//inserta el numero en la posicion seleccionada
		numeros[posicion]=numero;
		
		pintarVector(numeros);
	
		tcl.close();
	
	}

}
