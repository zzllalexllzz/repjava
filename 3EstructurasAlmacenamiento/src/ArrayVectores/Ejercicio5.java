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
public class Ejercicio5 {
/*
 *Leer por teclado dos tablas A y B de 5 números enteros 
 *y mezclarlas en una tercera de la forma: el 1º de A, el 1º 
 *de B, el 2º de A, el 2º de B, etc…
 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int tablaA[]=new int[5];
		int tablaB[]=new int[5];
		int tablaC[]=new int[10];
		
		//llena con numero la tablaA
		for (int i = 0; i < tablaA.length; i++) {
			System.out.println("introduce un numero tablaA "+(i+1));
			tablaA[i]=tcl.nextInt();
		}
		//llena con numero la tablaB
		for (int i = 0; i < tablaB.length; i++) {
			System.out.println("introduce un numero tablaB "+(i+1));
			tablaB[i]=tcl.nextInt();
		}
		
		int num=0;
		//insertamos las dos tablas a la tablaC
		//lo hace intecalado 1a, 1b, 2a, 2b
		for (int i = 0; i < 5; i++) {
			tablaC[num]=tablaA[i];
			num++;
			tablaC[num]=tablaB[i];
			num++;
		}
		//pintamos la tablaC
		for (int i = 0; i < tablaC.length; i++) {
			System.out.print(tablaC[i]+" ");
		}
		
		tcl.close();
	}

}
