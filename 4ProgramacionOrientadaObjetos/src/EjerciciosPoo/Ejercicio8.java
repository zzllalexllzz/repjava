package EjerciciosPoo;
	//PESO
public class Ejercicio8 {

	//atributos
	private double pesoKilogramos;

	//constructor
	public Ejercicio8(int peso, String medida) {
	
		switch (medida) {
			case "Lb": {
				this.pesoKilogramos = (peso * 0.453);break;
			}
			case "Li": {
				this.pesoKilogramos = (peso * 14.59);break;
			}
			case "Oz": {
				this.pesoKilogramos = (peso * 0.02835);break;
			}
			case "P": {
				this.pesoKilogramos = (peso * 0.155);break;
			}
			case "K": {
				this.pesoKilogramos = (peso);break;
			}
			case "G": {
				this.pesoKilogramos = (peso / 1000);break;
			}
			default: {
				this.pesoKilogramos =0;
			}
		}

	}
	
	//metodos
	public double getKilogramos() {
		return this.pesoKilogramos;
	}
	
	public double getLibras() {
		return this.pesoKilogramos /= 0.453;
	}
	
	public double getLingotes() {
		return this.pesoKilogramos /= 14.59;
	}
	
	public double getPeso(String medida) {
		
		switch (medida) {
			case "Lb": {
				this.pesoKilogramos /= 0.453;break;
			}
			case "Li": {
				this.pesoKilogramos /= 14.59;break;
			}
			case "Oz": {
				this.pesoKilogramos /= 0.02835;break;
			}
			case "P": {
				this.pesoKilogramos /= 0.155;break;
			}
			case "K": {
				this.pesoKilogramos/=1;break;
			}
			case "G": {
				this.pesoKilogramos *= 1000;break;
			}
			default: {
				this.pesoKilogramos= 0;break;
			}
			
		}
		return this.pesoKilogramos;
	}
	

	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ejercicio8 [pesoKilogramos=");
		builder.append(pesoKilogramos);
		builder.append("]");
		return builder.toString();
	}
	
	
}
