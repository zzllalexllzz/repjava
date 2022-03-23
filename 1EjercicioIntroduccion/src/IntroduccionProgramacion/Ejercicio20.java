/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 */
public class Ejercicio20 {

	/**
	 * @param args
	 * 
	 * Escriba usando variables las siguientes expresiones:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2, b=4, d=3;
		double res1,res2,res3;
		//1
		res1=5*Math.pow(a, 2)*Math.pow(b, 3)+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println(res1);
		
		//2
		res2=Math.sqrt(4*a*Math.pow(b, 2))+Math.pow((a+b), 2);
		System.out.println(res2);
		
		//3
		res3=(Math.pow(a, 3)*b/2*a*Math.pow(b, 2)-Math.sqrt(12*Math.pow(d, 4)));
		System.out.println(res3);
	}

}
