/**
 * 
 */
package BuclesCondicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		
		int num;
		
		int suma=0;
		int cont=0;
		
		do {
			System.out.println("introduce un numero");
			num = tcl.nextInt();
			if (num!=-1) {
				cont++;
				suma=suma+num;
			}
		}while(num!=-1);
		
		System.out.println("la media es "+suma/cont);
		
		tcl.close();
	}

}
