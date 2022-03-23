package StringStringBuffer;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
/*
 *Crea un método que determine si una cadena es un palíndromo, o 
 *sea, se lee igual en los dos sentidos.
 */
	/**
	 * metodo que compara dos cadenas para ver si son iguales 
	 * @param cadena
	 * @return
	 */
	public static boolean palindromo(String cadena) {
		String cadena2="";
		boolean palindromo= false;
		for (int i = cadena.length()-1; i >=0 ; i--) {
			cadena2=cadena2+cadena.charAt(i);
		}
		if (cadena.equals(cadena2)) {
			palindromo=true;
		} else {
			palindromo=false;
		}
		
		return palindromo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		String cadena;
		
		System.out.println("introduzca una cadena");
		cadena=tcl.nextLine();
		
		System.out.println(palindromo(cadena));
		
		tcl.close();
	}

}
