package EjerciciosClase;

public class PuebaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mensaje = "Hola mundo";
		//Longitud de una cadena
		System.out.println("Longitud de la cadena " + mensaje.length());
		//Caracter en una posici�n de la cadena
		System.out.println("Caracter en la posici�n 2 " + mensaje.charAt(3)); //Empieza en 0
		//Encontrar posici�n de una subcadena en una cadena mayor
		System.out.println("Posici�n de la subcadena 'mu' "+ mensaje.indexOf("mu"));
		
		
		
		//Saber si una subcadena est� dentro de una cadena
		String c1 = "En un lugar de la Mancha de cuyo nombre no quiero ...";
		String sub = "mancha";
		System.out.println(c1.indexOf(sub));
		if (c1.indexOf(sub) >= 0 ) {
			System.out.println("Si est�");
		} else {
			//indexOf devuelve un n�mero negativo
			System.out.println("No est�");
		}
		
		//Comprobar si una subcadena est� dentro de una cadena, obviando may�sculas
		System.out.println(c1.indexOf(sub));
		if (c1.toLowerCase().indexOf(sub.toLowerCase()) >= 0 ) {
			System.out.println("Si est�");
		} else {
			//indexOf devuelve un n�mero negativo
			System.out.println("No est�");
		}
		
		//Lo mismo de antes
		String minus = c1.toLowerCase();
		String subminus = sub.toLowerCase();
		if (minus.indexOf(subminus) >= 0) {
			System.out.println("Si est�");
		} else {
			//indexOf devuelve un n�mero negativo
			System.out.println("No est�");
		}
		
		//Unir dos cadenas
		String nombre = "Javier";
		String apellidos = "Guill�n Benavente";
		String nombreAPintar = nombre.concat(" ").concat(apellidos); //nombre + apellidos
		System.out.println(nombreAPintar);
		System.out.println(nombre + " " + apellidos);
		
		//Subcadena de una cadena
		String mensaje2 = "Me gusta mucho Java, cada vez m�s";
		//Sacar Java
		System.out.println(mensaje2.substring(15,19));
		int inicio = mensaje2.indexOf("mucho"); //15
		int fin = inicio + "mucho".length(); //15 + 4 = 19
		System.out.println(mensaje2.substring(inicio,fin)); //substring(15, 15 + 4)

		System.out.println(mensaje2.substring(mensaje2.indexOf("mucho"),mensaje2.indexOf("mucho") + "muchos".length()));
	
		//Quitar espacios
		String mensaje3 = "    Hola";
		System.out.println(mensaje3);
		System.out.println(mensaje3.trim());
		
		//Pasar de String a int
		int numero = Integer.parseInt("25");
		System.out.println(numero + 5);
		
		//Pasar de String a double
		double decimal = Double.parseDouble("34.95");
		System.out.println(decimal + 0.05);
		
		//Pasar de String a double
		double otroDecimal = Double.valueOf("34.95").doubleValue();
		System.out.println(decimal + 0.05);
		
		//Comparar cadenas con equals
		String cad1 = "Estoy ya frito";
		String cad2 = "Estoy ya frito";
		if (cad1.equals(cad2)) {  //NO USAR ==
			System.out.println("Son iguales");
		} else {
			System.out.println("son diferentes");
		}
		
		//Comparar alfab�ticamente dos cadenas
		String ca1 = "Birc�a";
		String ca2 = "Bern�ndez";
		if (ca1.compareTo(ca2) == 0) { //ca1 es posterior alfab�ticamente a ca2
			System.out.println("Iguales");	
		} else if (ca1.compareTo(ca2) < 0) { //Si ca1 es anterior lo pinto antes
			System.out.println("Menor alfab�ticamente");
		} else if (ca1.compareTo(ca2) > 0) { //Si ca1 es posterior lo pinto despu�s
			System.out.println("Mayor alfab�ticamente");
		}
	}

}
