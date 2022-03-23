/**
 * 
 */
package ejemplos;

import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.io.InputStreamReader;

/**
 * @author darge
 *
 */
public class MenuScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		// Variable que llevar� la opci�n pulsada

		String opcion, numero1, numero2;
		int num1, num2;
		int option;

		// Creamos el objeto Scanner fuera del bucle

		BufferedReader tcl = new BufferedReader(new InputStreamReader(System.in));
		try {
			do {

				// Opciones del men�
				System.out.println("----------MEN�---------");
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Multiplicar");
				System.out.println("4. Salir");

				// Pedir por teclado un n�mero
				do {
					opcion = tcl.readLine();
					option = Integer.parseInt(opcion);

					switch (option) {
					case 1:
						System.out.println("Introduce primer n�mero ");
						numero1 = tcl.readLine();
						num1 = Integer.parseInt(numero1);
						System.out.println("Introduce segundo n�mero ");
						numero2 = tcl.readLine();
						num2 = Integer.parseInt(numero2);
						System.out.println("El resultado es " + (num1 + num2));
						break;
					case 2:
						System.out.println("Introduce primer n�mero ");
						numero1 = tcl.readLine();
						num1 = Integer.parseInt(numero1);
						System.out.println("Introduce segundo n�mero ");
						numero2 = tcl.readLine();
						num2 = Integer.parseInt(numero2);
						System.out.println("El resultado es " + (num1 - num2));
						break;
					case 3:
						System.out.println("Introduce primer n�mero ");
						numero1 = tcl.readLine();
						num1 = Integer.parseInt(numero1);
						System.out.println("Introduce segundo n�mero ");
						numero2 = tcl.readLine();
						num2 = Integer.parseInt(numero2);
						System.out.println("El resultado es " + (num1 * num2));
						break;
					case 4:
						System.out.println("Pulsado 4");
						break;
					default:
						System.out.println("Opci�n incorrecta. Pulsa una opci�n (1,2,3,4)");
					}

				} while (option < 1 || option > 4); // Que pida por teclado mientras no escriba 1,2,3 o 4

			} while (option != 4);

			// Cerrar el Scanner
			tcl.close();
		} catch (InputMismatchException ex) {
			System.out.println("Error: no has introducido un valor num�rico por teclado");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
