package AlgoritmoOrdenacion;

public class Ejercicio2 {
/*
 *Mejora el método de la burbuja explicado anteriormente y utiliza una 
 *variable a modo de centinela o flag, de tal manera que ésta se active 
 *cuando hay algún intercambio. En el momento que no haya ningún 
 *intercambio, el algoritmo debería parar puesto que el vector ya está 
 *ordenado.
 */

	/**
	 * metodo burbuja mejorado ordena un array
	 * @param vector
	 * @return
	 */
	public static int[] burbujaMejorado1 (int vector[]) {
        int aux=0;
        boolean flag=false;

            for (int i = 0; flag!=true; i++) {
                flag=true;
                for (int j = 0; j < vector.length - i - 1; j++) {
                    if (vector[j + 1] < vector[j]) {
                        aux = vector[j + 1];
                        vector[j + 1] = vector[j];
                        vector[j] = aux;
                        flag=false;
                    }
                }
            }
        return vector;
    }
	public static int[] burbujaMejorado(int vector[]){ 
         boolean flag = true;
         int aux;
         while ( flag ){
               flag = false;
               for(int i=0;  i < vector.length -1;  i++ ){
                   if ( vector[i] > vector[i+1] ){
                       aux = vector[ i ]; 
                       vector[ i ] = vector[ i+1 ];
                       vector[ i+1 ] = aux;
                       flag = true; 
                      } 
                } 
          } 
         return vector;
    }
	public static void ordenacionFlag(int vector[]) {
        boolean flag = true;
        int inicio = 0;
        int fin = vector.length;
 
        while (flag == true){
            flag = false;
 
            for (int i = inicio; i < fin - 1; ++i) {
                if (vector[i] > vector[i + 1]) {
                    int aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    flag = true;
                }
            }
            fin = fin - 1;
 
            if (flag == false)
                break;
            flag = false;

            for (int i = fin - 1; i >= inicio; i--) {
                if (vector[i] > vector[i + 1]) {
                    int aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    flag = true;
                }
            }
            inicio = inicio + 1;
        }
    }
	/**
	 * metodo rrellena un vecotr con numeros ramdom
	 * @param vector
	 * @return
	 */
	public static int[]  rellenarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*100+1);
		}
		return vector;
	}
	/**
	 * metodo pinta un vector
	 * @param vector
	 */
	public static void pintarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[]=new int[50];
		rellenarVector(vector);
		pintarVector(vector);
		System.out.println();
		burbujaMejorado(vector);
		pintarVector(vector);
	}

}