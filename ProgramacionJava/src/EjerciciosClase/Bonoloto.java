/**
 * 
 */
package EjerciciosClase;

/**
 * @author darge
 *
 */
public class Bonoloto {

	/**
	 * pinta el vector
	 * @param conbinacion
	 */
	public static void pintarVector(int conbinacion[]) {
		for (int i = 0; i < conbinacion.length; i++) {
			System.out.print(conbinacion[i]+", ");
		}
	}
	/**
	 * da un numero aleatorio
	 * @return
	 */
	public static int numAleatorio() {
		int num=0;
		num=(int)(Math.random()*49+1);
		
		return num;
	}
	/**
	 * verifica si el numero esta repetido
	 * @param num2
	 * @param conbinacion
	 * @return
	 */
	public static boolean repetido(int num2, int conbinacion[]) {
		
		for (int i = 0; i < conbinacion.length; i++) {
			if (conbinacion[i]==num2) {
				return true;
			}
		}
		
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//programa que genere un combinacion de 6 numeros de loteria 
		//esos numeros van de 1 a 49
		//nno puede puede haber ninguno repetido
		
		int conbinacion[] = new int[6];
		
		int num2=0;
		
		
		for (int i = 0; i < conbinacion.length; i++) {
			//genera un numero que no este en la combinacion
			do {
				num2=numAleatorio();
			} while (repetido(num2,conbinacion));
			
			conbinacion[i]=num2;
		
		}
		pintarVector(conbinacion);
		
		
	}

}
