package AlgoritmoOrdenacion;

public class Ejercicio3 {
	/*
	 *Realiza un método que tome como parámetros de entrada dos 
	 *arrays de enteros y devuelva como salida un único array 
	 *con los dos elementos de los anteriores arrays ordenados 
	 *de forma ascendente.
	 */
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
		 * metodo que inserta dos vectores a uno de mayor tamaño
		 * @param vector1
		 * @param vector2
		 * @param vector3
		 * @return
		 */
		public static int[] insertarTablas(int vector1[], int vector2[], int vector3[]) {
			int num=0;
			for (int i = 0; i < 5; i++) {
				vector3[num]=vector1[i];
				num++;
				vector3[num]=vector2[i];
				num++;
			}
			return vector3;
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

			int vector1[] = new int[5];
			int vector2[] = new int[5];
			int vector3[] = new int[10];
			
			rellenarVector(vector1);
			rellenarVector(vector2);
			insertarTablas(vector1, vector2, vector3);
			metodoBurbuja(vector3);
			pintarVector(vector3);
	}

}
