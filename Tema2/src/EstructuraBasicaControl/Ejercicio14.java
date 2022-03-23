/**
 * 
 */
package EstructuraBasicaControl;

/**
 * @author darge
 *
 */
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int tabla=4;
		
		for(int i=0; i<tabla; i++) {
			
			for(int j=4; j>i+1; j--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
