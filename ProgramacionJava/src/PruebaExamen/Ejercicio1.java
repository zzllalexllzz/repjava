package PruebaExamen;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		String cadena1;
		String cadenaBus;
		String cadrenp;
		
		System.out.println("Introduce una cadena");
		cadena1=tcl.nextLine();
		System.out.println("introduce la cadena buscada");
		cadenaBus=tcl.nextLine();
		System.out.println("palabra a renplazar");
		cadrenp=tcl.nextLine();
		
		
		System.out.println(cadena1.replace(cadenaBus, cadrenp));
		
		tcl.close();
	}

}
