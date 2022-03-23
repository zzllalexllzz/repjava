package DadosPoker;

public class Juego {

	//atributo
	private Jugador jugador1;
	private Jugador jugador2;
	private static int numPartidas=0;
	
	//constructor
	public Juego(String j1, String j2) {
		super();
		this.jugador1 = new Jugador(j1);
		this.jugador2 = new Jugador(j2);
		Juego.numPartidas++;
	}

	/**
	 * metodo jugar crea dos objetos resultado y compara con el metodo ganador 
	 * si ha ganado cambia el atributos del gandor a true y muestra un mensaje  del ganador
	 */
	public void jugar() {
		Resultado r1 = jugador1.valorTirada();
		Resultado r2 = jugador2.valorTirada();
		
		r1.ganador(r2);
		  if(r1.ganador(r2)==0) {
			  this.jugador1.setHaGanado(true);
              System.out.println("Enhorabuena ha gando "+this.jugador1.getNombre()+" con la jugada "+r1.getJugada());
              this.jugador1.nomJug(r1.getJugada());
          }else if(r1.ganador(r2)==1) {
        	  this.jugador2.setHaGanado(true);
              System.out.println("Enhorabuena ha gando "+this.jugador2.getNombre()+" con la jugada "+r2.getJugada());
              this.jugador2.nomJug(r2.getJugada());
          }else if(r1.ganador(r2)==2) {
        	  this.jugador1.nomJug(r1.getJugada());
        	  this.jugador2.nomJug(r2.getJugada());
              System.out.println("Empate volver a intentarlo");
          }
	}
	
	/**
	 * metodo copia de to string XD
	 * @return
	 */
	public String mostrarResultado() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador1 = ");
		builder.append(jugador1);
		builder.append("\n");
		builder.append("Jugador2 = ");
		builder.append(jugador2);
		return builder.toString();
	}


	
}
