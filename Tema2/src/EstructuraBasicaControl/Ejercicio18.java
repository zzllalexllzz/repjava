/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl= new Scanner(System.in);
		int num1;
		int mayor=0;
		int menor=1000;
		
		do {
			System.out.println("introduce un numero");
			num1 = tcl.nextInt();
			if(num1>mayor && num1!=0) { 
				mayor = num1;
			}
			if(num1<menor && num1!=0) {
				menor = num1;
			}
		}while(num1!=0);
		

		System.out.println("el numero mayor es "+mayor);
		System.out.println("el numero menor es "+menor);
		
		tcl.close();
		
	}

}
