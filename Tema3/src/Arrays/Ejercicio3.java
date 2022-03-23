/**
 * 
 */
package Arrays;

/**
 * @author darge
 *
 */
public class Ejercicio3 {
	/*
	 * funcion para sacar la media
	 */
	public static int numMedia(int num[], int suma, int media) {
		for (int i=0; i<num.length ;i++) {
			suma=suma+num[i];
		}
		media=suma/num.length;
		return media;
	}
	/*
	 * funcion para sacra el mayor
	 */
	public static int numMayor(int num[],int mayor) {
		for(int i=0; i<num.length ;i++) {
			if (num[i]>mayor)
				mayor = num[i];		
		}
		return mayor;
	}
	/*
	 * funcion para sacar el menor
	 */
	public static int numMenor(int num[],int menor) {
		for(int i=0; i<num.length ;i++) {
			if (num[i]<menor)
				menor = num[i];
		}
		return menor;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int suma=0;
		int media=0;
		int mayor,menor;
		mayor=menor=num[0];
		
		
		System.out.println("la media es "+numMedia(num,suma,media));
		System.out.println("el mayor es "+numMayor(num,mayor));
		System.out.println("el menor es "+numMenor(num,menor));
	}

}
