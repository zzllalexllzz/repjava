/**
 * 
 */
package BuclesCondicionales;

/**
 * @author darge
 *
 */
public class Ejercicio16 {
/*
 * Programa que muestre por pantalla los números del 1 
 * al 100 sin mostrar los que sean múltiplos de 5.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//bucle cuneta 0 al 100
		for (int i = 0; i <= 100; i++) {
			//condicion distintos de multiplos de 5
			if (!(i%5==0)) {
				//imprime numero sin multiplos de 5
				System.out.println(i);
			}
		}
	}

}
