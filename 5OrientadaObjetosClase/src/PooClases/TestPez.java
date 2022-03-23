package PooClases;

public class TestPez {

	public static void main(String[] args) {
		
		Pez p1 = new Pez("dorada");
		
		Pez p2 = new Pez("payaso");
		
		try {
			Pez p3=(Pez) p1.clone();
			p3.setNombre("tigre");
			System.out.println(p3+"3");
		} catch (CloneNotSupportedException ex) {
			System.out.println("Ese objeto no se puede clonar");
		}
		
		Pez p4 = new Pez(p2);
		p4.setNombre("salmon");
		
		System.out.println(p1+"1");
		System.out.println(p2+"2");
		
		System.out.println(p4+"4");
		
		System.out.println("numObjetos = "+p1.getNumPeces());
		
		System.out.println(p4.equals(p2));
	}

}
