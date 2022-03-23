/**
 * 
 */
package String;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		String cadena;
		String cadenaBuscada;
		int contador=0;
		
		//leemos la cadena 
		System.out.println("introduzca una cadena ");
		cadena=tcl.nextLine();
		//cadena a buscar
		System.out.println("introducir la cadema a buscar ");
		cadenaBuscada=tcl.nextLine();
		//contamos las veces q sale la cadena buscada
		while(cadena.indexOf(cadenaBuscada)>-1) {
			cadena=cadena.substring(cadena.indexOf(cadenaBuscada)+cadenaBuscada.length(),cadena.length());
			contador++;
		}
		
		
		System.out.println("las veces que aparece la subcadena es "+contador);
	}

}
