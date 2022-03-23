package DadosPoker;

import java.util.Arrays;


public class Jugador {

	private boolean	haGanado;
	private String nombre;
	private int[] tirada;
	
	//constructor
	public Jugador(String nombre) {
		super();
		this.haGanado = false;
		this.nombre = nombre;
		this.tirada = tirada();
	}

	//setters y getters
	/**
	 * @return the haGanado
	 */
	public boolean isHaGanado() {
		return haGanado;
	}

	/**
	 * @param haGanado the haGanado to set
	 */
	public void setHaGanado(boolean haGanado) {
		this.haGanado = haGanado;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the tirada
	 */
	public int[] getTirada() {
		return tirada;
	}

	/**
	 * @param tirada the tirada to set
	 */
	public void setTirada(int[] tirada) {
		this.tirada = tirada;
	}
	
	//METODO TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador [nombre=");
		builder.append(nombre);
		builder.append(", tirada=");
		builder.append(Arrays.toString(tirada));
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * metodo para sacar el nombre de valor de jugada 
	 * javi no se como hacer para sacar el nombre de cada jugada pero dime 
	 * por lo menos que te parace este metodo o si esta mal porfa 
	 * es lo unico que se me vino a la mente
	 * @param jugad
	 */
	public void nomJug(int jugad) {
		if (jugad==8) {
			System.out.println("POKER REAL");
		}
		if (jugad==7) {
			System.out.println("POKER");
		}
		if (jugad==6) {
			System.out.println("FULL");
		}
		if (jugad==5) {
			System.out.println("ESCALERA MAYOR");
		}
		if (jugad==4) {
			System.out.println("ESCALERA MENOR");
		}
		if (jugad==3) {
			System.out.println("PIERNAS");
		}
		if (jugad==2) {
			System.out.println("PARES DOBLES");
		}
		if (jugad==1) {
			System.out.println("PAR");
		}
	} 
	
	/**
	 * metodo que saca una tirada aleatoria de 1 - 6 y lo asigana 
	 * encada posicion del array y lo ordena de menor a mayor
	 * @return
	 */
	public int[] tirada() {
		this.tirada = new int[5];
		for (int i = 0; i < this.tirada.length; i++) {
			this.tirada[i]=(int)(Math.random()*6+1);
		}
		Arrays.sort(this.tirada);
		return this.tirada;
	}
	
	/**
	 * metodo que saca el el valor de la tirada y lo asigana a objeto resultado
	 * @return
	 */
	public Resultado valorTirada() {
		
		//Poker real
		if ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) 
				&& (tirada[0] == tirada[4]) ) {
			Resultado r = new Resultado(8,tirada[0]);
			return r;
		}
		
		//Poker
		if ( ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) ) ) {
			Resultado r = new Resultado(7,tirada[0]);
			return r;
		}
		if ( (tirada[1] == tirada[2]) && (tirada[1] == tirada[3]) && (tirada[1] == tirada[4]) ) {
			Resultado r = new Resultado(7,tirada[1]);
			return r;
		}
		
		//Full
		if (tirada[0] == tirada[1] && tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
			Resultado r = new Resultado(6,tirada[0]);
			return r;
		}
		if (tirada[2] == tirada[3] && tirada[3] == tirada[4] && tirada[0] == tirada[1]) {
			Resultado r = new Resultado(6,tirada[2]);
			return r;
		}
		
		//Escalera Mayor
		if (tirada[0] == 2 && tirada[1] == 3 && tirada[2] == 4 && tirada[3] == 5 && tirada[4] == 6) {
			Resultado r = new Resultado(5,0);
			return r;
		}
		
		//Escalera Menor
		if (tirada[0] == 1 && tirada[1] == 2 && tirada[2] == 3 && tirada[3] == 4 && tirada[4] == 5) {
			Resultado r = new Resultado(4,0);
			return r;
		}
		
		//Piernas o Trío
		if (tirada[0] == tirada[1] && tirada[1] == tirada[2]) {
			Resultado r = new Resultado(3,tirada[2]);
			return r;
		}
		if (tirada[1] == tirada[2] && tirada[2] == tirada[3]) {
			Resultado r = new Resultado(3,tirada[2]);
			return r;
		}
		if (tirada[2] == tirada[3] && tirada[3] == tirada[4]){
			Resultado r = new Resultado(3,tirada[2]);
			return r;
		}
		
		//Dobles parejas
		if (tirada[0] == tirada[1] && tirada[2] == tirada[3]) {
			if (tirada[0] > tirada[2]) {
				Resultado r = new Resultado(2,tirada[0]);
				return r;
			} else {
				Resultado r = new Resultado(2,tirada[2]);
				return r;
			}
		}
		
		if (tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
			if (tirada[1] > tirada[3]) {
				Resultado r = new Resultado(2,tirada[1]);
				return r;
			} else {
				Resultado r = new Resultado(2,tirada[3]);
				return r;
			}
		}
			
		if (tirada[0] == tirada[1] && tirada[3] == tirada[4]) {
			if (tirada[0] > tirada[3]) {
				Resultado r = new Resultado(2,tirada[0]);
				return r;
			} else {
				Resultado r = new Resultado(2,tirada[3]);
				return r;
			}
		}
		
		
		//Parejas
		if (tirada[0] == tirada[1]) {
			return new Resultado(1,tirada[0]);
		}
		if (tirada[1] == tirada[2]) {
			return new Resultado(1,tirada[1]);
		}
		if (tirada[2] == tirada[3]) {
			return new Resultado(1,tirada[2]);
		}
		if (tirada[3] == tirada[4]) {
			return new Resultado(1,tirada[3]);
		}
		
		
		return new Resultado(-1,-1);
	}

	
}
