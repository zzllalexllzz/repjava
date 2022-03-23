package SeriesVideojuegos;

import java.util.ArrayList;


public class Ejecutable {

	public static void main(String[] args) {

		ArrayList<Serie>series=new ArrayList<>();
		Serie s1=new Serie("dark", "netflix");
		Serie s2=new Serie("dark", "netflix");
		Serie s3=new Serie("dark", "netflix");
		series.add(s1);
		series.add(s2);
		series.add(s3);
		s1.entregar();
		s2.entregar();
		
		ArrayList<Videojuego>videojuegos=new ArrayList<>();
		Videojuego v1 = new Videojuego("dark soul",20);
		Videojuego v2 = new Videojuego("dark soul",20);
		Videojuego v3 = new Videojuego("dark soul",20);
		videojuegos.add(v1);
		videojuegos.add(v2);
		videojuegos.add(v3);
		v1.entregar();
		
		
		int cont=0;
		int conta=0;
		//muestra informacion de los arraylist
		for (Serie ser : series) {
			System.out.println(ser);
		}
		for (Videojuego vid : videojuegos) {
			System.out.println(vid);
		}
		//cuenta si el estado de prestadp es true suma 1
		for (Serie ser : series) {
			if (ser.isPestado()) {
				cont++;
			}
		}
		for (Videojuego vid : videojuegos) {
			if (vid.isPestado()) {
				conta++;
			}
		}
		System.out.println("Series = "+cont+" Videojuegos = "+conta);
		
		
		
		
	}

}
