package StringStringBuffer;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
/*
 * Crea un programa en Java que solicite al usuario la introducción 
 * de una cadena de caracteres y devuelva esta cadena invertida. 
 * Haz dos versiones, una con String y otra con StringBuffer.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		String cadena1;
		String invertida1="";
		System.out.println("Introduce una cadena");
		cadena1=tcl.nextLine();
		//bucle invierte la caedena
		for (int i = cadena1.length()-1; i >= 0; i--) {
			invertida1=invertida1+cadena1.charAt(i);
		}
		System.out.println(invertida1);
		System.out.println("----------------");
		//otro modo
		System.out.println("Añade otra cadena");
		String cadena2=tcl.nextLine();
		StringBuffer mensaje=new StringBuffer(cadena2);
		mensaje.reverse();
		System.out.println(mensaje);
		
		tcl.close();
		
	}

}
