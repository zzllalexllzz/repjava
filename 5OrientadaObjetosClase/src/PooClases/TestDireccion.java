package PooClases;

public class TestDireccion {

	public static void main(String[] args) {
		
		Direccion d1 = new Direccion("calle almeria",26,"arboleas","almeria",4800,"españa",37.3485245,-2.0819670);
		
		Direccion d2 = new Direccion("calle poeta alfredo",10,"alboxs","almeria",4800,"españa",37.3898,-2.14748);

		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println(d2.distanciaKm(d1));
	}

}
