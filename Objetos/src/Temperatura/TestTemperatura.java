/**
 * 
 */
package Temperatura;

/**
 * @author darge
 *
 */
public class TestTemperatura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temperatura t1 = new Temperatura(123.6, 30.2);
		
		
		t1.celsiusToFarenheit();
		
		t1.farenheitToCelsius();
		System.out.println(t1);
	}

}
