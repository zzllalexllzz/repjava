package Examen1;

public class Password {
	private int longitud = 10;
	private String contrase�a=Password.generarContrase�a(this.longitud);
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = Password.generarContrase�a(this.longitud);
	}
	
	public static String generarContrase�a (int longitud) {
	// para q tenga de todo
		char[] cadena = new char[longitud];
		for(int i=0; i<longitud; i++) {
			//multiplicar por la diferencia  y sumar el menor
			cadena[i]= (char) (Math.random()*(122-48) +48);
		}
		return new String(cadena);
		
	}
	
	public boolean esFuerte() {
		if(this.longitud < 8)
			return false;
		else {
			int mayus=0;
			int minus=0;
			int number=0;
			//recorremos la contrae�a y vamos actualizando el numero  de mayusculas, minusculas y numeros
			for(int i=0; i<longitud; i++) {
				char c = this.contrase�a.charAt(i); // cada caracter
				if (Character.isUpperCase(c))
					mayus++;
				if (Character.isLowerCase(c))
					minus++;
				if (Character.isDigit(c))
					number++;
			}
			if((mayus>=2)&&(minus>=2)&&(number>=2)) {
	            return true;
	        }else {
	            return false;
	        }
		}
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Password [contrase�a=");
		builder.append(contrase�a);
		builder.append("]");
		return builder.toString();
	}
	
}

