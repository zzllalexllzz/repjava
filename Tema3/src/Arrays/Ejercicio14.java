/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		
		int matriz[][] = new int[5][3];
		int menor=999;
		int mayor=0;
		int suma = 0;
		int media;
		
		
		//introducimos los valores de la matriz
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("introduce los valores de la matriz ["+i+"] ["+j+"] ");
				matriz[i][j]=tcl.nextInt();
			}
		}
		
		//mostramos la matiz
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}

		
		//buscamos el menor y mayor
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j]>mayor) {
					mayor=matriz[i][j];
				}
				if(matriz[i][j]<menor) {
					menor=matriz[i][j];
				}
			}
		}
		
		//sacamos la media
		for(int i=0;i<5;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				suma=suma+matriz[i][j];
			}
		}
		media =suma/matriz.length;
		
		System.out.println("el mayor es "+mayor);
		System.out.println("el menor es "+menor);
		System.out.println("la media es "+media);
	}

}
