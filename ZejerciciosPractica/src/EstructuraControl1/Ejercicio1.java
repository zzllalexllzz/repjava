package EstructuraControl1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Escribe un programa que pida por teclado un d�a de la semana y 
	 * que imprima por pantalla qu� asignatura toca a primera hora 
	 * ese d�a.
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
			System.out.println("introduce una dia de la semana");
			String dia=tcl.nextLine();
			switch (dia) {
			case "lunes":
					System.out.println("Base de datos");
				break;
			case "martes":
					System.out.println("Entornos de Desarrollo");
				break;
			case "miercoles":
					System.out.println("Sistemas Informaticos");
				break;
			case "jueves":
					System.out.println("Lenguaje de Marcas");
				break;
			case "viernes":
					System.out.println("Programacion");
				break;
			}
			
			tcl.close();
		}

	}
