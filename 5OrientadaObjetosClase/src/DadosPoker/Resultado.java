package DadosPoker;

public class Resultado {

	//atributos
	private int jugada;
	private int valor;
	
	//constructor
	public Resultado(int jugada, int valor) {
		super();
		this.jugada = jugada;
		this.valor = valor;
	}

	//getters y setters
	/**
	 * @return the jugada
	 */
	public int getJugada() {
		return jugada;
	}

	/**
	 * @param jugada the jugada to set
	 */
	public void setJugada(int jugada) {
		this.jugada = jugada;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	//metodos
	public int ganador(Resultado otro) {
		if (this.jugada>otro.jugada) {
			return 0;
		} else if(this.jugada<otro.jugada) {
			return 1;
		}else if(this.jugada==otro.jugada) {
			if (this.valor>otro.valor) {
				return 0;	
			}else if(this.valor<otro.valor) {
				return 1;
			}else if(this.jugada==otro.jugada && this.valor==otro.valor) {
				return 2;
			}
		}
		return -1;
	}
	
	
	
}
