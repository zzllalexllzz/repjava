/**
 * 
 */
package Arrays;

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


		int[] num= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println(" ");
		for(int i=num.length-1; i>=0; i--) {
			System.out.print(num[i]); 
		}
	}

}
