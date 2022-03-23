/**
 * 
 */
package Arrays;

/**
 * @author darge
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[8][6];
		//filas
		for(int i=0;i<8;i++) {
			//columnas
			for(int j=0;j<6;j++) {
				//si la fila es 0 o 7 pintara 1 en las dos filas
				if(i==0 || i==7) {
					matriz[i][j]=1;
				//si la columna es 0 o 5 pintara 1 en las columnas
				}else if(j==0 || j==5) {
					matriz[i][j]=1;
					//si no pintara 0 en los espacios q la regla no cubra
				}else {
					matriz[i][j]=0;
				}
			}
		}
		//pintamos como queda
		for(int i=0;i<8;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
