package EjerciciosClase;




public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		
		//bucle numero filas
		for (int i = 1; i<n+1 ; i++) {
			//bucle pinta los espacios
			for (int j = n+1; j>i+1 ; j--) {
				System.out.print(" ");
			}
			//bucle pinta * segun la i
			for (int k = 0; k <i; k++) {
				System.out.print("*");
			}
			//bucle pinta * 
			for (int l =1; l <i; l++) {
				System.out.print("*");
			}
			//pinta el salto de linea
			System.out.println("");
		}
		
		//bucle numero filas
		for (int i = n-1; i>0 ; i--) {
			//bucle pinta los espacios
			for (int j = n+1; j>i+1 ; j--) {
				System.out.print(" ");
			}
			//bucle pinta * segun la i
			for (int k = 0; k <i; k++) {
				System.out.print("*");
			}
			//bucle pinta * 
			for (int l =1; l <i; l++) {
			System.out.print("*");
			}
			//pinta el salto de linea
			System.out.println("");
			}

	}

}
