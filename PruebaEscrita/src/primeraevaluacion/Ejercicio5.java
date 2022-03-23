package primeraevaluacion;

import java.util.Arrays;

public class Ejercicio5 {

	public static int[] rellenarMatriz(int matriz[]) {
		for (int i = 0; i < matriz.length; i++) {
			matriz[i]=(int)(Math.random()*6+1);
		}
	
	return matriz;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[]= new int[5];
		rellenarMatriz(vector);
		Arrays.sort(vector);
		System.out.println(Arrays.toString(vector));
		
		if (vector[0]==vector[1] && vector[1]==vector[2] && vector[2]==vector[3] && vector[3]==vector[4]){
			System.out.println("POKER REAL");
		}else if(vector[0]!=vector[1] && vector[1]==vector[2] && vector[2]==vector[3] && vector[3]==vector[4]) {
			System.out.println("POKER");
		}else if((vector[0]==vector[1] && vector[1]==vector[2] && vector[3]==vector[4])||
				(vector[0]==vector[1] && vector[2]==vector[3] && vector[3]==vector[4])) {
			System.out.println("FULL");
		}else if((vector[0]==1 && vector[1]==2 && vector[2]==3 && vector[3]==4 && vector[4]==5)) {
			System.out.println("ESCALERA MENOR");
		}else if((vector[0]==2 && vector[1]==3 && vector[2]==4 && vector[3]==5 && vector[4]==6)) {
			System.out.println("ESCALERA MAYOR");
		}else if((vector[0]==vector[1] && vector[1]==vector[2])||(vector[2]==vector[3] && vector[3]==vector[4])) {
			System.out.println("PIERNAS");
		}else if((vector[0]==vector[1] && vector[2]==vector[3])||
				(vector[1]==vector[2] && vector[3]==vector[4])||
				(vector[0]==vector[1] && vector[3]==vector[4])) {
			System.out.println("PARES DOBLES");
		}else {
			System.out.println("PAR");
		}
		
	}

}
