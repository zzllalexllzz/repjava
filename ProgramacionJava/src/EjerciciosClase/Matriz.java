/**
 * 
 */
package EjerciciosClase;

/**
 * @author darge
 *
 */
public class Matriz {

	/**
	 * 
	 * @param notas
	 * Metodo pintar matriz
	 */
	public static void pintarMatriz(int[][] notas) {
		for (int i = 0; i < notas.length; i++) {
			//pinta la filas entera
			for (int j = 0; j < notas[i].length; j++) {//columnas
				System.out.print(notas[i][j]+"   ");
			}
			//cuando pinto la fila , pinto un salto de linea<
			System.out.println();
		}
	}
	/**
	 * 
	 * @param notas
	 * pinta la nota media
	 */
	public static void pintarMedia(int[][] notas) {
		String[] asignatura= {"FOL","SSII","LM","BBDD","ED","PROGRAMACION"};
		
		for (int i = 0; i < notas.length; i++) {
			//sumo las notas de esa fila/asignaturas
			int total=0;
			for (int j = 0; j < notas[i].length; j++) {//columnas
				total=total+notas[i][j];
			}
			//
			System.out.println("la nota media de "+asignatura[i]+" es "+total/notas[0].length);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//asignaturas fol, sis, lm, bbdd,ed
		//notas por asignatura; 4 notas de diferentes
		
		//matriz 6x4
		int notas[][]= new int[6][4];
		
		//llenamos la matriz con notas aleatorias
		for (int i = 0; i < notas.length; i++) {//filas
			for (int j = 0; j < notas[i].length; j++) {//columnas
				notas[i][j]=(int)(Math.random()*10+1);
			}
		}
		
		//pintar la matriz
		pintarMatriz(notas);
		System.out.println("--------------------------------");
		pintarMedia(notas);
	}

}
