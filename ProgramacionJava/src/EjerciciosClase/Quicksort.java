package EjerciciosClase;

import java.util.Iterator;

public class Quicksort {

	private static int particion(int arreglo[], int izquierda, int derecha) {
        int pivote = arreglo[izquierda];
        // Ciclo infinito
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {//Nota: yo sé que el else no hace falta por el return de arriba, pero así el algoritmo es más claro
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }
	// Divide y vencerás
	private static void quicksort(int arreglo[], int izquierda, int derecha) {
	    if (izquierda < derecha) {
	        int indiceParticion = particion(arreglo, izquierda, derecha);
	        quicksort(arreglo, izquierda, indiceParticion);
	        quicksort(arreglo, indiceParticion + 1, derecha);
	    }
	}
	
	public static int[] rrellenarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
				vector[i]=(int)(Math.random()*10+1);
		}
		return vector;
	}
	
	public static void pintarVector(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[]=new int[10];
		int izquierda;
		int derecha;
		
		rrellenarVector(vector);
		pintarVector(vector);
		izquierda=vector[0];
		derecha=vector[vector.length-1];
		
		quicksort(vector, izquierda, derecha);
		System.out.println();
		pintarVector(vector);
		
	}

}
