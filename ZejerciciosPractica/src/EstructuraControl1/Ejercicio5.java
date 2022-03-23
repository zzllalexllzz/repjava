package EstructuraControl1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
/*
 * Realiza un programa que pida 3 notas y calcule su media. El 
 * programa ha de indicar la nota en formato boletín (insuficiente, 
 * suficiente, bien, notable o sobresaliente).
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		int nota1 , nota2, nota3;
		int media=0;
		System.out.println("introduce nota 1");
		nota1=tcl.nextInt();
		System.out.println("introduce nota 2");
		nota2=tcl.nextInt();
		System.out.println("introduce nota 3");
		nota3=tcl.nextInt();
		
		media=(nota1+nota2+nota3)/3;
		System.out.println("La media de las notas es: "+media);
		switch (media) {
		case 1,2,3,4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7,8,9:
			System.out.println("Notable");
			break;
		case 10:
			System.out.println("Sobresaliente");
			break;
		}
		tcl.close();
		
	}

}
