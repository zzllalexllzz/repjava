package CuentaCorriente;

public class CuentaCorriente {

	//propiedades
	private String numero;
	private double saldo;
	
	//constructores
	public CuentaCorriente() {
		this.saldo=0;
		this.numero = CuentaCorriente.generarNumero();
	} 
	public CuentaCorriente(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	//generator de numero
	public static String generarNumero() {
		//generar un numero de cuenta aleatorio
		StringBuilder sb = new StringBuilder("ES204005");//falta 12 numeros
		for (int i = 0; i < 12; i++) {
			int num = (int)(Math.random()*10);//0 a 9
			sb.append(num);
		}
		return sb.toString();
	}
	
	//ingreso
	public void ingreso(double cantidad) {
		this.saldo+=cantidad;
	}
	
	//cargo
	public void cargo(double cantidad) {
		if ((this.saldo - cantidad) >= 0)
		this.saldo-=cantidad;
	}
	//transferencia de cuenta a otra
	public void transferencia(CuentaCorriente otra, double cantidad) {
		if ((this.saldo - cantidad) >= 0) {
			this.saldo-=cantidad;//me quieto yo la cantidad
			otra.setSaldo(cantidad + otra.getSaldo());
		}
		
	}
	
	//getters y setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente [numero=");
		builder.append(numero);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}

	
	
}
