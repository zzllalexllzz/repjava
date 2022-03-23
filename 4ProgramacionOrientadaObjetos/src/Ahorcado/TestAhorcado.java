package Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class TestAhorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ahorcado miJuego =new Ahorcado();
	
		
		Scanner tcl =new Scanner(System.in);
		int opcion=0;
		String palabra="";
		boolean resuelto = false;
		do {
			System.out.println("-------+MENU+-------");
			System.out.println("1.- Interntar letra");
			System.out.println("2.- Resolver");
			System.out.println("--------------------");
			
			opcion=Integer.parseInt(tcl.nextLine());
			switch (opcion) {
			case 1:
				//leer una letra
				String letra=tcl.nextLine();
				miJuego.intentar(letra.charAt(0));
				System.out.println("Tu palabra "+Arrays.toString(miJuego.getPalabraIntentada()));
				System.out.println("Fallos: "+miJuego.getFallos());
				miJuego.pinatarAhorcado();
				
				//comprobar si esta resuelto
				if (miJuego.solucion()) {
					System.out.println("Has ganado, enhorabuena");
					resuelto=true;
				}
				break;
			case 2:
				System.out.println("Introduce la palabra a resolver");
				palabra=tcl.nextLine();
				if (miJuego.resolver(palabra)==true) {
					System.out.println("Bien la palabra es correcta");
				}else {
					System.out.println("Palabra incorrecta");
				}
				break;
			}
			
		}while(!resuelto && miJuego.getFallos()<6 && opcion!=2);
		
		tcl.close();
	}

}
