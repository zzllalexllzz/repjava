package Sorteo;

public class TestSorteo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Moneda m1 = new Moneda(2);
		
		Dado d1 = new Dado(6);
		
		
		System.out.println(d1.lanzar());
		m1.lanzar();
		
		
	}

}
