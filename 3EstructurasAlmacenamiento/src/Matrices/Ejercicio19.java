package Matrices;



public class Ejercicio19 {

	public static void sumarMatriz(int matriz[][]) {
		int suma=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma=suma+matriz[i][j];
			}
		}
		System.out.println("   "+suma);
	}
	
	public static void sumaColumnaMatriz(int matriz[][]) {
		
		for (int i = 0; i < matriz[0].length; i++) {
			int suma=0;
			for (int j = 0; j < matriz.length; j++) {
				suma=suma+matriz[j][i];
			}
			System.out.print(suma+"  ");
		}
	}
	/**
	 * pinta la matriz
	 * @param matriz
	 */
	public static void pintarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			int suma=0;
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"   ");
				suma=suma+matriz[i][j];
			}
			System.out.println("-> "+suma);
			System.out.println();
		}
	}
	/**
	 * rrellena la matriz 
	 * @param matriz
	 * @param tcl
	 * @return
	 */
	public static int[][] rellenarMatrizAlea(int matriz[][]) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j]=(int)(Math.random()*8+1);
				}
			}
		return matriz;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][]=new int[4][5];
		rellenarMatrizAlea(matriz);
		pintarMatriz(matriz);
		sumaColumnaMatriz(matriz);
		sumarMatriz(matriz);
	}

}
