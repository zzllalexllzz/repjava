package Bebe;

public class Bebe {

	static void pedir() {
		System.out.println(str1 + " , " + str2 + " , " + str3);
	}
	
	static {
		str2 = "mama tengo hambre";
		str3 = "mama quiero agua";
	}
	
	Bebe() {
		System.out.println("Nacimiento del bebe"); 
	}
	
	static String str2, str3, str1="papa quiero jugar";
		
	public static void main(String[] args) {
		System.out.println("El bebe se ha despertado y va a pedir cosas");
		//llama a la clase Bebe con el punto llama al string estatico "papa quiero jugar"
		System.out.println("El bebe dice: "+Bebe.str1);
		//llama a la clase Bebe y luego al metodo pedir para llammar y pintar todos los strings.
		Bebe.pedir();
	}

}
