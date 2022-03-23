/**
 * 
 */
package EjerciciosClase;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//menu suma resta multiplicar dividir y salir
		
		int opcion=0;
		double num1=0 ,num2=0;
		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		try {
		do {
			System.out.println("==========MENU=========");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			System.out.println("=======================");
			
			System.out.println("Introduce una opcion");
			opcion=tcl.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("Introduce el primer numero");
				num1=tcl.nextDouble();
				System.out.println("Introduce el segundo numero");
				num2=tcl.nextDouble(); 
				System.out.println("El resusltado es "+(num1+num2));
				break;
					}
			case 2: {
				System.out.println("Introduce el primer numero");
				num1=tcl.nextDouble();
				System.out.println("Introduce el segundo numero");
				num2=tcl.nextDouble();
				System.out.println("El resusltado es "+(num1-num2));
				break;
					}
			case 3: {
				System.out.println("Introduce el primer numero");
				num1=tcl.nextDouble();
				System.out.println("Introduce el segundo numero");
				num2=tcl.nextDouble();
				System.out.println("El resusltado es "+(num1*num2));
				break;
					}
			case 4: {
				System.out.println("Introduce el primer numero");
				num1=tcl.nextDouble();
				System.out.println("Introduce el segundo numero");
				num2=tcl.nextDouble();
				System.out.println("El resusltado es "+(num1/num2));
				break;
					}
			case 5: {
				System.out.println("Programa terminado");
				break;
					}
			}
		}while(opcion!=5);
		
		tcl.close();
		}catch(InputMismatchException ex) {
			System.out.println("El dato que has introducido es incorrecto");
		}
	}
}

		
		
	
		
	



