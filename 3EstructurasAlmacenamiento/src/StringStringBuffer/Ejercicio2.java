package StringStringBuffer;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
/*
 *Crea un programa que reciba una cadena de caracteres y 
 *la devuelva invertida con efecto espejo, este es, se 
 *concatena a la palabra original su inversa, compartiendo 
 *la última letra, que hará de espejo, por lo que la 
 *palabra obtenida se lee igual hacia adelante que hacia 
 *atrás. Por ejemplo, al introducir “teclado” devolverá 
 *“tecladodalcet” y al introducir “hola” devolverá 
 *“holaloh”. Haz dos versiones, una con String y otra 
 *con StringBuffer.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		String cadena1;
		String invertida1="";
		System.out.println("Introduce una cadena");
		cadena1=tcl.nextLine();
		//bucle invertida pero no pinta el primer caracter
		for (int i = cadena1.length()-2; i >= 0; i--) {
			invertida1=invertida1+cadena1.charAt(i);
		}
		//concatenamos para ver el modo espejo
		System.out.println(cadena1+invertida1);
		System.out.println("----------------");
		
		//otra manera de hacer
		System.out.println("Añade otra cadena");
		String cadena2=tcl.nextLine();
		StringBuffer mensaje=new StringBuffer(cadena2);
		
		mensaje.reverse().deleteCharAt(0);
		
		System.out.println(cadena2+mensaje);
		
		tcl.close();
	}

}
