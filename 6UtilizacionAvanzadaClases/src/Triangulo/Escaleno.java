package Triangulo;

public class Escaleno extends Triangulo implements Comparable {

	//constructor
	public Escaleno(double lado1, double lado2, double lado3) {
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
		double s = (this.lado1+this.lado2+this.lado3)/2;
		return Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
	}

	@Override
	public boolean valido() {
		if(this.lado1!=this.lado2 && this.lado2!=this.lado3) {
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
