package EjerciciosClase;

public class EjemploMatrices {

	/**
	 * pinta la matriz
	 * @param num
	 */
	public static void pintarMatriz(int num[][]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}
	/**
	 * llena la matriz con numero aleatorios
	 * @param num
	 * @return
	 */
	public static int[][] llenarMatriz(int num[][]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j]=(int)(Math.random()*100+1);
			}
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[][]=new int[4][6];
		//llama a al metodo llenar matriz
		llenarMatriz(num);
		//llama a al metodo pintar matriz
		pintarMatriz(num);
	}

}
