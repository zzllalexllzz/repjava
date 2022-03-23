/**
 * 
 */
package Ordenacion;

/**
 * @author darge
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = new int[50];
		int mayor=0;
		int menor=999;
		int suma=0;
		int media;
		
		
		//pintamos el array de 50 elementos aleatorio de 1 al 100
		for (int i=0; i<array.length;i++) {
			array[i] = (int) (Math.random()*50+1);
		}
		//leemos el array
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println("");
		//sacamos el mayor y menor numero del array
		for (int i=0; i<array.length; i++) {
			if(array[i]>mayor) {
				mayor=array[i];
			}
			if(array[i]<menor) {
				menor=array[i];
			}
		}
		//sacamos la suma para sacar la media
		for (int i=0; i<array.length; i++) {
			suma=suma+array[i];
		}
		media=suma/array.length;
		
		System.out.println("el numero mayor es "+mayor);
		System.out.println("el numero menor es "+menor);
		System.out.println("la media de todo el array es "+media);
					
	}

}
