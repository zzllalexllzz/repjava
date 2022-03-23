package Matrices;

public class Ejercicio16 {
/*
 *Crea una matriz de 3x6 números enteros aleatorios no repetidos
 */
	/**
	 * da un numero aleatorio
	 * @return
	 */
	public static int numAleatorio() {
		int num=0;
		num=(int)(Math.random()*49+1);
		
		return num;
	}
	/**
	 * verifica si el numero esta repetido
	 * @param num2
	 * @param matriz
	 * @return
	 */
	public static boolean repetido(int num, int matriz[][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]==num) {
					return true;
				}
			}
		}
		return false;
	}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][]=new int[3][6];
		
		int num=0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				do {
					num=numAleatorio();
				} while (repetido(num,matriz));
				
				matriz[i][j]=num;
			}
		}
		
		pintarMatriz(matriz);
		
	}

}
