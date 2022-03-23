/**
 * 
 */
package EjerciciosClase;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author darge
 *
 */
public class Arrays {

	public static void pintarNotas(int notas[]) {
		//notas.lenght nos dice el tamaño del array --->notas.lenght es = a 10
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i]+", ");
		}
		System.out.println();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int notas[];//array de notas
		int numNotas=10;//tamaño de array
		
		//inicializa el array diciendole el tamaño
		notas= new int[numNotas];
		
		
		try {
			//escaner del teclado
			Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

			for (int i = 0; i < numNotas; i++) {
				System.out.println("dime una nota");
				int valor=tcl.nextInt();
				
				//meto el valor leido de teclado
				notas[i]=valor;
			}
			//cerrar scanner
			tcl.close();
		} catch (Exception e) {
			System.out.println("error leyendo el teclado");
		}
		
		//pinta las notas
		pintarNotas(notas);
		
		
		//calcular la media
		int total=0;
		for (int i = 0; i < notas.length; i++) {
			total=total+notas[i];
		}
		System.out.println("nota final"+total/numNotas);
		
	
		
		
	}

}
