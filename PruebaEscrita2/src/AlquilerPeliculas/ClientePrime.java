package AlquilerPeliculas;

public class ClientePrime extends Cliente {

	//costructor
	public ClientePrime(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual=3;
	}

	/**
	 * metodo es pro que devuelve falso en clientes prime
	 */
	@Override
	public boolean esPro() {
		return false;
	}

	/**
	 * metodo devuelve el precio mensual
	 */
	@Override
	public double getPrecioMensual() {
		return precioMensual;
	}

}
