package Forma;

import java.util.Objects;

public class Triangulo extends Forma {

	private double base;
	private double altura;
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public Triangulo(Triangulo otro) {
		super();
		this.base = otro.base;
		this.altura = otro.altura;
	}
	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
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
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangulo [base=");
		builder.append(base);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", id=");
		builder.append(id);
		builder.append(", area()=");
		builder.append(area());
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(altura, base);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulo other = (Triangulo) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Double.doubleToLongBits(base) == Double.doubleToLongBits(other.base);
	}
	
	public void dibujar() {
		System.out.println("triangulo");
	}
	public double area() {
		
		return (this.base*this.altura)/2;
		
	}
	
}
