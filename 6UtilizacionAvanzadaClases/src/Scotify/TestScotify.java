package Scotify;

import java.time.LocalDate;

import Scotify.Cancion.Tipo;

public class TestScotify {

	public static void main(String[] args) {
		
		
		//autores
		Autor a2 = new Autor("Alexander", "Mi propia recopilation");
		Autor a1 = new Autor("Gonzalo", "BIZARRAP");
		
		//discos
		Disco bizarrap = new Disco("BZRP Music Sessions", LocalDate.of(2010, 2, 12), a1, "BZRP");
		Disco variados = new Disco("Bariados ALEX", LocalDate.now(), a2, "PRODUCIONES ALX");
		
		Cancion c1 = new Cancion("NATHY PELUSO", 180, 1, Tipo.HIPHOP, bizarrap);
		bizarrap.addCancion(c1);
		c1.addAutor(a2);
		Cancion c2 = new Cancion("L Gante", 180, 2, Tipo.HIPHOP, bizarrap);
		bizarrap.addCancion(c2);
		c2.addAutor(a2);
		
		bizarrap.addCancion(new Cancion("Nicky Jam", 180, 3, Tipo.LATINO, bizarrap));
		bizarrap.addCancion(new Cancion("Residente", 180, 4, Tipo.HIPHOP,bizarrap));
		bizarrap.addCancion(new Cancion("Eladio Carrion", 180, 5, Tipo.HIPHOP,bizarrap));
		
		Cancion c3 = new Cancion("Martin Garrix", 180, 1, Tipo.ELECTRONICA, variados);
		variados.addCancion(c3);
		c3.addAutor(a2);
		
		variados.addCancion(new Cancion("Slipknot", 180, 2, Tipo.METAL, variados));
		variados.addCancion(new Cancion("Michael Jackson", 180, 3, Tipo.POP, variados));
		variados.addCancion(new Cancion("Barry White", 180, 4, Tipo.SOUL, variados));
		variados.addCancion(new Cancion("Miles Davis", 180, 5, Tipo.JAZZ, variados));
		
		Podcast pcast1 = new Podcast("Resumen Esports", 180, LocalDate.of(2022, 3, 1), "capitulo 1");
		Podcast pcast2 = new Podcast("Resumen Juego de tronos", 180, LocalDate.of(2022, 3, 1), "capitulo 2");
		Podcast pcast3 = new Podcast("Resumen Futbol", 180, LocalDate.of(2022, 3, 1), "capitulo 3");
		
		//creamos multimedia y añadimos al scotify
		Scotify sco = new Scotify();
		sco.addMul(c1);
		sco.addMul(c3);
		sco.addMul(c2);
		sco.addMul(pcast1);
		
		//reproducimos  contmos cuantas veces se han reproducido
		System.out.println(sco.buscar(a2));
		c1.reproducir();
		c1.reproducir();
		pcast1.reproducir();
		
		//
		System.out.println(c1.getReprodducciones());
		c2.reproducir();
		System.out.println(c2.getReprodducciones());
		
		
		System.out.println(bizarrap.getDuracion()+ " segundos");
		
		//reproduce todo el contenido del scotify
		for (Multimedia mul : sco.getMultimedias()) {
			mul.reproducir();
		}
		
		
		
	
		

	}

}
