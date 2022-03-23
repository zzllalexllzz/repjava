package Sorteo;

public abstract class Sorteo {

	protected int posibilidades;
	
	
	public Sorteo(int posibilidades) {
		super();
		this.posibilidades = posibilidades;
	}


	public abstract int lanzar();
	
}
