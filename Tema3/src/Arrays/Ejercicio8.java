/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int tabla[]=new int[5];
		 int ultimo;
		 // leemos la tabla
		 for (int i=0;i<5;i++){
			 System.out.print("introduzca numero ");
			 tabla[i]=tcl.nextInt();
		 }
		 // guardamos el ultimo numero de la tabla
		 ultimo = tabla[4];
	
		
		 for (int i=3;i>=0;i--) {
			 tabla[i+1]=tabla[i];
		 }
		 // el ultimo valor pasa a ser el primero
		 tabla[0] =ultimo;

		 System.out.println("la tabla queda ");
		 for (int i=0;i<5;i++) {
			 System.out.println(tabla[i]);
		 }
	}

}
