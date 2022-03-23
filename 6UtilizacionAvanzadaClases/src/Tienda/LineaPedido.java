/**
 * 
 */
package Tienda;

/**
 * @author alumno
 *
 */
public class LineaPedido {
	
	protected Producto producto;
	protected int cantidad;
	
	//constructor
	public LineaPedido(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	/**
	 * metodo que multiplica las el total de una linea de pedido con la cantidad
	 * @return
	 */
	public double subtotal() {
		return producto.getPrecio() * cantidad * producto.getIva();
	}
	
}
