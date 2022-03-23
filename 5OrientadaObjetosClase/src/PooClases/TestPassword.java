package PooClases;

public class TestPassword {

	public static void main(String[] args) {


		Password p1 = new Password();
		System.out.println(p1);
		System.out.println(p1.esFuerte());
		
		Password p2 = new Password(16);
		System.out.println(p2);
		System.out.println(p2.esFuerte());
	}

}
