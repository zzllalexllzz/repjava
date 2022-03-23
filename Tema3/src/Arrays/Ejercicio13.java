/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		
		int matriz[][] = new int[3][4];
		int sumaFilas = 0;
		
		//introducimos la matriz por teclado
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("introduce los valores de la matriz ["+i+"] ["+j+"] ");
				matriz[i][j]= tcl.nextInt();
			}
		}
		
		//mostramos la matiz
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
		//suma de filas
		for(int i=0;i<3;i++) {
			sumaFilas=0;
			for(int j=0;j<4;j++) {
				sumaFilas=sumaFilas+matriz[i][j];
			}
			System.out.print(sumaFilas);
		}
		
		System.out.println("");
		
	}

}
