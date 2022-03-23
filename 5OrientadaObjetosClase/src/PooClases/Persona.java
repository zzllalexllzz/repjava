package PooClases;

public class Persona {

	//ATRIBUTO
	private String nombre;
	private int edad;
	private String sexo;
	private double peso;
	private double altura;
	
	//CONSTRUCTOR
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.sexo = "H";
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		
	}

	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//consructor copia
	public Persona(Persona otro) {
		this.nombre = otro.nombre;
		this.edad = otro.edad;
		this.sexo = otro.sexo;
		this.peso = otro.peso;
		this.altura = otro.altura;
	}
	
	//METODOS
	/**
	 * calcula el si estas en tu peso ideal, por debajo , o si estas de sobrepeso
	 * @return
	 */
	public int calcularIMC() {
		double pesoIdeal=this.peso/Math.pow(this.altura, 2);
		if (pesoIdeal<20) {
			return -1;
		} else if (pesoIdeal>=20 && pesoIdeal<=25) {
			return 0;
		}else {
			return 1;
		}
		
	}
	
	/**
	 * si es mas o igual de 18 sale true pero si es menos de 18 es false
	 * @return
	 */
	public boolean esMayorDeEdad() {
		if (this.edad>=18) {
			return true;
		}else {
			return false;
		}
	}

	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
