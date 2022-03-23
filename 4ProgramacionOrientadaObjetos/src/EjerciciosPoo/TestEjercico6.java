package EjerciciosPoo;

public class TestEjercico6 {
	//NUMERO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejercicio6 ejer = new Ejercicio6();
		
		ejer.setNumero(20);
		System.out.println(ejer.getValor());
		ejer.suma(2);
		System.out.println(ejer.getValor());
		ejer.resta(6);
		System.out.println(ejer.getValor());
		//doble
		System.out.println(ejer.getDoble());
		ejer.setNumero(10);
		System.out.println(ejer.getValor());
	}

}
