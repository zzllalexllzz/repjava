package Forma;

public abstract class Forma implements Dibujable {
	
	protected int id;
	protected static int contForma=0;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the contForma
	 */
	public static int getContForma() {
		return contForma;
	}

	/**
	 * @param contForma the contForma to set
	 */
	public static void setContForma(int contForma) {
		Forma.contForma = contForma;
	}

	public Forma() {
		Forma.contForma++;
		this.id = Forma.contForma;
	}

	public abstract double area();
	
	public abstract void dibujar();
	
}
