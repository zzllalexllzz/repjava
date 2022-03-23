package EjerciciosPoo;

public class TestEjercicio9 {
	//INCIDENCIAS
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejercicio9 i1 = new Ejercicio9(1,"caldera aberiada");
		System.out.println(i1);
		System.out.println(i1.getPendientes());
		
		Ejercicio9 i2 = new Ejercicio9(2,"llave de la cosina rota");
		System.out.println(i2);
		System.out.println(i2.getPendientes());
		
		i1.resuelve("llamar fontanero");
		System.out.println(i1);
		System.out.println(i1.getPendientes());
	}

}
