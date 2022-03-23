/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio6 {
	/*
	 * funcion de orden creciente
	 */
	public static boolean creciente (int orden[]) {
		boolean creciente = false;
		for(int i=0; i<4; i++) {
				if(orden[i] < orden[i+1]) {
					creciente=true;
				}
		}
		return creciente;	
	}
	/*
	 * funcion de orden decreciente
	 */
	public static boolean decreciente (int orden[]) {
		boolean decreciente = false;
		for(int i=0; i<4; i++) {
				if(orden[i] > orden[i+1]) {
					decreciente=true;
				}
		}
		return decreciente;	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int orden[] = new int[5];
		Scanner tcl = new Scanner(System.in);
		
		
		for(int i=0; i<5; i++) {
			System.out.print("intrducir numero ");
			orden[i]= tcl.nextInt();
		}
		//llamamos a las funciones 
		if (creciente(orden)==true && decreciente(orden)==false) {
            System.out.println("Creciente");
        }else if (creciente(orden)==false && decreciente(orden)==true) {
            System.out.println("Decreciente");
        }else{
            System.out.println("Desordenado");
        }
			
		tcl.close();
	}

}
