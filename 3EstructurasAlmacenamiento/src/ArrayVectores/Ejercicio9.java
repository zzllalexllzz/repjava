package ArrayVectores;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {
/*
 *Igual que el anterior, pero desplazando N posiciones 
 *(N es un número introducido por el usuario).
 */
	/**
	 * pinta el vector
	 * @param numeros
	 */
	public static void pintarVector(int[] numeros) {
		System.out.print("[ ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+"  ");
		}
		System.out.print("]");
	}
	/**
	 * metodo rrellena un vector
	 * @param vector
	 * @param tcl
	 * @return
	 */
	public static int[] rellenaVector(int vector[], Scanner tcl) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("introduce un numero vector "+(i+1));
			vector[i]=tcl.nextInt();
		}
		return vector;
	}
	/**
	 * metodo desplazar una pocicion
	 * @param num
	 * @return
	 */
	public static int[] desplazar(int num[]) {
		//guarda la ultima posicion
		int posicionUlt=num[4];
		//desplasa una posicion
		for (int i = num.length-2; i >= 0; i--) {
			num[i+1]=num[i];
		}
		//asigna la ultima posicion al primero
		num[0]=posicionUlt;
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int num[]=new int[5];
		//rrellena el vector mediante teclado
		rellenaVector(num, tcl);
		//pinta el vector
		pintarVector(num);
		
		System.out.println();
		//inserta por teclado la cantidad de veces que va desplaza
		System.out.println("introduce las veces que quieres desplazar");
		int despazar=tcl.nextInt();
		for (int i = 0; i < despazar; i++) {
			desplazar(num);//llama al metodo desplazar una pocicion
		}
		
		pintarVector(num);
		
		tcl.close();
	}

}
