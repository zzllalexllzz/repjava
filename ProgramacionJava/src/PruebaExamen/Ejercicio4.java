package PruebaExamen;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	/**
	 * Genera combinación aleatoria de dígitos (0 - 9)
	 * @param vector, donde se guarda la combinación
	 */
	public static void generarPalabra(int vector[]) {
		for(int i=0; i<vector.length; i++) {
			vector[i] = (int) (Math.random()* 9+1);
		}
		
	}
	/**
	 * pinta un vector
	 * @param vector
	 */
	public static void pintarNumero(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		int opcion;
		
		do {
			System.out.println("++++++++Master-Mind+++++++++");
			System.out.println("1.- Nueva partida");
			System.out.println("2.- Salir");
			
			System.out.println("introduce una opcion");
			opcion=tcl.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("introduzca un la longitud de cifras");
				int longitud=tcl.nextInt();
				int numStr[]=new int[longitud];
				generarPalabra(numStr);
				pintarNumero(numStr);
				
				
				break;
			case 2:
				System.out.println("prograa terminado");
				break;
			default:
				break;
			}
			
		} while (opcion!=2);
		
		tcl.close();
	}

}
