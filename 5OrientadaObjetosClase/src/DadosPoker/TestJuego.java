package DadosPoker;

import java.util.Scanner;


public class TestJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int opcion;
		String jug1="";
		String jug2="";
		
		System.out.println("---------------------------------------");
		System.out.println("Introduce el nombre del primer jugador");
		jug1=tcl.nextLine();
		System.out.println("Introduce el nombre del segundo jugador");
		jug2=tcl.nextLine();
		System.out.println("---------------------------------------");
		Juego ju1 = new Juego(jug1, jug2);
		ju1.jugar();
		System.out.println(ju1.mostrarResultado());
		do {
			System.out.println("----------------------");
			System.out.println("1. Jugar otra partida");
			System.out.println("2. salir");
			System.out.println("----------------------");
			
			System.out.println("Introduce una opcion");
			opcion=Integer.parseInt(tcl.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("---------------------------------------");
				System.out.println("Introduce el nombre del primer jugador");
				jug1=tcl.nextLine();
				System.out.println("Introduce el nombre del segundo jugador");
				jug2=tcl.nextLine();
				System.out.println("---------------------------------------");
				Juego ju2 = new Juego(jug1, jug2);
				ju2.jugar();
				System.out.println(ju2.mostrarResultado());
				break;

			case 2:
				System.out.println("FIN DEL JUEGO");
				break;
			}
		} while (opcion!=2);
		
		tcl.close();
	}

}
