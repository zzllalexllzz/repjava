/**
 * 
 */
package EstructuraBasicaControl;

import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio1 {
	/*
	 * funcion mayor de tres numeros 
	 * @param num1 num2 num3 
	 */
	public static int numeroMayor(int num1, int num2, int num3, int numMayor) {
		
		if(num1>num2 && num1>num3) {
            numMayor=num1;
        }
        if(num2>num1 && num2>num3) {
            numMayor=num2;
        }
        if(num3>num1 && num3>num2) {
            numMayor=num3;
        }
        return numMayor;
		
	}
	

	/**4
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//introducimos 4 numeros por teclado con scanner
		Scanner tcl = new Scanner(System.in);
		int num1, num2, num3, num4;
		int numMayor=0;
	
		System.out.println("introduzca primer numero");
		num1 = tcl.nextInt();
		System.out.println("introduzca segundo numero");
		num2 = tcl.nextInt();
		System.out.println("introduzca tercero numero");
		num3 = tcl.nextInt();
		System.out.println("introduzca cuarto numero");
		num4 = tcl.nextInt();
		
		numeroMayor(num1, num2, num3, numMayor);
		numMayor = numeroMayor(num1, num2, num3, numMayor);
        //utilizamos la funcion mayor de tres numeros para hacer de 4 numeros
		
		if (numMayor>num4) {
			System.out.println("el numero mayor es "+numMayor);
		}else {
			System.out.println("el numero mayor es "+num4);
		}
        //cerramos el scanner
		tcl.close();
	}

	
}
