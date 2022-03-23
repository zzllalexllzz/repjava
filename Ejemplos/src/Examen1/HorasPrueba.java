package Examen1;

public class HorasPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horas ejem = new Horas(65, 59,52,2);
		
		System.out.println(ejem.toString());
		ejem.segundoSiguiente();
		System.out.println(ejem.horaCompleta());
		
		System.out.println(ejem.horaValida());
	}

}
