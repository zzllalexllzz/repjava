/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 */
public class Ejercicio18 {

	/**
	 * @param args
	 * �Qu� resultados se obtienen al realizar las 
	 * operaciones siguientes? Si hay errores en la 
	 * compilaci�n, corr�jalos y d� una explicaci�n de 
	 * por qu� suceden.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// e no se puede asignar dos veces
		// la segunda operacion es un boleano y yo cree z en boleano y a�adi a c para la comparacion
		// quite (float) de la ultima operacion
		int a = 10, b=3 , e=1, d, f, c=5;
		float x, y;
		boolean z;
		x= a / b;
		System.out.println(x);
		z = a < b && a < c;
		System.out.println(z);
		d = a + b++;
		System.out.println(d);
		f = ++a - b;
		System.out.println(f);
		y = a / b;
		System.out.println(y);
	}

}
