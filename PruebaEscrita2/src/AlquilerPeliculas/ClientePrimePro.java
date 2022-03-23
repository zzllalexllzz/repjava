package AlquilerPeliculas;

public class ClientePrimePro extends Cliente {

	public ClientePrimePro(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual=5;
	}

	/**
	 * metodo es pro que develve true en clientes prime pro
	 */
	@Override
	public boolean esPro() {
		return true;
	}

	/**
	 * metodo precion mensual devuelve el  precio mensual
	 */
	@Override
	public double getPrecioMensual() {
		// TODO Auto-generated method stub
		return precioMensual;
	}

}
