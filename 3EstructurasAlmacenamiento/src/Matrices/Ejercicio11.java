package Matrices;

public class Ejercicio11 {

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
		
		int matriz[][]=new int[5][5];
		//bucle pinta lineade 1 en diagonal y 0 en el resto
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//si i y j son = pinta 1 sino 0
				if (i==j) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
			}
		}
		
		pintarMatriz(matriz);
		
	}

}
