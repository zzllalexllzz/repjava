package Triangulo;

public class TestTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Equilatero eq = new Equilatero(6, 6, 6);
			System.out.println(eq.area());
			Equilatero eq1 = new Equilatero(10, 10, 10);
			if (eq.compareTo(eq1)==-1) {
				System.out.println("eq es menor que eq1");
			} else if (eq.compareTo(eq1)==1){
				System.out.println("eq es mayor que eq1");
			}else if (eq.compareTo(eq1)==0) {
				System.out.println("eq es igual que eq1");
			}
		
	    } catch (IllegalArgumentException e) {
	        // TODO Auto-generated catch block
	        System.out.println(e.getMessage());
	    }
		try {
			Escaleno es = new Escaleno(5, 9, 12);
			System.out.println(es.area());
	    } catch (IllegalArgumentException e) {
	        // TODO Auto-generated catch block
	        System.out.println(e.getMessage());
	    }
		try {
			Isosceles is = new Isosceles(10, 10, 20);
			System.out.println(is.area());
		} catch (IllegalArgumentException e) {
	        // TODO Auto-generated catch block
	        System.out.println(e.getMessage());
	    }
		try {
			TrianguloRectangulo tr = new TrianguloRectangulo(5, 3, 4);
			System.out.println(tr.area());
	    } catch (IllegalArgumentException e) {
	        // TODO Auto-generated catch block
	        System.out.println(e.getMessage());
	    }
		
		
		
		
		
		
		
	}

}
