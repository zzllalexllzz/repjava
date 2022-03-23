package PruebaExamen;

import java.util.Arrays;

public class Ejercicio5 {

	public static int busquedaBinaria(int vector[], int num) {
		int i=0;
		int j=vector.length-1;
		int mid=0;
		while (i<j) {
			mid=(i+j)/2;
			if (vector[mid]==num) {
				return mid;
			}
			if (vector[mid]<num) {
				i=mid+1;
			}else if(vector[mid]>num) {
				j=mid-1;
			}
		}
		
		return -1;
		
	}
	public static void pintarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	private static int[] rrellenarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*10+1);
		}
		return vector;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[]=new int[10];
		rrellenarVector(vector);
		Arrays.sort(vector);
		pintarVector(vector);
		
		System.out.println();
		System.out.println(Arrays.binarySearch(vector, 6));
		System.out.println(busquedaBinaria(vector, 6));
		
	}

}
