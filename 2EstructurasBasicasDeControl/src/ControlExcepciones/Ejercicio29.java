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
public class Ejercicio29 {
/*
 *Búsqueda binaria. El usuario piensa un número, y el programa debe 
 *averiguarlo. Pide al usuario que piense un número entre el 1 y el 100.
 *El programa mostrará un número por pantalla y preguntará al usuario 
 *si el número que ha pensado es menor, igual o mayor al número 
 *mostrado. Este proceso lo repetirá hasta encontrar el número que 
 *ha pensado el usuario. Al finalizar el proceso, mostrará el número
 *de intentos probados hasta encontrar el número.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
			
			int opcion;
			int mayor=100;
			int menor=1;
			int cont=0;
			
			//bucle que repite hsta que le demos 1
			do {
				//muestra un numero aleatorio
				System.out.println("------NumAleatorio-------");
				int num1=(int)(Math.random()*(mayor-menor)+menor);
				System.out.println("Tu numero es "+num1);
				//menu 3 opciones
				System.out.println("-----Menu----");
				System.out.println("1. Igual");
				System.out.println("2. Es mayor");
				System.out.println("3. Es menor");
				System.out.println("-------------");
				//pide por teclado una opcion
				System.out.println("Introduce una opcion");
				opcion=tcl.nextInt();
				cont++;//cuenta los intentos
				switch (opcion) {
				case 1://el programa adivina
					System.out.println("Soy una maquina molona");
					break;
				case 2://digo al programa es mayor y 
					//busco entre el numero que me da y el mayor
					System.out.println("Es mayor");
					menor=num1;
					break;
				case 3://digo al programa que es menor
					//y busco entre el numero que me da y el menor
					System.out.println("Es menor");
					mayor=num1;
					break;
				}
			} while (opcion!=1);
			
			System.out.println("-------------------");
			System.out.println("Numero de intetos "+cont);
			
			tcl.close();
		} catch (InputMismatchException ex) {
			System.out.println("Debe inroducir un numero entero y positivo");
		}
		
	}

}
