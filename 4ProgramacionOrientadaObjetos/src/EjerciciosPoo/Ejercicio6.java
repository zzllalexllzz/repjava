package EjerciciosPoo;
	//NUMERO
public class Ejercicio6 {

	//atributos
	private Integer numero;

	//contructor
	public Ejercicio6() {
		super();
		this.numero = 0;
	}

	public Ejercicio6(int numero) {
		super();
		this.numero = numero;
	}
	
	//metodos
	public int suma(int valor) {
		return this.numero += valor;
	}
	
	public int resta(int valor) {
		return this.numero -= valor;
	}
	
	//numero *2
	public int getDoble() {
		return this.numero * 2;
	}
	
	public int getValor() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
