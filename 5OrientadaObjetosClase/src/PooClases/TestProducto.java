package PooClases;

public class TestProducto {

	public static void main(String[] args) {


		Producto p1 = new Producto(1,"Ordenador",400,12,30,0.25);
		System.out.println(p1);
		
		p1.vender(13);
		System.out.println(p1);
		p1.reponer();
		System.out.println(p1);
		p1.vender(10);
		System.out.println(p1);
	}

}
