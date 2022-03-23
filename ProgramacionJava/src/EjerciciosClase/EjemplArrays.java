/**
 * 
 */
package EjerciciosClase;



/**
 * @author darge
 *
 */
public class EjemplArrays {

	/**
	 * pinta los elementos de un vector
	 * @param numeros
	 */
	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+", ");
		}
		System.out.println("]");
	}
	/**
	 * suma los elementos en posiciones impares
	 * @param numeros
	 * @return
	 */
	public static int sumarImpares(int numeros[]) {
		int suma=0;
		
		for (int i = 0; i < numeros.length; i+=2) {
			suma=suma+numeros[i];
		}
		return suma;
	}
	/**
	 * verifica si em numero es primo
	 * @param numero
	 * @return
	 */
	public static boolean esPrimo(int numero) {
		boolean esPrimo=true;
		
		for (int i = 2; i < numero-1; i++) {
			if (numero%i==0) {
				esPrimo=false;
				break;
			}
		}
		return esPrimo;
	}
	/**
	 * suma los numeros primos
	 * @param numeros
	 * @return
	 */
	public static int sumarPrimos(int numeros[]) {
		int suma=0;
		for (int i = 0; i < numeros.length; i++) {
			if (esPrimo(i)==true) {
				suma=suma+numeros[i];
			}
		}
		return suma;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//sumar los valores en posiciones impares de un array
		int numeros[]=new int[20];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*100+1);
			
		}
	
		pintarVector(numeros);
		System.out.println(sumarImpares(numeros));
		System.out.println(sumarPrimos(numeros));
		
	}

}
