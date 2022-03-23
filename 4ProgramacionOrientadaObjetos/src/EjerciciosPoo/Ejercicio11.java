package EjerciciosPoo;
	//ROBOT
public class Ejercicio11 {

	//atributos
	private int posicionX;
	private int posicionY;
	private boolean haLlegado;
	private int numeroPasos;
	
	private static int contadorRobot=0;
	final static int FILASTABLERO=100;
	final static int COLUMNASTABLERO=100;
	
	//constructor
	public Ejercicio11(int posicionX, int posicionY) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.haLlegado = false;
		this.numeroPasos = 0;
		Ejercicio11.contadorRobot++;
	}

	//setters y getters
	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public boolean isHaLlegado() {
		return haLlegado;
	}

	public void setHaLlegado(boolean haLlegado) {
		this.haLlegado = haLlegado;
	}

	public int getNumeroPasos() {
		return numeroPasos;
	}

	public void setNumeroPasos(int numeroPasos) {
		this.numeroPasos = numeroPasos;
	}

	public static int getContadorRobot() {
		return contadorRobot;
	}

	public static void setContadorRobot(int contadorRobot) {
		Ejercicio11.contadorRobot = contadorRobot;
	}

	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ejercicio11 [posicionX=");
		builder.append(posicionX);
		builder.append(", posicionY=");
		builder.append(posicionY);
		builder.append(", haLlegado=");
		builder.append(haLlegado);
		builder.append(", numeroPasos=");
		builder.append(numeroPasos);
		builder.append("]");
		return builder.toString();
	}
	
	//metodos
	public void irArriba() {
		if (this.posicionY< Ejercicio11.FILASTABLERO-1) {
			this.posicionY++;
			this.numeroPasos++;
		}
	}
	public void irAbajo() {
		if (this.posicionY>0) {
			this.posicionY--;
			this.numeroPasos++;
		}
	}
	public void irDerecha() {
		if (this.posicionX< Ejercicio11.COLUMNASTABLERO-1) {
			this.posicionX++;
			this.numeroPasos++;
		}
	}
	public void irIzquierda() {
		if (this.posicionX>0) {
			this.posicionX--;
			this.numeroPasos++;
		}
	}
	
	
}
