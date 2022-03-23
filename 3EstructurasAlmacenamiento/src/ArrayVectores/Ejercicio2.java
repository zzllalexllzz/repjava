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
public class Ejercicio2 {
/*
 *Leer 10 números enteros y a continuación mostrar la media 
 *de los números introducidos, el mayor valor y el menor valor. 
 *Usar un array para almacenar los valores y sacar toda la 
 *información en una sola iteración del array.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int numeros[]=new int[10];
		double suma=0;
		int mayor=0;
		int menor=100;
		
		//bucle llenar un vector con 10 numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introduce un numero "+(i+1));
			numeros[i]=tcl.nextInt();
			suma=suma+numeros[i];
			if (numeros[i]>mayor) {
				mayor=numeros[i];
			}
			if (numeros[i]<menor) {
				menor=numeros[i];
			}
		}
		System.out.println("la media "+suma/numeros.length);
		System.out.println("el mayor es "+mayor);
		System.out.println("el menor es "+menor);
		
		tcl.close();
		
	}

}
