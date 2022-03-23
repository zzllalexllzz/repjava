/**
 * 
 */
package Examen1;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class ejem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1 crea un strinbuffer con el texto -hola, bienvenido al ies jaroso-
		//2 concatena " ,el ciclo de daw es la leche"
		//3 despues de "hola" pon un nombre que pidas por teclado
		//4 sustituye jaroso por JAROSO
		//5 di el numero de veces que aparece la letra "o"
		//6 elimina "hola,"
		//7 di el tamaño final de la cadena
		//8 muestra al reves
				
		Scanner tcl = new Scanner(System.in);
		StringBuffer cadena = new StringBuffer();
		//1	
		cadena.append("Hola, bienvenido al IES Jaroso");
		System.out.println(cadena);
		//2
		cadena.append(new String(", el ciclo de DAW es la leche"));
		System.out.println(cadena);
		//3		
		System.out.println("escribe un nombre");
		String cadena2 = tcl.nextLine();
		cadena.insert(4, " "+cadena2);
		System.out.println(cadena);
		//4		
		cadena.replace(29, 36, "JAROSO");
		System.out.println(cadena);
		//5
		int cont=0;
		for(int i=0;i<cadena.length();i++) {
			if((cadena.charAt(i)=='o')||(cadena.charAt(i)=='O')) {
				cont++;
			}
		}
		System.out.println("el numero de veces que aparece 'o' es "+cont);
		//6
		cadena.delete(0,5);
		System.out.println(cadena);
		//7
		int conta=0;
		for(int i=0;i<cadena.length();i++) {
			conta++;
		}
		System.out.println("el tamaño de la cadena es "+conta);
		//8
		cadena.reverse();
		System.out.println(cadena);
		
		
	}

}
