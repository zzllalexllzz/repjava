package EstructuraControl1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
/*
 * Escribe un programa en que dado un número del 1 a 7 escriba 
 * el correspondiente nombre del día de la semana.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		int dia;
		
		System.out.println("introduce una dia");
		dia=Integer.parseInt(tcl.nextLine());
		
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("sabado");
			break;
		case 7:
			System.out.println("domingo");
			break;
		}
		tcl.close();
	}
}