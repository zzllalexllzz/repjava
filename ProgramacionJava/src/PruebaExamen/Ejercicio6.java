package PruebaExamen;

import java.util.Arrays;

public class Ejercicio6 {

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
	public static void pintarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	public static int[] rellenarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=100;
		}
		return vector;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[5];
		int array2[] = new int[5];
		
		Arrays.fill(array, 100);
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			array[i]=array[i]-1;
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		array2= Arrays.copyOf(array, 5);
		System.out.println(Arrays.toString(array2));
	}
}
