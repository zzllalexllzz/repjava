package Scotify;

import java.util.ArrayList;

public class Scotify {

	//atributos
	private ArrayList<Multimedia>multimedias;
	
	//constructor
	public Scotify() {
		super();
		this.multimedias = new ArrayList<>();
	}
	
	/**
	 * metodo que añade una multimedia al arraylist de multimedias
	 * @param mul
	 */
	public void addMul(Multimedia mul) {
		multimedias.add(mul);
	}
	
	/**
	 * metodo que elimina una multimedia al arraylist de multimedias
	 * @param mul
	 */
	public void deleteMul(Multimedia mul) {
		multimedias.remove(mul);
	}
	
	/**
	 * metodos que busca las mutimedias de un autor
	 * @param nom
	 * @return
	 */
	public ArrayList<Multimedia> buscar(Autor nom) {
		ArrayList<Multimedia> cyp = new ArrayList<>();
		for (Multimedia mul : multimedias) {
			for (Autor au : mul.getAutores()) {
				if (au.equals(nom)) {
					cyp.add(mul);
	            }
	        }
	    }
	    return cyp;
	}

	/**
	 * @return the multimedias
	 */
	public ArrayList<Multimedia> getMultimedias() {
		return multimedias;
	}
	
	
}
