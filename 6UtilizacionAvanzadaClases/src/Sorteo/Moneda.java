package Sorteo;


public class Moneda extends Sorteo {

	public Moneda(int posibilidades) {
		super(posibilidades);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int lanzar() {
		int m;
		String[] nom= {"cara","cruz"};
		m=(int)(Math.random()*this.posibilidades+1-1);
		System.out.println(nom[m]);
		return -1;
		
	}

}
