/**
 * 
 */
package String;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		String cadena;
		String reverso ="";
		
		
		//pedimos la cadena
		System.out.println("añade una cadena ");
		cadena = tcl.nextLine();
		//
		for(int i=cadena.length()-2; i>=0; i--) {
			reverso=reverso+cadena.charAt(i);
		}
		System.out.println("con string "+cadena+reverso);
		
		StringBuffer mensaje=new StringBuffer(cadena);
		mensaje=mensaje.reverse().deleteCharAt(0);
		
		System.out.println("con stringbuffer "+mensaje+cadena);
	}

}
