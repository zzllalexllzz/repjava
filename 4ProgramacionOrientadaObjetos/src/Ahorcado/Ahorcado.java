package Ahorcado;

import java.util.Arrays;

public class Ahorcado {

	//propiedades
	private static String[] diccionario={"naranja", "fresa", "manzana"};
	private String palabraAAdivinar;
	private char[] palabraIntentada;//array de caracteres o stringbuilder
	private char[] letrasProbadas;
	private int fallos;
	
	//construcctor
	public Ahorcado() {
		//elegir una palabra aleatroio del diccionario
		int posicion=(int)(Math.random() * Ahorcado.diccionario.length);
		this.palabraAAdivinar=Ahorcado.diccionario[posicion];
		
		//reservo tantos caracteres para la palabraIntentada como longitud de la palabraAAdivinar
		this.palabraIntentada= new char[this.palabraAAdivinar.length()];
		
		//rellenar de guiones palabraIntentada, tantos como longiitud de la palabraAAdivinar
		for (int i = 0; i < this.palabraAAdivinar.length(); i++) {
			this.palabraIntentada[i]='-';
		}

		//iniciar el tamano del array de letra palabras
		this.letrasProbadas=new char[27];
		
		this.fallos=0;
	}
	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ahorcado [palabraAAdivinar=");
		builder.append(palabraAAdivinar);
		builder.append(", palabraIntentada=");
		builder.append(Arrays.toString(palabraIntentada));
		builder.append(", letrasProbadas=");
		builder.append(Arrays.toString(letrasProbadas));
		builder.append(", fallos=");
		builder.append(fallos);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the diccionario
	 */
	public static String[] getDiccionario() {
		return diccionario;
	}

	/**
	 * @return the palabraAAdivinar
	 */
	public String getPalabraAAdivinar() {
		return palabraAAdivinar;
	}

	/**
	 * @return the palabraIntentada
	 */
	public char[] getPalabraIntentada() {
		return palabraIntentada;
	}

	/**
	 * @return the letrasProbadas
	 */
	public char[] getLetrasProbadas() {
		return letrasProbadas;
	}

	/**
	 * @return the fallos
	 */
	public int getFallos() {
		return fallos;
	}

	/**
	 * la letra introducidad la busca en la palabra a adivinar
	 * si la encuentra nos muestra sus apariciones en la solucion
	 * si no la encuentra suma un fallo
	 * @param letra
	 * @return
	 */
	public boolean intentar(char letra) {
		boolean encontrado = false;
		
		//busca la letra tantas veces como salga
		for (int i = 0; i < palabraAAdivinar.length(); i++) {
			//si conincide con la letra en alguna  posicion la pongo en palabraIntentada
			if (this.palabraAAdivinar.charAt(i)==letra) {
				this.palabraIntentada[i]=letra;
				encontrado=true;
			}
		}
		if (encontrado== false) {
			this.fallos++;
		}
		return encontrado;
	}
	
	/**
	 * comprueva la palabraAAdivinar y la palabraIntentada son iguales
	 * @return
	 */
	public boolean solucion() {
		boolean solucionado = true;
		for (int i = 0; i < palabraAAdivinar.length(); i++) {
			if (this.palabraAAdivinar.charAt(i)!=this.palabraIntentada[i]) {
				solucionado = false;
			}
		}
		return solucionado;
	}
	
	/**
	 * compruba la palabraAAdivinar y la palabra introducidad por teclado son iguales
	 * y devuelve el resultado
	 * @param palabra
	 * @return
	 */
	public boolean resolver(String palabra) {
		boolean resuelto=false;
		if (this.palabraAAdivinar.equals(palabra)) {
			resuelto=true;
		}
		return resuelto;
	}
	
	public void pinatarAhorcado() {
		switch (this.fallos) {
		case 1:
			System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
			break;
		
		case 2:
			System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                     |   ");
            System.out.println(" |                     |   ");
            System.out.println(" |                     |   ");
            System.out.println(" |                     |   ");
			break;
		case 3:
			System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                   / |   ");
            System.out.println(" |                 /   |   ");
            System.out.println(" |                /    |   ");
            System.out.println(" |                     |   ");
			break;
		case 4:
			System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                   / | \\ ");
            System.out.println(" |                  /  |   \\ ");
            System.out.println(" |                 /   |     \\ ");
            System.out.println(" |                     |   ");
			break;
		case 5:
			System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | -  -  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                   / | \\ ");
            System.out.println(" |                  /  |   \\ ");
            System.out.println(" |                 /   |     \\ ");
            System.out.println(" |                     |   ");
            System.out.println(" |                    /  ");
            System.out.println(" |                   /      ");
            System.out.println(" |                  /       ");
			break;
		case 6:
			System.out.println(" ---------------------");
            System.out.println(" |                     |");
            System.out.println(" |                     |");
            System.out.println(" |                  -------");
            System.out.println(" |                 | X  X  |");
            System.out.println(" |                 |   o   |");
            System.out.println(" |                  -------");
            System.out.println(" |                     |   ");
            System.out.println(" |                   / | \\ ");
            System.out.println(" |                  /  |   \\ ");
            System.out.println(" |                 /   |     \\ ");
            System.out.println(" |                     |   ");
            System.out.println(" |                    / \\");
            System.out.println(" |                   /   \\  ");
            System.out.println(" |                  /     \\ ");
            System.out.println("________________________________");
            System.out.println("PERDISTE, EL JUEGO A TERMINADO");
			break;
		}
	}
	
}
