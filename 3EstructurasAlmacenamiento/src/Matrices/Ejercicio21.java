package Matrices;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio21 {

	public static void comprobarGanador(char matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[0][0]=='X' && matriz[0][1]=='X' && matriz[0][2]=='X') {
					System.out.println("gano jugador1");
				}else if (matriz[0][0]=='O' && matriz[0][1]=='O' && matriz[0][2]=='O') {
					System.out.println("gano jugador2");
				}else if (matriz[1][0]=='X' && matriz[1][1]=='X' && matriz[1][2]=='X') {
					System.out.println("gano jugador1");
				}else if (matriz[1][0]=='O' && matriz[1][1]=='O' && matriz[1][2]=='O') {
					System.out.println("gano jugador2");
				}else if (matriz[2][0]=='X' && matriz[2][1]=='X' && matriz[2][2]=='X') {
					System.out.println("gano jugador1");
				}else if (matriz[2][0]=='O' && matriz[2][1]=='O' && matriz[2][2]=='O') {
					System.out.println("gano jugador2");
				}else if (matriz[0][0]=='X' && matriz[1][0]=='X' && matriz[2][0]=='X') {
					System.out.println("gano jugador1"); 	 
				}else if (matriz[0][0]=='O' && matriz[1][0]=='O' && matriz[2][0]=='O') {
					System.out.println("gano jugador2");
				}else if (matriz[0][1]=='X' && matriz[1][1]=='X' && matriz[2][1]=='X') {
					System.out.println("gano jugador1");
				}else if (matriz[0][1]=='O' && matriz[1][1]=='O' && matriz[2][1]=='O') {
					System.out.println("gano jugador2");
				}else if (matriz[0][2]=='X' && matriz[1][2]=='X' && matriz[2][2]=='X') {
					System.out.println("gano jugador1");
				}else if (matriz[0][2]=='O' && matriz[1][2]=='O' && matriz[2][2]=='O') {
					System.out.println("gano jugador2");
				}else if (matriz[0][0]=='X' && matriz[1][1]=='X' && matriz[2][2]=='X') {
					System.out.println("gano jugador1");
				}else if (matriz[0][0]=='O' && matriz[1][1]=='O' && matriz[2][2]=='O') {
					System.out.println("gano jugador2");
				}else if (matriz[0][2]=='X' && matriz[1][1]=='X' && matriz[2][0]=='X') {
					System.out.println("gano jugador1");
				}else if (matriz[0][2]=='O' && matriz[1][1]=='O' && matriz[2][0]=='O') {
					System.out.println("gano jugador2");
				}
			}
		}
		
		
	}
	public static void pintarMatriz(char matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		char matriz[][]=new char[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]='-';
			}
		}
		
		char jugador1='X';
		char jugador2='O';
		int fila;
		int columna;
		int opcion;
		do {
			System.out.println("Elije posicion");
			System.out.println("1.- Jugador1");
			System.out.println("2.- Jugador2");
			
			opcion=tcl.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Elije posicion");
				System.out.println("[0,0] [0,1] [0,2]");
				System.out.println("[1,0] [1,1] [1,2]");
				System.out.println("[2,0] [2,1] [2,2]");
				System.out.println("elije fila");
				fila=tcl.nextInt();
				System.out.println("elije columna");
				columna=tcl.nextInt();
				if (matriz[fila][columna]==jugador2) {
					System.out.println("esta posicion esta llena");
				}else {
					matriz[fila][columna]=jugador1;
				}
				System.out.println("----------");
				pintarMatriz(matriz);
				System.out.println("----------");
				comprobarGanador(matriz);
				break;
			case 2:
				System.out.println("Elije posicion");
				System.out.println("[0,0] [0,1] [0,2]");
				System.out.println("[1,0] [1,1] [1,2]");
				System.out.println("[2,0] [2,1] [2,2]");
				System.out.println("elije fila");
				fila=tcl.nextInt();
				System.out.println("elije columna");
				columna=tcl.nextInt();
				if (matriz[fila][columna]==jugador1) {
					System.out.println("esta posicion esta llena");
				}else {
					matriz[fila][columna]=jugador2;
				}
				System.out.println("----------");
				pintarMatriz(matriz);
				System.out.println("----------");
				comprobarGanador(matriz);
				break;
			case 3:
				System.out.println("juego terminado, gano el mas listo ya sabran cual es cual");
				break;

			}
		} while (opcion!=3);
		
		tcl.close();
	}

}
