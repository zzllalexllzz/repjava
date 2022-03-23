package Matrices;

public class Ejercicio18 {
/*
 * Queremos realizar una encuesta a 10 personas, en esta encuesta 
 * indicaremos el sexo (1=masculino, 2=femenino), si trabaja 
 * (1=si trabaja, 2= no trabaja) y su sueldo (si tiene un trabajo, 
 * sino sera un cero) estará entre 600 y 2000 (valor entero). Los 
 * valores pueden ser generados aleatoriamente. Calcula y muestra 
 * lo siguiente:
- Porcentaje de hombres (tengan o no trabajo).
- Porcentaje de mujeres (tengan o no trabajo).
- Porcentaje de hombres que trabajan.
- Porcentaje de mujeres que trabajan.
- El sueldo promedio de las hombres que trabajan.
- EL sueldo promedio de las mujeres que trabajan.
-
Usa todos los métodos que veas necesarios, piensa que es aquello 
que se repite o que puede ser mejor
tenerlo por separado.

 */
	/**
	 * pinta la matriz
	 * @param matriz
	 */
	public static void pintarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j]+"  ");
				
			}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int encuesta[][]=new int [10][3];
		
		//rellenarla con datos aleatorios
		for (int i = 0; i < encuesta.length; i++) {
			//sexo
			encuesta[i][0]=(int)(Math.random()*2+1);
			//trabajo
			encuesta[i][1]=(int)(Math.random()*2+1);
			//sueldo
			if (encuesta[i][1]==2) {
				//no rabaja entoces el sueldo es 0
				encuesta[i][2]=0;
			} else {
				//si trabaja sueldo sera entre 600 y 2000
				encuesta[i][2]=(int)((Math.random()*1401)+600);
			}
		}
		
		pintarMatriz(encuesta);
		
		int numHombres=0;
		int numMujeres=0;
		int numHombresTrabaja=0;
		int numMujeresTrabaja=0;
		int sueldoHombres=0;
		int sueldoMujeres=0;
		//calcular porcentajes encuesta
		for (int i = 0; i < encuesta.length; i++) {
			//hombres
			if (encuesta[i][0]==1) {
				numHombres++;
				if (encuesta[i][1]==1) {
					numHombresTrabaja++;
					sueldoHombres+=encuesta[i][2];
				}
			}
			//muujeres
			if (encuesta[i][0]==2) {
				numMujeres++;
				if (encuesta[i][1]==1) {
					numMujeresTrabaja++;
					sueldoMujeres+=encuesta[i][2];
				}
			}
			
		}
		
		//pintar resusltados
		System.out.println("el porcentaje de hombres es "+numHombres*100/encuesta.length);
		System.out.println("el porcentaje de mujeres es "+numMujeres*100/encuesta.length);
		System.out.println("el porcentaje de hombres que trabajan es "+numHombresTrabaja*100/numHombres);
		System.out.println("el porcentaje de mujeres que tranajan es "+numMujeresTrabaja*100/numMujeres);
		System.out.println("el sueldo medio de hombres que trabaja es "+sueldoHombres/numHombresTrabaja);
		System.out.println("el sueldo medio de mujeres que trabaja es "+sueldoMujeres/numMujeresTrabaja);
		
	}

}
