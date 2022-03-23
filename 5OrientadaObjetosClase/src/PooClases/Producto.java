package PooClases;

import java.util.Objects;

public class Producto {
	
	//atributos
	private int id;
	private String descripcion;
	private double precioUni;
	private int unidadesDisp;
	private int stockMax;
	private double descuento;
	
	//constructor
	public Producto() {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precioUni = precioUni;
		this.unidadesDisp = unidadesDisp;
		this.stockMax = stockMax;
		this.descuento = descuento/100;
	}

	public Producto(int id, String descripcion, double precioUni, int unidadesDisp, int stockMax, double descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precioUni = precioUni;
		this.unidadesDisp = unidadesDisp;
		this.stockMax = stockMax;
		this.descuento = descuento/100;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precioUni
	 */
	public double getPrecioUni() {
		return precioUni;
	}

	/**
	 * @param precioUni the precioUni to set
	 */
	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}

	/**
	 * @return the unidadesDisp
	 */
	public int getUnidadesDisp() {
		return unidadesDisp;
	}

	/**
	 * @param unidadesDisp the unidadesDisp to set
	 */
	public void setUnidadesDisp(int unidadesDisp) {
		this.unidadesDisp = unidadesDisp;
	}

	/**
	 * @return the stockMax
	 */
	public int getStock() {
		return stockMax;
	}

	/**
	 * @param stockMax the stockMax to set
	 */
	public void setStock(int stockMax) {
		this.stockMax = stockMax;
	}

	/**
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	//metodo to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precioUni=");
		builder.append(precioUni);
		builder.append(", unidadesDisp=");
		builder.append(unidadesDisp);
		builder.append(", stockMax=");
		builder.append(stockMax);
		builder.append(", descuento=");
		builder.append(descuento);
		builder.append("]");
		return builder.toString();
	}

	//metodo equals
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id == other.id;
	}
	
	//metodos 
	public boolean vender(int cantidad) {
		//falta un if si es negativo
		
			if (cantidad<=this.unidadesDisp) {
				this.unidadesDisp-=cantidad;
				return true;
			}else {
				return false;
			}
		
		
	}
	
	public int reponer() {
		 int canti=this.stockMax-this.unidadesDisp;
		 this.unidadesDisp=this.stockMax;
		 return canti;
	}
	
	
	
}
