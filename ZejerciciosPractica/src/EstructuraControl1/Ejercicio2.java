package EstructuraControl1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
/*
 * Realiza un programa que pida una hora por teclado y que muestre 
 * luego buenos días, buenas tardes o buenas noches según la hora. 
 * Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 
 * respectivamente. Sólo se tienen en cuenta las horas, los 
 * minutos no se deben introducir por teclado.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		int hora;
		
		System.out.println("introduce una hora");
		hora=Integer.parseInt(tcl.nextLine());

		switch (hora) {
		case 6,7,8,9,10,11,12:
			System.out.println("Buenos dias");
			break;
		case 13,14,15,16,17,18,19,20:
			System.out.println("Buenas tardes");
			break;
		case 21,22,23,24,1,2,3,4,5:
			System.out.println("Buenas noches");
			break;
		}
	
		tcl.close();
	}
}
