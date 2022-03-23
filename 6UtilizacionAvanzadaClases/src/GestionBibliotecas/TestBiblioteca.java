package GestionBibliotecas;

import java.util.Scanner;

public class TestBiblioteca {

	public static void main(String[] args) {
		
		Scanner tcl = new Scanner(System.in);
		
		Biblioteca biblio = new Biblioteca("albox");
		
		Libro l1 = new Libro("Juego de tronos", 2001, 200);
		Libro l2 = new Libro("El retorno del rey", 2002, 250);
		Libro l3 = new Libro("Las dos torrez", 2003, 150);
		Libro l4 = new Libro("La comunidad del anillo", 2004, 120);
		Libro l5 = new Libro("El hobbit", 2005, 300);
		
		//añadimos autor a la publicacion
		l1.addAutor("alex","barahona");
		l1.addAutor("luis", "tonto");
		l2.addAutor("alex","barahona");
		
		//probando delete
		l1.deleteAutor("alex", "barahona");
		biblio.adquirirMaterial(l1);
		biblio.adquirirMaterial(l2);
		biblio.adquirirMaterial(l3);
		biblio.adquirirMaterial(l4);
		biblio.adquirirMaterial(l5);
		
		//SI FUNCIONA (se quita las barra de cometar y si fcunciona)
		System.out.println(biblio.buscar(new Autor("luis", "tonto")));
		//System.out.println(l1.getAutores());
		
		
		Revista r1 = new Revista("coches", 1995, 30, 1);
		Revista r2 = new Revista("motos", 2002, 54, 2);
		Revista r3 = new Revista("barcos", 2010, 36, 9);
		Revista r4 = new Revista("aviones", 2022, 40, 1);
		Revista r5 = new Revista("juegos", 2008, 20, 7);
		biblio.adquirirMaterial(r1);
		biblio.adquirirMaterial(r2);
		biblio.adquirirMaterial(r3);
		biblio.adquirirMaterial(r4);
		biblio.adquirirMaterial(r5);
		
		//MENU
		/*
		int opcion;
		do {
			System.out.println("------BIBLIOTECA----");
			System.out.println("1. Pesta");
			System.out.println("2. Devolver");
			System.out.println("3. Buscar");
			System.out.println("4. Salir");
			System.out.println("--------------------");
	
			System.out.println("Elige una opcion");
			opcion=Integer.parseInt(tcl.nextLine());
			System.out.println("--------------------");
			
			switch (opcion) {
			case 1:
				System.out.println("Introduce un titulo");
				String titl=tcl.nextLine();
				Publicacion pu = biblio.buscar(titl);
                if (pu instanceof Libro) {
                      ((Libro) pu).presta();
                }
				break;
			case 2:
				System.out.println("Introduce un titulo");
				String tit=tcl.nextLine();
				Publicacion pub = biblio.buscar(tit);
                if (pub instanceof Libro) {
                      ((Libro) pub).devuelve();
                }
				break;
			case 3:
				System.out.println("Introduce un titulo");
				String title=tcl.nextLine();
				System.out.println(biblio.buscar(title));
				break;
			case 4:
				System.out.println("PROGRAMA TERMINADO");
				break;

			}
		} while (opcion!=4);
*/
		tcl.close();
		

		
	}

}
