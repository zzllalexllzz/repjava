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
public class Ejercicio30 {
/*
 * Menú de opciones. Hacer el ejercicio propuesto en el documento 
 * sobre cómo hacer menús en Java.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
			
			int opcion=0;
			do {
				System.out.println("-----Menu----");
				System.out.println("1. Saludar");
				System.out.println("2. Despidete");
				System.out.println("3. Salir");
				System.out.println("-------------");
				
				System.out.println("Introduce una opcion");
				opcion=tcl.nextInt();
			
				switch (opcion) {
				case 1:
					System.out.println("hola, como estas");
					break;
				case 2:
					System.out.println("adios, que tengas buen dia");
					break;
				case 3:
					System.out.println("programa terminado");
					break;
				}
			} while (opcion!=3);
				
		} catch (InputMismatchException ex) {
			System.out.println("Debe inroducir un numero entero y positivo");
		}
	}

}
