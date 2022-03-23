/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		
		int matriz1[][] = new int[3][3];
		int matriz2[][] = new int[3][3];
		int suma1=0;
		int suma2=0;
		int suma3;
		
		//introducimos los valores de la matriz1
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("introduce los valores de la matriz1 ["+i+"] ["+j+"] ");
				matriz1[i][j]=tcl.nextInt();
			}
		}
		//introducimos los valores de la matriz2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("introduce los valores de la matriz2 ["+i+"] ["+j+"] ");
				matriz2[i][j]=tcl.nextInt();
			}
		}
				
		//mostramos la matiz1
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz1[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println(" ");
		//mostramos la matiz2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println("");
		}
		//sumo el primer matriz y el segundo
		for(int i=0;i<3;i++) {
			for(int j=0;j<matriz1[i].length;j++) {
				suma1=suma1+matriz1[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<matriz2[i].length;j++) {
				suma2=suma2+matriz2[i][j];
			}
		}
		
		suma3=suma1+suma2;
		System.out.println("el resultado de la suma de los dos matrizes es "+suma3);
		
		
	}

}
