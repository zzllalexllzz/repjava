/**
 * 
 */
package EjerciciosClase;

/**
 * @author darge
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dados dos números h y k, muestra todos los números
		//múltiplos de 5 que hay entre ellos
		int h=10; 
		int k=150;
		for (int i = h; i <k ; i++) {
			if (i%5==0) {
				System.out.println(i);
			}
			
		}
	}

}
