/**
 * 
 */
package Bucles;

/**
 * @author darge
 *
 */
public class Ejercicio7 {
/*
 *Programa que sume los 100 primeros números enteros impares.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma=0;//acumulador
		//bucle 0 al 200;
		for (int i = 1; i <200; i+=2) {//se asegura de que son impars
			
			suma=suma+i;
		}
		System.out.println(suma);
	}

}
