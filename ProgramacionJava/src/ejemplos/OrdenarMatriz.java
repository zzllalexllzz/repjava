package ejemplos;

public class OrdenarMatriz {
	public static int[] metodoBurbujaAsc( int [ ] num )
    {
         int i;
         boolean flag = true;
         int temp;
         while ( flag )
         {
                flag = false;   
                for( i=0;  i < num.length -1;  i++ )
                {
                       if ( num[ i ] > num[i+1] )  
                       {
                               temp = num[ i ];
                               num[ i ] = num[ i+1 ];
                               num[ i+1 ] = temp;
                              flag = true; 
                      } 
                } 
          } 
         return num;
    }

public static int[] burbuja(int[] vector) {
		
		int aux;
		for (int i=vector.length;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				if (vector[j] > vector[j+1]) {
					aux = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = aux;
				}
			}
		}
		
		return vector;
	}
	
	/**
	 * ordenaFilas
	 * @param int[][] matriz - matriz a ordenar 
	 */
	public static void ordenaFilas(int[][] matriz) {
		for(int i=0; i<matriz.length; i++)
			burbuja(matriz[i]);
	}
	
	/**
	 * ordenaColumnas
	 * @param int[][] matriz - matriz a ordenar 
	 */
	public static void ordenaColumnas(int[][] matriz) {
		int[] vector = new int[matriz.length];
		
		for(int i=0; i<matriz.length; i++) {
			//Saco cada columna
			for(int j=0; j<matriz[0].length; j++) {
				vector[j] = matriz[j][i];
			}
			
			//La ordeno
			burbuja(vector);
			
			//La copio a la matriz
			for(int j=0; j<matriz[i].length; j++) {
				matriz[j][i] = vector[j];
			}
		}
	}
	
	
	/**
	 * pintarMatriz
	 * @param int[][] matriz - matriz a pintar
	 */
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[5][5];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*9 + 1);
			}
		}
		
		pintarMatriz(matriz);
		System.out.println("filas");
		ordenaFilas(matriz);
		pintarMatriz(matriz);
		System.out.println("columnas");
		ordenaColumnas(matriz);
		pintarMatriz(matriz);
	
	}
}
