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
public class Game {

	//pedir por teclado la vida del jugador y su poder
	//pedir por teclado la vida del enemigo y su poder
	
	//hacer un menu que se repita con tres opciones
	//1.golpea jugador
	//2.golpea enemigo
	//3.salir
	//se debe repetir hasta salir, o cuando  enemigo o jugador tenga vida a cero
	//se debe ir mostrando la vida del jugador y del enemigo
	
	public static int golpearJugador(int poderEnemigo, int vidaJugador) {
		
		vidaJugador=vidaJugador-poderEnemigo;
		return vidaJugador;
	}
	public static int golpearEnemigo(int poderJugador, int vidaEnemigo) {
		
		vidaEnemigo=vidaEnemigo-poderJugador;
		return vidaEnemigo;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		int vidaJugador=0, vidaEnemigo=0;
		int poderJugador=0, poderEnemigo=0;
		
		System.out.println("Introduce la vida del Jugador");
		vidaJugador=tcl.nextInt();
		System.out.println("Introduce el poder del Jugador");
		poderJugador=tcl.nextInt();
		System.out.println("---------------------------------");
		System.out.println("Introduce la vidad del Enemigo");
		vidaEnemigo=tcl.nextInt();
		System.out.println("Introduce el poder del Enemigo");
		poderEnemigo=tcl.nextInt();
		
		
		int opcion;
		do {
			System.out.println("-----------MENU------------");
			System.out.println("1. Golpear jugador");
			System.out.println("2. Golpear enemigo");
			System.out.println("---------------------------");
			
			System.out.println("Introduce una opcion");
			opcion=tcl.nextInt();
			switch (opcion) {
				case 1: 
					vidaJugador=golpearJugador(poderEnemigo, vidaJugador);
					System.out.println("VidaJugador = "+vidaJugador);
					break;
					
				case 2: 
					vidaEnemigo=golpearEnemigo(poderJugador, vidaEnemigo);
					System.out.println("VidaEnemigo = "+vidaEnemigo);
					break;
			}
			
		} while (vidaJugador>0 && vidaEnemigo>0);
		
	}

}
