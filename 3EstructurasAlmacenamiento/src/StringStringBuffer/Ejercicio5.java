package StringStringBuffer;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
/*
 *Dise�a un programa en Java que solicite al usuario una cadena
 *de caracteres y muestre por pantalla un conteo de cu�ntas 
 *vocales, consonantes y espacios en blanco contiene la cadena 
 *introducida.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		String cadena1;
		int vocales=0;
		int consonantes=0;
		int espacios=0;
		//leemos la cadena 
		System.out.println("introduzca una cadena ");
		cadena1=tcl.nextLine();
	
		//contador de vocales, espcios y consonantes
		for(int i=0;i<cadena1.length();i++) {
			if((cadena1.charAt(i)=='a')||(cadena1.charAt(i)=='e')||(cadena1.charAt(i)=='i')||(cadena1.charAt(i)=='o')||(cadena1.charAt(i)=='u')) {
				vocales++;
			}else if(cadena1.charAt(i)<'a'|| cadena1.charAt(i)>'z') {
				espacios++;
			}else {
				consonantes++;
			}
		}
		
		System.out.println("la cantidad de vocales en la cadena es "+vocales);
		System.out.println("la cantidad de espacios en la cadena es "+espacios);
		System.out.println("la cantidad de consonates en la cadena es "+consonantes);
		tcl.close();
	
	}

}
