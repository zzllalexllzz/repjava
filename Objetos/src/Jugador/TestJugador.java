package Jugador;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador player1 = new Jugador();
		System.out.println(player1);
        Jugador player2=new Jugador(50,  50,  5, 3,  "Bruja", "Brujo");
        System.out.println(player2);

        player1.golpear("Magico", player2);

        System.out.println(player1);
        System.out.println(player2);


		
	}

}
