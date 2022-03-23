package Matrices;

public class Ejercicio23 {

	public static int[][] matrizTranspuesta(int matrizTrans[][], int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizTrans[j][i]=matriz[i][j];
			}
		}
		return matrizTrans;
	}
	public static void pintarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] rrellenaMatrizAlea(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int)(Math.random()*8+1);
			}
		}
		return matriz;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][]=new int[3][6];
		int matrizTrans[][]=new int[6][3];

		rrellenaMatrizAlea(matriz);//rrellena la matriz con numero aleatorios de 1 a 9
		
		pintarMatriz(matriz);//pinta la matriz
		
		System.out.println("---------------transpuesta--------------");
	
		matrizTranspuesta(matrizTrans, matriz);//cambia  la posicion de la matriz original
		
		pintarMatriz(matrizTrans);//pinta la mtriz
	}

}
