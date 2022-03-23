package GestionBibliotecas;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado;

	public Libro(String titulo, int anio, int paginas) {
		super(titulo, anio, paginas);
		this.prestado = false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [prestado=");
		builder.append(prestado+" ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	//metodes implementado de prestable
	@Override
	public void presta() {
		this.prestado=true;
	}

	@Override
	public void devuelve() {
		this.prestado=false;		
	}

	@Override
	public boolean estaPrestado() {
		return this.prestado;
	}

}
