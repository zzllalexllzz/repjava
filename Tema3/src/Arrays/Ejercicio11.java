/**
 * 
 */
package Arrays;



/**
 * @author darge
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int matriz[][] = new int[5][5];
		//pntamos la matriz
		for(int i= 0;i<5;i++) {
			for(int j=0;j<5;j++) {
				// ya que la linea diagonal se encuetra el las mismas posiciones
				// de i y j pues pintaremos 1 y si no son iguales  pues 0
				if(i==j) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
			}
		}
		//pintamos la matriz como quedara
		for(int i= 0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
