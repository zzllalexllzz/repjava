package Examen1;

public class testPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Password p = new Password(10);
			
			System.out.println(p.generarContraseña(8));
			p.esFuerte();
			System.out.println(p.esFuerte());
		
	}

}
