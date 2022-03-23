package AlquilerPeliculas;

import java.util.Iterator;



public class TestMultimedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeVideo priVid = new PrimeVideo();

		for(int i=0; i<170; i++) {
			Peliculas p = new Peliculas("nose", false, 15, 60);
			priVid.addMultimedia(p);
			
		}
		
		for(int i=0; i<30; i++) {
			Peliculas p = new Peliculas("nolose", true, 10, 60);
			priVid.addMultimedia(p);
		
		}
	
		for(int i=0; i<750000; i++) {
			ClientePrime c= new ClientePrime("nie"+i, "alex", "alex@gmail.com") ;
			priVid.addSuscriptor(c);
			
		}
		for(int i=0; i<250000; i++) {
			ClientePrimePro c= new ClientePrimePro("dni"+i, "jose", "jose@gmail.com") ;
			priVid.addSuscriptor(c);
			
		}
		
		
			for (Multimedia p : priVid.getCatalogo()) {
				for (int i = 0; i < 40; i++) {
				for (Cliente c : priVid.getSuscriptores()) {
					priVid.ver(p, c);
				}
			}
			
			
		}
		//ganancias
		System.out.println(priVid.getGanancias());
		
		//series
		
		Serie s =new Serie("Breaking Bad", true, 10);
		for (int i = 0; i < 10; i++) {
			Temporada t = new Temporada(i);
			for (int j = 0; j < 10; j++) {
				t.addEpisodio(new Episodio("episodio"+j,50));
			}
			s.addTemporada(t);
		}
		
		
		
	}

}
