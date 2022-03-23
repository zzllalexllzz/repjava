package Triangulo;

public class Equilatero extends Triangulo implements Comparable {

	//constructor
	public Equilatero(double lado1, double lado2, double lado3) {
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
		return (Math.sqrt(3)/4)*Math.pow(lado1, 2);
	}
	
	@Override
	public boolean valido() {
		if (this.lado1==this.lado2 && this.lado1==this.lado3) {
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
