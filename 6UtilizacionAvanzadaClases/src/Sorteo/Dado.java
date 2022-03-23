package Sorteo;

public class Dado extends Sorteo {

	
	public Dado(int posibilidades) {
		super(posibilidades);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int lanzar() {
		return (int)(Math.random()*this.posibilidades+1);
	}

}
