/**
 * 
 */
package ControlExcepciones;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio25 {
/*
 *Pedir un número entero positivo N. A continuación, introducir por 
 *teclado N números enteros. Mostrar la media de los N números 
 *introducidos, el mayor y el menor
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
	
			double suma=0;
			double media=0;
			int mayor=0;
			int menor=10000;
			//pedimos un numero por teclado para saber
			// veces que se repetira el buque de pedir numeros
			System.out.println("introduce el numero de veces que pedira por teclado");
			int num=tcl.nextInt();
			
			//bucleque pide por teclado y suma los numeros introducidos
			//tabien devuelve el mayor y menor numero
			for (int i = 0; i < num; i++) {
				System.out.println("introduce un numero ");
				int num2=tcl.nextInt();
				//suma los numero introducidos
				suma=suma+num2;
				//condicion saca el mayor
				if (num2>mayor) {
					mayor=num2;
				}
				//condicion saca el menor
				if (num2<menor) {
					menor=num2;
				}
			}
			//divicion da la media 
			media=(suma/num);
			//pinta la media, el mayor y el menor
			System.out.println("-----------------------");
			System.out.println("la media es "+media);
			System.out.println("el mayor es "+mayor);
			System.out.println("el menor es "+menor);
			
			tcl.close();
		
		}catch(InputMismatchException ex) {
			System.out.println("Debe inroducir un numero entero y positivo");
		}
		
	}

}
