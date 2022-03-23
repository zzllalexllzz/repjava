/**
 * 
 */
package ejemplos;

/**
 * @author darge
 *
 */
public class Ejemplo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		for (int i = 1; i <= 10; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		for (int i = 0; i <= 10; ++i) {
			System.out.print(i+" ");
		}
		
		
		for (int i = 100; i>=0; i-=2) {
			System.out.print(i+" ");
		}
		
		//muestra los impares del 1 al 100 
		//pero la i>50que termine el bucle
		//que el for sume 1 a 1
		System.out.println(" ");
		for (int i=1; i<=100; i++) {
			
				if (i%2==0)
					continue;
				
				if (i>50) 
					break;
					
					System.out.print(i+" ");
				
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
