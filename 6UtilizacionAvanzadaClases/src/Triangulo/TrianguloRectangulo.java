 package Triangulo;

public class TrianguloRectangulo extends Triangulo implements Comparable {

	//constructor
	public TrianguloRectangulo(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		if (!valido()) {
			throw new IllegalArgumentException("Error, los valores de estos lados no se corresponden con este tipo de triángulo");
		}
	}

	
	/**
	 * metodo que devuelve el area
	 */
	@Override
	public double area() {
		return (this.lado2*this.lado3)/2;
	}

	@Override
	public boolean valido() {
		if (Math.pow(lado1, 2)==Math.pow(lado2, 2)+Math.pow(lado3, 2)) {
			return true;
		}
		if (Math.pow(lado2, 2)==Math.pow(lado1, 2)+Math.pow(lado3, 2)) {
			return true;
		}
		if (Math.pow(lado3, 2)==Math.pow(lado1, 2)+Math.pow(lado2, 2)) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Triangulo t) {
		if (this.area()<t.area()) {
			return -1;
		}
		if (this.area()>t.area()) {
			return 1;
		}
		if (this.area()==t.area()) {
			return 0;
		}
		return 22;
	}

}
