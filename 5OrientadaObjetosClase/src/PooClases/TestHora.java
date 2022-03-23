package PooClases;

public class TestHora {

	public static void main(String[] args) {


		Hora h1 = new Hora("23:59:59");
		System.out.println(h1);
		System.out.println(h1.horaCompleta());
		System.out.println(h1.horaValida());
		h1.segundoSiguiente();
		System.out.println(h1);
		
		
		/**
		 * cambiaria el metodo segundo siguente las hora de 24h solo 12
		 * 
		 */
	}

}
