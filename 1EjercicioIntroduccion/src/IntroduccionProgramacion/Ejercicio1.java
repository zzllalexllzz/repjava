/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 *Si  A = 6, B = 2, C = 3, indicar el resultado final de las
 * siguientes expresiones aritméticas:
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A=6, B=2, C=3;
		
		System.out.println( "a: "+(A * C) % C);
		System.out.println( "b: "+(A * B) / C);
		System.out.println( "c: "+(C % B)+(B / C));
		System.out.println( "d: "+(A % ((A * B * C) / (B + C))));
		System.out.println( "e: "+(B * B + C - B * (A % B)));
	}

}
