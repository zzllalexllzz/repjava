/**
 * 
 */
package ControlExcepciones;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio26 {
/*
 *Pedir un número entre 1 y 999 y mostrarlo con las cifras al revés. 
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
			
			int resul=0;
			int centenas=0;
			int decenas=0;
			int unidades=0;
			
			System.out.println("introduce un numero entre 1 y 999");
			int num=tcl.nextInt();
			
			//condicion que el rango sea de  1 a 999
			if (num>=1 && num<=999) {
				//condicion de si el rango es de 1 - 9 solo pinte el num
				if (num>=1 && num<=9) {
					System.out.println("la cifras al reves es "+num);
					//condicion con rango 10 - 99 pinte al revez
				}else if (num>=10 && num<=99) {
					 decenas=num/10;
					 unidades=(num-(decenas*10));
					 resul=decenas+(unidades*10);
					 System.out.println("la cifras al reves es "+resul);
					 //por defecto de 100 - 999
				}else {
					centenas=num/100;
					decenas=(num-(centenas*100))/10;
					unidades=(num-(centenas*100)-(decenas*10));
					resul=centenas+(decenas*10)+(unidades*100);
					System.out.println("la cifras al reves es "+resul);
				}
				//si el rango se excede saldra un mensaje
			} else {
				System.out.println("ERROR. a exedido el rango de 1 a 999");
			}
			
			tcl.close();
		} catch (InputMismatchException ex) {
			System.out.println("Debe inroducir un numero entero y positivo");
		}
	}

}
