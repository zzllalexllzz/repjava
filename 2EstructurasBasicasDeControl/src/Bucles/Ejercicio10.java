/**
 * 
 */
package Bucles;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio10 {
/*
 * Programa que imprima la tabla de multiplicar de 
 * cualquier número entero entre el 1 y el 10 
 * introducido por teclado.
 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("introduce un numero de 1 al 10");
		int num=tcl.nextInt();
		
		//condicion que obliga a dar un entero entre 1 y 10
		if ((num>=1 && num<=10)) {
			//bucle tabla de multiplicar dado un entero del 1 al 10
			for (int i = 1; i <= 10; i++) {
				//imprime la tabla
				System.out.println(num+" x "+i+" = "+(i*num));
			}
		}else {
			System.out.println("el numero no esta entre 1 y 10");
		}
		
		//otro modo de hacer la tabla
		int multi=1;
		do {
            System.out.println(num + " x " + multi + " = "+num*multi );
            multi++;
        }while((multi<=10)&& (num!=0 && num<=10));
		
		tcl.close();
	}

}
