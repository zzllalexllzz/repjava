/**
 * 
 */
package EjerciciosClase;

/**
 * @author darge
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Suma los números impares que hay entre
		//el 1 y el 1000
		int suma=0;
		for (int i = 1; i < 1000; i++) {
			if (i%2!=0){
				suma=suma+i;
			}
			
		}
		System.out.println(suma);
	}

}
