/**
 * 
 */
package String;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		String cadena;
		String reverso = new String();
		//pedimos la cadena
		System.out.println("añade una cadena ");
		cadena = tcl.nextLine();
		//iinvertimos la cadena 
		for(int i=cadena.length()-1; i>=0; i--) {
			reverso=reverso+cadena.charAt(i);
		}
		
		System.out.println(reverso);
		
		System.out.println("");
		
		//probabamos con stringbuffer
		System.out.println("añade otra cadena");
		String palabra=tcl.nextLine();
		StringBuffer mensaje=new StringBuffer(palabra);
		mensaje.reverse();
		System.out.println(mensaje);
		
		
		
	}
}
