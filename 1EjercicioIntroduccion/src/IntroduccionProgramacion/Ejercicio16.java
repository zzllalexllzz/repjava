/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 */
public class Ejercicio16 {

	/**
	 * @param args
	 * Escriba un programa para calcular el área y el 
	 * volumen de un cilindro. Para ello declare una 
	 * constante que guarde el valor de Pi. Declare, 
	 * también, variables para el diámetro y la altura 
	 * del cilindro. Suponga para el ejemplo que el 
	 * cilindro tiene un diámetro de 15,5cm y una altura 
	 * de 42,4cm.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double PI=3.14;
		double area, volumen;
		double diametro=15.5; 
		double altura=42.4;
		double radio;
		
		radio= diametro/2;
		//area
		area= 2*PI*radio*(altura+radio);
		System.out.println("area es = "+area);
		//volumen
		volumen= PI*Math.pow(radio, 2)*altura;
		System.out.println("volumen es = "+volumen);
		
	}

}
