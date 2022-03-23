/**
 * 
 */
package EstructuraBasicaControl;

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
		
		Scanner tcl = new Scanner(System.in);
		int num1;
		double media;
		int suma=0;
		int conta=0;
		
		do {
			System.out.println("introduce un numero");
			num1 = tcl.nextInt();
			
			if(num1>=0) {
				suma=(suma+num1);
				conta++;
			}
		}while(num1>=0);
		media=suma/conta;
		System.out.println(media);
		
		tcl.close();
	}

}
