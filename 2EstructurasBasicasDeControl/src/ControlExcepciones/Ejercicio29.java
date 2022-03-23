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
 *B�squeda binaria. El usuario piensa un n�mero, y el programa debe 
 *averiguarlo. Pide al usuario que piense un n�mero entre el 1 y el 100.
 *El programa mostrar� un n�mero por pantalla y preguntar� al usuario 
 *si el n�mero que ha pensado es menor, igual o mayor al n�mero 
 *mostrado. Este proceso lo repetir� hasta encontrar el n�mero que 
 *ha pensado el usuario. Al finalizar el proceso, mostrar� el n�mero
 *de intentos probados hasta encontrar el n�mero.
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
