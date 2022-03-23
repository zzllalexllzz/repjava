package Matrices;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio15 {
/*
 *Crear dos matrices 3x3 de números enteros (leídos desde teclado), 
 *sumarlas y mostrar su suma. El resultado será también una matriz 
 *(suma) donde cada elemento será la suma de los elementos de las 
 *otras matrices en la misma posición.
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
	public static int[][] sumaMatrices(int matrizA[][], int matrizB[][],int matrizC[][]) {
		
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				matrizC[i][j]=matrizA[i][j] + matrizB[i][j];
			}
		}
		return matrizC;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int matrizA[][]=new int[3][3];
		int matrizB[][]=new int[3][3];
		int matrizC[][]=new int[3][3];
		
		
		rellenarMatriz(matrizA, tcl);
		rellenarMatriz(matrizB, tcl);
		
		System.out.println();
		System.out.println("----matrizA---");
		pintarMatriz(matrizA);
		System.out.println();
		System.out.println("----matrizB---");
		pintarMatriz(matrizB);
		System.out.println();
		
		sumaMatrices(matrizA, matrizB, matrizC);
		
		System.out.println("----matrizC---");
		pintarMatriz(matrizC);
	}

}
