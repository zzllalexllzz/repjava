package AlgoritmoOrdenacion;



public class Ejercicio6 {
/*
 *Realiza un programa que cree un vector de 100 posiciones con números 
 *aleatorios entre 1 y 100. Una vez creado el vector, el programa 
 *deberá ordenarlo y mostrar los números entre 1 y 100 que no han sido 
 *almacenados. Ten en cuenta a la hora de buscar un número en un array 
 *que no tienes que comparar con todo el array puesto que ya está 
 *ordenado.
 */
	/**
	 * metodo pinta los numero que no se encuentran en un vector
	 * @param vector1
	 */
	public static void numNoSeEncuentranEnVector(int vector1[]) {

		for (int i = 0; i < vector1.length; i++) {
		    for(int j = 0; j < vector1.length; j++) {
		        if( i == vector1[j] ) {
		        	break;
		        }else if (i < vector1[j]) {
		            System.out.print(i+" ");
		        	break;
		        }
		    }
		}
	}
	/**
	 * metodo burbuja  ordena un vector
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
	 * metodo rrellena un vector con numero ramdom
	 * @param vector
	 * @return
	 */
	public static int[] rellenarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*100+1);
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
		numNoSeEncuentranEnVector(vector1);
		
	}

}
