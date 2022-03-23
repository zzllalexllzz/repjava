/**
 * 
 */
package Pajaro;

/**
 * @author darge
 *
 */
public class Pajaro {

	private int edad;
	private char color;
	
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void printEdad() {
		System.out.println(this.edad);
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(char color) {
		this.color = color;
	}
	
	public void printColor() {
		switch (color) {
		case 'v':
			System.out.println("verde");
			break;
		case 'a':
			System.out.println("amarillo");
			break;
		case 'g':
			System.out.println("gris");
			break;
		case 'n':
			System.out.println("negro");
			break;
		case 'b':
			System.out.println("blanco");
			break;

		}
	}
	
	
	
}
