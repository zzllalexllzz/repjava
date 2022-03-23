package StringStringBuffer;

import java.util.Locale;
import java.util.Scanner;



public class Ejercicio3 {
/*
 * Diseña un programa en Java que solicite al usuario una cadena 
 * en la que buscará y otra que será la cadena buscada. El 
 * programa indicará cuántas veces aparece la segunda cadena en 
 * la primera.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		String cadena1;
		String cadenaBus;
		int contador=0;
		System.out.println("Introduce una cadena");
		cadena1=tcl.nextLine();
		
		System.out.println("introduce la cadena buscada");
		cadenaBus=tcl.nextLine();
		
		int posicion=0;
		int contador2=0;
        while(posicion >=0) {//Hasta que indexOf devuelva -1 o no sea encontrado
            posicion = cadena1.indexOf(cadenaBus,posicion);

            if(posicion >=0) {
                contador2++;
                posicion++;
            }
        }
        //otra manera de hacer
		while (cadena1.indexOf(cadenaBus)>-1) {
			cadena1=cadena1.substring(cadena1.indexOf(cadenaBus)+cadenaBus.length(),cadena1.length());
			contador++;
		}
        System.out.println(contador);
        System.out.println(contador2);
        
        tcl.close();
        
	}

}
