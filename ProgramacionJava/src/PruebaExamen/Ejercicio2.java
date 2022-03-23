package PruebaExamen;

public class Ejercicio2 {

	public static double factorial(int numero) {
		double factorial=1;
		for (int i = 1; i <=numero; i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
	public static double formula(int numero, double x) {
		double ln=0;
		for (int i = 1; i <=numero; i++) {
			ln=ln+(Math.pow(-1, i+1)/factorial(i))*Math.pow(x, i);
		}
		return ln;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=0.5;
		double sumado=0;
		double total=0;
		System.out.println(factorial(5));
		System.out.println(formula(20, 0.5));
		
		
	}

}
