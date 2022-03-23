/**
 * 
 */
package Ordenacion;

/**
 * @author darge
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = new int[50];
		int ayuda;
		
		
		//pintamos el array de 50 elementos aleatorio de 1 al 100
		for (int i=0; i<array.length;i++) {
			array[i] = (int) (Math.random()*100+1);
		}
		//pintamos el array antes de ordenarlo
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println(" ");
		
		//metodo burbuja  de ordenacion
	
		for (int i=array.length;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				if (array[j] > array[j+1]) {
					ayuda= array[j+1];
					array[j+1] = array[j];
					array[j] = ayuda;
				}
			}
		}
		
		//pintamos el array ordenado
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
