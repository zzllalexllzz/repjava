/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 * Realiza un programa que calcule el área y el perímetro
	 *  de un círculo de radio 3,6 metros.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double PI= 3.14;
		double radio=3.6;
		double area; 
		double perimetro;
		
		//perimetro
		perimetro = 2 * PI * radio;
		
		//area
		area = PI * Math.pow(radio,2);
		
		System.out.println("el perimetro es "+perimetro);
		System.out.println("el area es "+area);
		
	}

}
