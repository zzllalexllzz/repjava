package AlgoritmoOrdenacion;

public class Ejercicio4 {
/*
 *Realiza un programa que cree un vector de 50 posiciones con 
 *número aleatorios entre 1 y 50. Una vez creado el vector, 
 *el programa deberá mostrar el mayor, el menor y la media 
 *de los valores almacenados en el array.
 */
	/**
	 * metodo para sacar la suma de un vector y hacer la media
	 * @param vector1
	 * @return
	 */
	public static double vectorMedia(int vector1[]) {
		double suma=0;
		for (int i = 0; i < vector1.length; i++) {
			suma=suma+vector1[i];
		}
		
		return suma;
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
	 * metodo pinta un vector
	 * @param vector
	 */
	public static void pintarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	/**
	 * metodo rrellena un vector con numeros ramdom
	 * @param vector
	 * @return
	 */
	public static int[] rellenarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*50+1);
		}
		return vector;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector1[] = new int[5];
		
		rellenarVector(vector1);
		pintarVector(vector1);
		System.out.println();
		metodoBurbuja(vector1);
		pintarVector(vector1);
		System.out.println();
		System.out.println("la media es "+(vectorMedia(vector1)/vector1.length));//media
		System.out.println("el menor es "+vector1[0]);//menor
		System.out.println("el mayor es "+vector1[vector1.length-1]);//mayor
	}

}
