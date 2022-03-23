package Herencia;


public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Repartidor r1 = new Repartidor("luis", 20, 0,true, "zona ");
		r1.metodoPlus();
		System.out.println(r1);
		
		Comercial c1 = new Comercial("matias", 40, 100, 300);
		c1.metodoPlus();
		System.out.println(c1);
		
		MozoAlmacen m1 = new MozoAlmacen("alex", 20, 0, true, "peligrosidad");
		m1.metodoPlus();
		System.out.println(m1);
	}

}
