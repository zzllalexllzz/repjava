/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int num1; 
		int numMayor=0;
		int fallos=0;
		
		do {
			System.out.println("introduce un numero");
			num1= tcl.nextInt();
			
			if (num1>numMayor && num1!=0) {
				numMayor=num1;
			}
			if (num1<numMayor && num1!=0){
				fallos++;
				System.out.println("error: el numero no es mayor que el anterior");
			}
		}while(num1!=0);
		System.out.println("------------------------------------------------");
		System.out.println("el numero de fallo cometidos son de "+fallos);
		System.out.println("------------------------------------------------");
		
		tcl.close();
	}

}
