/**
 * 
 */
package Arrays;

/**
 * @author darge
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int suma=0;
		int media, mayor ,menor;
		mayor = menor = num[0];
		
		
		
		for (int i=0; i<num.length ;i++) {
			suma=suma+num[i];
		}
		media=suma/num.length;
		System.out.println("la media es "+media);
		
		
		for(int i=0; i<num.length ;i++) {
			if (num[i]>mayor)
				mayor = num[i];		
		}
		System.out.println("el numero mayo es "+mayor);
		
		for(int i=0; i<num.length ;i++) {
			if (num[i]<menor)
				menor = num[i];
		}
		System.out.println("el numero menor es "+menor);
	}

}
