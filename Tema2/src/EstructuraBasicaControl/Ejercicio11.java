/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio11 {
	/*
	 * funcion q cuenta la cantidad de digitos de un un  numero
	 */
	public static int digitos (int num, int cantidad) {
		while(num !=0) {
			num=num/10;
			cantidad++;
		}
		return cantidad;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int cantidad=0;
		
		System.out.println("introduce un numero");
		int num = tcl.nextInt();
		
		
		System.out.println("el numero de digitos de "+num+" es de "+digitos(num, cantidad)+" digitos" ); 
		tcl.close();
	}

}
