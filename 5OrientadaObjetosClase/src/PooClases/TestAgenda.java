package PooClases;

import java.util.Scanner;

public class TestAgenda {

	public static void main(String[] args) {

		Agenda ag = new Agenda();
		
		Scanner tcl = new Scanner(System.in);
		int opcion=0;
		String nom="";
		do {
			System.out.println("-----------------");
			System.out.println("AGENDA TELEFONICA");
			System.out.println("-----------------");
			System.out.println("1. Añadir nuevo contacto");
			System.out.println("2. Listar contacto");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Eliminar contacto");
			System.out.println("5. Estado de la agenda");
			System.out.println("6. Salir");
			System.out.println("-----------------");
			
			System.out.println("Elige una opción: ");
			try {
				opcion=Integer.parseInt(tcl.nextLine());
			} catch (Exception e) {
				System.out.println("ERROR. INTRODUCE UN NUMERO ENTERO");
			}
			
			switch (opcion) {
			case 1:
				System.out.println("Introduce un nombre");
				nom=tcl.nextLine();
				ag.addContacto(new Contactos(nom));
				break;
			case 2:
				ag.listarContactos();
				break;
			case 3:
				System.out.println("Introduce un nombre");
				nom=tcl.nextLine();
				System.out.println(ag.buscarContacto(nom));
				break;
			case 4:
				System.out.println("Introduce un nombre");
				nom=tcl.nextLine();
				ag.eliminarContacto(new Contactos(nom));
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("Programa Terminado");
				break;
			}
			
		} while (opcion!=6);
		
		tcl.close();
	}

}
