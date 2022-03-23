/**
 * 
 */
package EjerciciosClase;

/**
 * @author darge
 *
 */
public class Abecedario {

	public static void pintarVector(char[] abecedario) {
		System.out.print("[ ");
		for (int i = 0; i < abecedario.length; i++) {
			System.out.print(abecedario[i]+"  ");
		}
		System.out.print("]");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//haz un metodo que genere un vector con todas las letras mayusculas
		//del abecedario
		//pista--> char cHar=='A'   
		//¡¡SUMA!!
		char abecedario[]= new char[26];
		char car='A';
		
		for (int i = 0; i < abecedario.length; i++) {
			abecedario[i]=car;
			car++;
		}
		pintarVector(abecedario);
	}

}
