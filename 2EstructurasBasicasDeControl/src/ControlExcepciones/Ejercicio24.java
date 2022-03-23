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
public class Ejercicio24 {
/*
 *Programa que lea números enteros entre 1 y 100 y para cada uno de ellos 
 *escriba su mayor divisor distinto del propio número. Se terminará el 
 *programa cuando lea el número cero. Al final se escribirá la cantidad 
 *de números correctos introducidos (entre 1 y 100) y el número de 
 *errores cometidos (números fuera de los permitidos).
 */
	public static int mayorDivisor(int num) {
		int mayor=0;
		int menor=10000;
		//bucle de 1 al num pasado como parametro por teclado 
		//y vevuelve el mayor divisor
		for (int i = 1; i < num; i++) {
			//condicion si num/i=resto 0 
			if (num%i==0) {
				//condicion si i es mayor que mayor=0
				if (i>mayor) {
					//devolvemos i
					mayor=i;
				}
				//condicion si i es menor que menor=10000 
				if (i<menor) {
					//devolvemos i
					menor=i;
				}
			}
		}
		//reornamos solo el mayor
		return mayor;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

			int num;
			int correctos=0;
			int incorrectos=0;
			//bucle
			do {
			System.out.println("introduce un numero");
			num=tcl.nextInt();
				//condicion de si num esta entre 1 y 100 pinta lo de abajo
				if (num>1 && num<100 && num!=0) {
					//pinta el mayor divisor de num
					System.out.println("El mayor divisor de "+num+" es "+mayorDivisor(num));
					//suma +1 cuando un numero esta en el rango
					correctos++;
				//condicion deja fuera a 0 como  numero incorrecto
				}else if (num!=0) {
					//pinta el error del rango 
					System.out.println("ERROR. Debes introducir un numero entre 1 y 100");
					//suma +1 cuando un numero esta fura de rango
					incorrectos++;
				}
			//bucle sale si es num es 0
			}while(num!=0);
			//pinta el numero de correctos 
			System.out.println("Numeros correctos "+correctos);
			//pinta el numero de incorrectos
			System.out.println("Numeros incorrectos "+incorrectos);
			
			tcl.close();
			
		} catch (InputMismatchException ex) {
			//pinta cuando la excepcion se activa
			System.out.println("Debe inroducir un numero entero y positivo");
		}
	}

}
