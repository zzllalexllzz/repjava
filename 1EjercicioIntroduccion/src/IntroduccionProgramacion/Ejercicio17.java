/**
 * 
 */
package IntroduccionProgramacion;

/**
 * @author darge
 *
 */
public class Ejercicio17 {

	/**
	 * @param args
	 * Escriba expresiones que almacenen en variables
	 *  los siguiente:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,d,e,f,g;
		
		//a. Crear un número entero positivo aleatorio entre 1 y 49.
		a=(int)(Math.random()*49+1);
		System.out.println(a);
		
		//b.Generar un número aleatorio positivo par.
		b=(int)(Math.random()*100+1);
		if (b%2==0) {
			System.out.println(b);
		}else {
			int num = b+1;
			System.out.println(num);
		}
		
		//c.Generar un número real aleatorio entre 1 y 10.
		c=(int)(Math.random()*10+1);
		System.out.println(c);
		
		//d.Crear un número entero negativo entre -50 y -150.
		int max=-50;
		int min=-150;
		d= (int)(Math.random()*(min-max+1)-50);
		System.out.println(d);
		
		//e.Crear un número entero entre -100 y 100.
		e= (int)(Math.random()*(200+1)-101);
		System.out.println(e);
		
		//f.Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
		
		//g.Crea un generador aleatorio de uno de los meses del año
		g=(int)(Math.random()*12+1);
		switch (g){
		case 1:
			System.out.println("enero"); break;
		case 2:
			System.out.println("febrero"); break;
		case 3:
			System.out.println("marzo");break;
		case 4:
			System.out.println("abril");break;
		case 5:
			System.out.println("mayo");break;
		case 6:
			System.out.println("junio");break;
		case 7:
			System.out.println("julio");break;
		case 8:
			System.out.println("agosto");break;
		case 9:
			System.out.println("septiembre");break;
		case 10:
			System.out.println("octubre");break;
		case 11:
			System.out.println("noviembre");break;
		case 12:
			System.out.println("diciembre");break;
		}
	}

}
