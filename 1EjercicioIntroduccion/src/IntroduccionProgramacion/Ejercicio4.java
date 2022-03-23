/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 *Decir si son verdaderas o falsas las siguientes expresiones:
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         boolean a, b, c, d, e;
		a=(3<=7) && (7<=7);
		System.out.println(a);
		
		b=!((-8>1) && (3<=4));
		System.out.println(b);
		
		c=("Hola" == "Hola  ");
		System.out.println(c);
		
		d=((2<=5) && (3>=6)) || (2>-1);
		System.out.println(d);
		
		e=((2<=5) || (3>=6)) && (2>-1);
		System.out.println(e);
	}

}
