package AlgoritmoOrdenacion;

public class Ejercicio1 {
/*
 *Realiza un programa que cree un array de 50 posiciones cargado 
 *con valores aleatorios. Los valores aleatorios deber�n estar 
 *entre el 1 y el 100. Una vez cargado el vector, deber� ordenarlo 
 *mediante el m�todo de la burbuja y mostrarlo ordenado por 
 *pantalla. Para el m�todo de la burbuja deber�s crear una funci�n 
 *que reciba un array de n�meros y lo devuelva ordenado.
 */
	/**
	 * metodo burbuja ordena un array
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
     * metodo rrellena un vector
     * @param vector
     * @return
     */
	public static int[]  rellenarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*100+1);
		}
		return vector;
	}
	/**
	 *metodo pinta un vector
	 * @param vector
	 */
	public static void pintarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[]=new int[50];
		rellenarVector(vector);
		pintarVector(vector);
		System.out.println();
		metodoBurbuja(vector);
		pintarVector(vector);
	}

}
