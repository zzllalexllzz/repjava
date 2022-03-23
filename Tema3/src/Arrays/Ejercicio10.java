/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int tabla[]=new int[10];
		 int posicion=0;
		 // leemos 10 numeros
		
		 for (int i=0;i<10;i++){
			System.out.print("introduzca numero ");
		 	tabla[i]=tcl.nextInt();
		 }
		 //elegimos la posicion a eliminar
		 System.out.println("elige la posicion a eliminar ");
		 posicion = tcl.nextInt();
		 
		 for (int i=posicion;i<9;i++) {
			 tabla[i] = tabla[i+1]; 
		 }
		 
			 System.out.println("La tabla queda: ");
			 for (int i=0;i<9;i++) 
			 System.out.print(tabla[i]);
		 
		 
	}

}
