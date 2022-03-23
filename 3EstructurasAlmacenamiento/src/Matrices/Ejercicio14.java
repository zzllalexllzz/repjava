package Matrices;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio14 {
/*
 *Crear una matriz 5x3 de números enteros (leídos desde teclado) y 
 *mostrar el menor, el mayor y la media de los elementos 
 *almacenados en la matriz.
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
	/**
	 * matriz que devuelve mayor menor y media
	 * @param matriz
	 */
	public static void matrizMaMeMed(int matriz[][]) {
		int mayor=0;
		int menor=10000;
		double suma=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma=suma+matriz[i][j];
				if (matriz[i][j]>mayor) {
					mayor=matriz[i][j];
				}
				if (matriz[i][j]<menor) {
					menor=matriz[i][j];
				}
			}
		
		}
		System.out.println("el mayor es "+mayor);
		System.out.println("el menor es "+menor);
		System.out.println("la media es "+(suma/matriz.length));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int matriz[][]=new int[5][3];
		
		rellenarMatriz(matriz, tcl);
		pintarMatriz(matriz);
		System.out.println();
		System.out.println("-------------");
		matrizMaMeMed(matriz);
		
	}

}
