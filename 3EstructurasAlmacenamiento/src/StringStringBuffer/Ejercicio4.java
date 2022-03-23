/**
 * 
 */
package StringStringBuffer;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio4 {
/*
 *Crea un programa en Java que solicite al usuario dos cadenas de 
 *caracteres y que devuelva la primera cadena, pero transformando 
 *en mayúsculas la parte que coincide con la segunda cadena 
 *introducida.
 *Por ejemplo, si se introducen las cadenas “Esta es mi amiga Ana” 
 *y “amiga” devolverá “Esta es mi AMIGA Ana”.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		String cadena1;
		String cadenaBus;
		String cadEncontrado;
		
		
		System.out.println("Introduce una cadena");
		cadena1=tcl.nextLine();
		
		System.out.println("introduce la cadena buscada");
		cadenaBus=tcl.nextLine();
		//buscamos la subcadena determinada y lo converimos a mayuscula
		cadEncontrado=cadena1.substring(cadena1.indexOf(cadenaBus), cadena1.indexOf(cadenaBus)+ cadenaBus.length()).toUpperCase();
		//remplazamos la cadena buscada por la cadena encontrada
		System.out.println(cadena1.replace(cadenaBus, cadEncontrado));
		
		tcl.close();
		
	}

}
