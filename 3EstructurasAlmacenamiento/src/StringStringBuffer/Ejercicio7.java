package StringStringBuffer;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder holamundoBuilder = new StringBuilder();
		holamundoBuilder.append("Hola, ");
		holamundoBuilder.append("mundo");

		String holamundo = holamundoBuilder.toString();
		System.out.println(holamundo);
		/*
		Los métodos de StringBuilder no son sincronizados, por 
		lo que tiene mejor rendimiento que StringBuffer. En 
		general, la concatenación de String ocurre con variables 
		locales a un método, por lo que es seguro usar 
		StringBuilder en lugar de StringBuffer.
		StringBuffer: 93 milisegundos en concatenar 
		un millón de String
		StringBuilder: 47 milisegundos en concatenar 
		un millón de String
		*/
	}

}
