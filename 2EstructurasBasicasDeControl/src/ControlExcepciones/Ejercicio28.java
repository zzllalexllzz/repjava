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
public class Ejercicio28 {
/*
 *Pedir el día, mes y anio de una fecha y mostrar la fecha del 
 *día siguiente (sin años bisiestos). Hacer primero una función 
 *para determinar que la fecha introducida es correcta.
 */
	/**
	 * 
	 * @param dia
	 * @param mes
	 * @param anio
	 * @return retorna true  si la fecha en los rangos de dia mes y anio
	 */
	public static boolean fechaCorrecta(int dia, int mes, int anio) {
	        boolean diaCo=false;
	        boolean mesCo=false;
	        boolean anioCo=false;
	        //que el alo anio no sea menor q 0
			if (anio>0) {
				anioCo=true;
			}
			//que el mes sea de 1 a 12
			if (mes>=1 && mes<=12) {
				mesCo=true;
			}
			//segun el mes sacara el rango des cada uno por dia que contiene 
	        switch (mes) {
	            case 2:
	            	//que el mes tenga  de  1 a 28 dias
	            	if (dia>=1 && dia<=28) {
						diaCo=true;
					}
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	            	//que el caso 4,6,9,11 sea de 1 a 30 dias
	            	if (dia>=1 && dia<=30) {
						diaCo=true;
					}
	                break;
	            default:
	            	//por defecto los casos que faltan sea de 1 a 31 dias 
	            	if (dia>=1 && dia<=31) {
						diaCo=true;
					}
	        }
	        //true si la fecha esta en el rango 
	        return diaCo && mesCo && anioCo;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

			System.out.println("introduce el dia");
			int dia=tcl.nextInt();
			System.out.println("introduce el mes");
			int mes=tcl.nextInt();
			System.out.println("introduce el anio");
			int anio=tcl.nextInt();
			
			//llama a la funcion para ver si la fecha es correcta
			System.out.println(fechaCorrecta(dia, mes, anio));
			
			//modifica la fecha al dia siguiente
			if (fechaCorrecta(dia, mes, anio)) {
				dia++;
			}
			if(!fechaCorrecta(dia, mes, anio)) {
				dia=1;
				mes++;
			}
			if (!fechaCorrecta(dia, mes, anio)) {
				mes=1;
				anio++;
			}
			//pinta la fecha siguiente
			System.out.println("fecha siguiente "+dia+"/"+mes+"/"+anio);
			
			tcl.close();
			
		} catch (InputMismatchException ex) {
			System.out.println("Debe inroducir un numero entero y positivo");
		}
	}

}
