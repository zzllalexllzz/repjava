package primeraevaluacion;

public class Ejercicio1 {

	public static double factrorial(int num) {
		double factorial=1;
		for (int i = 1; i <= num; i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
	public static double euler() {
		double euler=0;
		double totalante=0;
		double diferencia=0;
		int i=0;
		do {
			euler=euler+(1/factrorial(i));
			diferencia=(euler-totalante);
			totalante=euler;
			i++;
		}while((diferencia)>0.00000000001);
		return euler;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(factrorial(5));
		System.out.println(euler());
	}

}
