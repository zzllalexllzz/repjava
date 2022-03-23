package primeraevaluacion;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

public static void sumaFilaMatriz(int matriz[][],int fila) {
		
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
	public static void suma2Diagonales(int matriz[][]) {
		int suma=0;
		int suma2=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i==j) {
					suma=suma+matriz[i][j];
				}
				if (i+j == matriz.length-1) {
					suma2=suma2+matriz[i][j];
				}
				
			}
		}
		System.out.println("diagonal1: "+suma);
		System.out.println("diagonal2: "+suma2);
	}
	public static double matrizMedia(int matriz[][]) {
		double suma=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma=suma+matriz[i][j];
			}
		}
		return suma;
	}
	public static int[][] matrizTranspuesta(int matrizTrans[][], int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizTrans[j][i]=matriz[i][j];
			}
		}
		return matrizTrans;
	}
	public static int[] burbuja(int[] vector) {
		
		int aux;
		for (int i=vector.length;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				if (vector[j] < vector[j+1]) {
					aux = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = aux;
				}
			}
		}
		
		return vector;
	}
	public static void ordenaFilas(int[][] matriz) {
		for(int i=0; i<matriz.length; i++)
			burbuja(matriz[i]);
	}
	public static int[][] rellenarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int)(Math.random()*100+1);
			}
		}
	
	return matriz;
	}
	public static void pintarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j]+" ");
				
			}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][]= new int[20][20];
		int matrizTrans[][]= new int[20][20];
		int fila;
		
		rellenarMatriz(matriz);
		
		int opcion;
		try {
			do {
				System.out.println("--------------MENU----------MENU----------------MENU--------------");
				System.out.println("1. Suma de una fila que se pedirá al usuario");
				System.out.println("2. Suma de una columna que se pedirá al usuario");
				System.out.println("3. Sumar la diagonal principal y la diagonal inversa");
				System.out.println("4. La media de todos los valores de la matriz");
				System.out.println("5. Pinta la matriz traspuesta");
				System.out.println("6. Muestra la matriz con las filas ordenadas de mayor a menor");
				System.out.println("7. Salir");
				
				Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
				System.out.println("Introduce una opcion");
				opcion=tcl.nextInt();
				switch (opcion) {
				case 1:
					pintarMatriz(matriz);
					System.out.println("introduce la fila que quieras sumar");
					fila=tcl.nextInt();
				
					sumaFilaMatriz(matrizTrans, fila);
					
					break;
				case 2:
					
					break;
				case 3:
					pintarMatriz(matriz);
					System.out.println("resultado");
					suma2Diagonales(matriz);
					break;
				case 4:
					pintarMatriz(matriz);
					System.out.println("resultado");
					System.out.println("La media es: "+matrizMedia(matriz)/matriz.length);
					break;
				case 5:
					pintarMatriz(matriz);
					System.out.println("resultado");
					matrizTranspuesta(matrizTrans, matriz);
					pintarMatriz(matrizTrans);
					break;
				case 6:
					pintarMatriz(matriz);
					System.out.println("resultado");
					ordenaFilas(matriz);
					pintarMatriz(matriz);
					break;
				case 7:
					System.out.println("PROGRAMA FINALIZADO");
					break;
				}
			} while (opcion!=7);
		} catch (InputMismatchException ex) {
			System.out.println("Debe inroducir un numero entero y positivo");
		}
		
		
	}

}
