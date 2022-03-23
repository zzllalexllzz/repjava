/**
 * 
 */
package Condicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio4 {

	/*
	 * 4. Crea una función que no devuelva nada (void) que, 
	 * dado un importe en euros, nos indique el mínimo número 
	 * de billetes y la cantidad sobrante que se pueden 
	 * utilizar para obtener dicha cantidad. Ejemplo: 362 
	 * euros → 1 billete de 200, 1 billete de 100, 1 billete 
	 * 50, un billete de 10, sobran 2 euros. Pista: hay que 
	 * ir sacando la división entera, y el resto se lleva 
	 * al siguiente billete.
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("introduce el importe");
		int importe=tcl.nextInt();
		
		int b200=0, b100=0, b50=0, b10=0, eu=0;
		int resto=0;
		
	        b200=(int)importe/200;

	        if(importe%200!=0) {
	            resto=(importe%200);
	            b100=(int)(resto)/100;

	            resto=(resto%100);
	            if(resto!=0) {
	                b50=(int)(resto)/50;
	            }
	            resto=(resto%50);
	            b10=(int)(resto)/10;

	            resto=(resto%10);
	            eu=resto;

	            System.out.println("Billete 200: " + b200);
	            System.out.println("Billete 100: "+ b100);
	            System.out.println("Billete 50: " + b50);
	            System.out.println("Billete 10: " + b10);
	            System.out.println("€ euros: " + eu);
		}
					
		tcl.close();
	}

}
