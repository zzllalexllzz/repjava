/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 */
public class Ejercicio19 {

	/**
	 * @param args
	 * Escriba el valor ASCII de la 'J' y de la 'j' 
	 * sin consultar la tabla.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letra = 'j';
		int letraASCII;
		//Esto es un CAST. Convertir el caracter a un tipo de dato entero
		letraASCII = (int) letra;
		System.out.println(letraASCII);
		
		char letra1 = 'J';
		int letraASCII1;
		//Esto es un CAST. Convertir el caracter a un tipo de dato entero
		letraASCII1 = (int) letra1;
		System.out.println(letraASCII1);
	}

}
