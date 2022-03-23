/**
 * 
 */
package Ampliacion;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Ejercicio32 {
	

	public static boolean bisiesto(int anio) {
		boolean bisiesto=false;
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			bisiesto=true;
		}
		return bisiesto;
		
	}
	public static boolean fechaCorrecta(int dia, int mes, int anio) {
        boolean diaCo=false;
        boolean mesCo=false;
        boolean anioCo=false;
        
		if (anio>0) {
			anioCo=true;
		}
		if (mes>=1 && mes<=12) {
			mesCo=true;
		}
        switch (mes) {
            case 2:
            	if (bisiesto(anio) && dia>=1 && dia<=29) {
            		diaCo=true;
            	}else if (dia>=1 && dia<=28) {
					diaCo=true;
				}
            	
                break;
            case 4:
            case 6:
            case 9:
            case 11:
            	if (dia>=1 && dia<=30) {
					diaCo=true;
				}
                break;
            default:
            	if (dia>=1 && dia<=31) {
					diaCo=true;
				}
        }
        return diaCo && mesCo && anioCo;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("introduce el dia");
		int dia=tcl.nextInt();
		System.out.println("introduce el mes");
		int mes=tcl.nextInt();
		System.out.println("introduce el anio");
		int anio=tcl.nextInt();
		
		System.out.println("¿la fecha es valida?");
		System.out.println(fechaCorrecta(dia, mes, anio));
		System.out.println("¿el año es bisiesto?");
		System.out.println(bisiesto(anio));
		
		
		tcl.close();
	}

}
