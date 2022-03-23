package EjerciciosPoo;

public class TestEjercicio7 {
	//SATELITE
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejercicio7 s1 = new Ejercicio7();
		s1.setPosicion(14,8,200);
		s1.printPosicion();
		s1.variaAltura(10);
		System.out.println();
		System.out.println(s1.enOrbita());
		s1.variaPosicion(5,11);
		s1.printPosicion();
	
	}

}
