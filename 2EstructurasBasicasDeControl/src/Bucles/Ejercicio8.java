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
public class Ejercicio8 {
/*
 *Programa que lea un número entero positivo N y escriba la 
 *tabla de dobles y triples desde 1 hasta N. Ejemplo, para 
 *el dos sería: 2 – 4 (2*2) - 6 (2*3)
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("introduce un numero positivo");
		int num=tcl.nextInt();
		
		//bucle tabla de dobles 
		System.out.println("------DOBLES-----");
		for (int i = 1; i <=num; i++) {
			System.out.println(i+" x 2 = "+(i*2));
		}
		//bucle tabla de triples
		System.out.println("------TRIPLES-----");
		for (int i = 1; i <=num; i++) {
			System.out.println(i+" x 3 = "+(i*3));
		}
		
		
		tcl.close();
	}

}
