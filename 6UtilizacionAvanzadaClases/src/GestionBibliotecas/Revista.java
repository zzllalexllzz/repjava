package GestionBibliotecas;

public class Revista extends Publicacion {

	//atributos
	private int numero;
	
	//constructor 
	public Revista(String titulo, int anio, int paginas, int numero) {
		super(titulo, anio, paginas);
		this.numero = numero;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [numero=");
		builder.append(numero+" ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
