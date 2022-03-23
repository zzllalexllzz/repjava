/**
 * 
 */
package Arrays;

import java.util.Scanner;

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

		int A[] = new int[5];
		int B[] = new int[5];
		int C[] = new int[10];
		Scanner tcl = new Scanner(System.in);
		//array A
		for(int i=0; i<5; i++) {
			System.out.print("introduzca los numero del array A ");
			A[i]=tcl.nextInt();
		}
		
		//array B
		for(int i=0; i<5; i++) {
			System.out.print("introduzca los numero del array B ");
			B[i]=tcl.nextInt();
		}
		
		//mezclamos los dos arrays
		int num = 0;
		for(int i=0; i<5; i++) {
			C[num]= A[i];
			num++;
			C[num]= B[i];
			num++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(C[i]+" ");
		}
		
		
		tcl.close(); 
	}

}
