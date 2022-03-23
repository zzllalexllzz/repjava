package AlgoritmoOrdenacion;

public class Ejercicio5 {
/*
 *Realiza un programa que cree 100 números aleatorios 
 *entre 1 y 1000 y que muestre los 10 mayores.
 */
	/**
	 * metodo saca las 10 ultimas posiciones de un vector ordenado
	 * @param vector1
	 */
	public static void vector10Mayores(int vector1[]) {
		for (int i = vector1.length-1; i > vector1.length-11 ; i--) {
			System.out.print(vector1[i]+" ");
		}
	}
	/**
	 * metodo burbuja ordena un vector
	 * @param matriz
	 */
	public static void metodoBurbuja(int matriz[]) {
		int aux;
	    for (int i=matriz.length; i>0; i--) {
	        for (int j=0; j<i-1; j++) {
	            if (matriz[j]>matriz[j+1]) {
	                aux = matriz[j+1];
	                matriz[j+1]=matriz[j];
	                matriz[j]=aux;
	            }
	        }
	    }
	}
	/**
	 * metodo pintar un vector
	 * @param vector
	 */
	public static void pintarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	/**
	 * metodo rrellena un vector
	 * @param vector
	 * @return
	 */
	public static int[] rellenarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*1000+1);
		}
		return vector;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector1[] = new int[100];
		
		rellenarVector(vector1);
		pintarVector(vector1);
		System.out.println();
		metodoBurbuja(vector1);
		pintarVector(vector1);
		System.out.println();
		vector10Mayores(vector1);
		
	}

}
