package EjerciciosPoo;
	//SATELITE
public class Ejercicio7 {

	//atributos
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	//conructores
	public Ejercicio7 (double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	
	public Ejercicio7() {
		meridiano=paralelo=distancia_tierra=0;
	}
	
	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	
	public void printPosicion() {
		System.out.print("El sat�lite se encuentra en ");
		System.out.print("el paralelo "+paralelo+" meridiano "+meridiano);
		System.out.print(" a una distancia de la Tierra de "+distancia_tierra+" kms.");
	}
	
	public void variaAltura(double desplazamiento) {
		distancia_tierra=this.distancia_tierra+(desplazamiento);
	}
	public boolean enOrbita() {
		if(this.distancia_tierra==0){
			return false;
		}else{
			return true ;
		}
		
	}
	public void variaPosicion(double variap, double variam) {
		paralelo=variap;
		meridiano=variam;
	}
}



