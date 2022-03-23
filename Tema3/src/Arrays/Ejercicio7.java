/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio7 {
	/*
	 * funcion despalzar los numero praque  introduca uno nuevo en la posicion dicha
	 */
	public static int[] desplazar(int tabla[], int posicion, int numero) {
		
		for (int i=7;i>=posicion;i--) {
			 tabla[i+1]=tabla[i]; 
		 }
		// insertamos el nuevo numero
		tabla[posicion] =numero;
			 
		return tabla;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int tabla[]=new int[10];
		 int numero, posicion;
		 // leemos 8 números
		
		 for (int i=0;i<8;i++){
			System.out.print("introduzca numero ");
		 	tabla[i]=tcl.nextInt();
		 }
		
		 System.out.print("nuevo numero ");
		 numero = tcl.nextInt();
		 System.out.print("posición donde insertar de 0 a 8 ");
		 posicion = tcl.nextInt();
		 
		 
		 tabla=desplazar(tabla,posicion, numero);
		 
		System.out.println("la tabla queda ");
		for (int i=0;i<9;i++) {
			System.out.print(tabla[i]);
		}		 
	}

}
