package Matrices;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {
/*
 *Crear una tabla bidimensional de tamaño 3x4 de números enteros 
 *(leídos desde teclado). Mostrar la matriz y la suma de los 
 *valores de cada fila.
 */
	/**
	 * pinta la matriz
	 * @param matriz
	 */
	public static void pintarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j]+" ");
				
			}
		System.out.println();
		}
	}
	/**
	 * rrellena la matriz 
	 * @param matriz
	 * @param tcl
	 * @return
	 */
	public static int[][] rellenarMatriz(int matriz[][], Scanner tcl) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.println("intoduce un numero en la matriz "+(i+1)+" de "+(j+1));
						matriz[i][j]=tcl.nextInt();
					
				}
			}
		
		return matriz;
	}
	public static void sumaFilaMatriz(int matriz[][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			int suma=0;
			for (int j = 0; j < matriz[i].length; j++) {
				suma=suma+matriz[i][j];
			}
			System.out.print(suma+" ");
		}
	}
	public static void sumaColumnaMatriz(int matriz[][]) {
		
		for (int i = 0; i < matriz[0].length; i++) {
			int suma=0;
			for (int j = 0; j < matriz.length; j++) {
				suma=suma+matriz[j][i];
			}
			System.out.print(suma+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int matriz[][]=new int[3][4];
		
		rellenarMatriz(matriz, tcl);
		pintarMatriz(matriz);
		
		System.out.println();
		System.out.println("-----fila---");
		sumaFilaMatriz(matriz);
		System.out.println();
		System.out.println("----columna-----");
		sumaColumnaMatriz(matriz);
		
		
		
		
		tcl.close();
		
	}

}
