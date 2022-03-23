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
public class Ejercicio27 {
/*
 * Pedir un número entre 1 y 9999 y decir si es capicúa. 
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//control de excepciones
		try {
			Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
			
			int resul=0;
			int miles=0;
			int centenas=0;
			int decenas=0;
			int unidades=0;
			
			System.out.println("introduce un numero entre 1 y 9999");
			int num=tcl.nextInt();
			
			//condicion de rango de 1 a 9999
			if (num>=1 && num<=9999) {
				//rango de 1 a 9
				if (num>=1 && num<=9) {
					System.out.println("la cifras al reves es "+num);
					//rango de 10 a 99
				}else if (num>=10 && num<=99) {
					 decenas=num/10;
					 unidades=(num-(decenas*10));
					 resul=decenas+(unidades*10);
					 System.out.println("la cifras al reves es "+resul);
					 //rango de 100 a 999
				}else if (num>=100 && num<=999){
					centenas=num/100;
					decenas=(num-(centenas*100))/10;
					unidades=(num-(centenas*100)-(decenas*10));
					resul=centenas+(decenas*10)+(unidades*100);
					System.out.println("la cifras al reves es "+resul);
					//por defecto rango 1000 a 9999
				}else {
					miles=num/1000;
					centenas=(num-(miles*1000))/100;
					decenas=(num-(miles*1000)-(centenas*100))/10;
					unidades=(num-(miles*1000)-(centenas*100)-(decenas*10));
					resul=miles+(centenas*10)+(decenas*100)+(unidades*1000);
					System.out.println("la cifras al reves es "+resul);
				}
				//condicion si los numero se escriben igual por los dos lados
				if (num==resul) {
					System.out.println("es capicua");
				}else {
					System.out.println("no es capicua");
				}
				//si el rango se excede saldra un mensaje
			} else {
				System.out.println("ERROR. a exedido el rango de 1 a 9999");
			}
			
			tcl.close();
			//excepcion de erro al introducir el teclado
		} catch (InputMismatchException ex) {
			System.out.println("Debe inroducir un numero entero y positivo");
		}
	}

}
