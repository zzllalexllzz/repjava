/**
 * 
 */
package EjerciciosClase;

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
		//Imprime la siguiente tabla
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <=5; j++) {
				
				if (i==j) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
					
			}
			System.out.println(" ");
		}
	}

}
