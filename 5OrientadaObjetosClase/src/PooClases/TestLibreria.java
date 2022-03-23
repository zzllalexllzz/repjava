package PooClases;

public class TestLibreria {

	public static void main(String[] args) {

		Libreria jaroso = new Libreria();
		
		Libro l1 = new Libro("libro1", "libro1", 150);
		Libro l2 = new Libro("libro2", "libro2", 150);
		Libro l3 = new Libro("libro3", "libro3", 150);
		Libro l4 = new Libro("libro4", "libro4", 150);
		Libro l5 = new Libro("libro5", "libro5", 150);
		Libro l6 = new Libro("libro6", "libro6", 150);
		Libro l7 = new Libro("libro7", "libro7", 150);
		Libro l8 = new Libro("libro8", "libro8", 150);
		Libro l9 = new Libro("libro9", "libro9", 150);
		Libro l10 = new Libro("libro10", "libro10", 150);
		
		//jaroso.adquirir(l1, 100);
		//jaroso.adquirir(l2, 50);
		jaroso.adquirir(l3, 60);
		jaroso.adquirir(l4,10);
		jaroso.adquirir(l5, 90);
		
		jaroso.vender(l3, 120);
		jaroso.vender(l5, 180);
		
		System.out.println(jaroso.ganancias());
	}
}
