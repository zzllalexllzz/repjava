package EstructuraControl1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
/*
 * Escribe un programa que calcule el salario semanal de un 
 * trabajador teniendo en cuenta que las horas ordinarias 
 * (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
 * A partir de la hora 41, se pagan a 16 euros la hora.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		int horas;
		int sueldoSemanal;
		
		System.out.println("introduce horas trabajadas");
		horas=Integer.parseInt(tcl.nextLine());
		
		if (horas <= 40) {
			sueldoSemanal = 12 * horas;
		} else {
			sueldoSemanal = ((horas-40)*16)+(40*12);
		}
		System.out.println("El sueldo semanal es: "+sueldoSemanal);
		
		tcl.close();
	}

}
