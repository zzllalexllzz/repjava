/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio24 {
	public static boolean nPrimo(int num1) {
		int contador=2;
		boolean primo=true;
		while((primo)&&(contador!=num1)) {
			if(num1%contador==0)
				primo=false;
			contador++;		
		}
		return primo;
	}
	
	public static  int primo (int num1, int conta) {
		for (int i=1; i<=num1; i++) {
			if((num1%i)==0) {
				conta++;
			}
		}
		return conta;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int num1;
		int conta=0;
		
		
		//introducimos un numero or teclado
		System.out.println("intruduce un numero");
		num1 = tcl.nextInt();
		//comprobamos si es primo o no
		if (primo(num1,conta)<=2) {
			System.out.println("el numero es primo");
		}else {
			System.out.println("el numero no es primo");
		}
		
		for(int i=1; i<=num1; i++) {
			if(nPrimo(i))
				System.out.println(i+" ");
		}
		
		
		// esty super liado con este ejercicio pero  super  he
		tcl.close();
	}

}
