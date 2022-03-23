package EjerciciosClase;

public class EjerString {

	public static String desencriptar(String mensaje, int clave) {
		String resultado="";
		for (int i = 0; i < mensaje.length(); i++) {
			char c=(char)(mensaje.charAt(i)-clave);
			resultado+=c;
		}
		return resultado;
	}
	public static String encriptar(String mensaje, int clave) {
		String resultado="";
		for (int i = 0; i < mensaje.length(); i++) {
			char c=(char)(mensaje.charAt(i)+clave);
			resultado+=c;
		}
		return resultado;
	}
	public static int contarVocales(String cadena) {
		
		int contador=0;
		for (int i = 0; i < cadena.length(); i++) {
			char car=cadena.charAt(i);
			if (car=='a' || car=='e' || car=='i' || car=='o' || car=='u' ||
				car=='á' || car=='é' || car=='í' || car=='ó' || car=='ú') {
				contador++;
			}
		}
		return contador;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("----------------------ejercucio1-----------");
		String cadena="Me gusta programar en Java los sábados por la mañana";
		
		System.out.println(contarVocales(cadena));
		
        System.out.println("----------------------ejercucio2-----------");
		String cadena1="https://www.iesjaroso.es/noticias";
		
		System.out.println(cadena1.substring(0,5));
		System.out.println(cadena1.substring(8,24));
		System.out.println(cadena1.substring(25,33));
		
		System.out.println(cadena1.substring(cadena1.indexOf("https"),5));
		System.out.println(cadena1.substring(cadena1.indexOf("www.iesjaroso.es"),24));
		System.out.println(cadena1.substring(cadena1.indexOf("noticias"),33));
		
		System.out.println(cadena1.substring(cadena1.indexOf("https"), cadena1.indexOf("https")+ "https".length()));
	    System.out.println(cadena1.substring(cadena1.indexOf("www.iesjaroso.es"), cadena1.indexOf("www.iesjaroso.es")+"www.iesjaroso.es".length() ));
	    System.out.println(cadena1.substring(cadena1.indexOf("noticias"),cadena1.indexOf("noticias")+"noticias".length()));
	    
        System.out.println("----------------------ejercucio3-----------");
	    String cad1="Esta tarde no voy";
        String cad2="Esta tarde no voy";

        String minC1=cad1.toLowerCase();
        String minC2=cad2.toLowerCase();

        if(minC1.equals(minC2)) {
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
        
        System.out.println("----------------------ejercucio4-----------");
        
        String cadena2 = " Hay muchos espacios en esta cadena";
        cadena = cadena.trim();//Quitar los espacion blancos de principio y el final
        System.out.println(cadena + ".");

        //Recorremos la cadena pasanadola a otra resultado
        //Si encuentra espacion en blanco no los pasa a la cadena resultado

        String resultado="";

        for(int i=0; i<cadena2.length() ;i++) {
            if(cadena2.charAt(i) != ' ') {
                resultado+=cadena2.charAt(i);
            }
        }
        System.out.println(resultado);
        
        System.out.println("----------------------ejercucio5-----------");
       
        String cadena3 = "Esto es una cadenas";
        if (cadena.length()%2==0) {
			System.out.println(cadena3.substring(0,cadena3.length()/2));
		} else {
			System.out.println(cadena3.substring(0,cadena3.length()/2+1));
		}
        
        System.out.println("----------------------ejercucio6-----------");
        
        
        System.out.println("----------------------ejercucio7-----------");

        String mensaje="A ver cómo me lebanto el día qie ponga vuestro examen";
        int clave=7;
        System.out.println(encriptar(mensaje,clave));
        System.out.println(desencriptar(encriptar(mensaje,clave),clave));
        
        
        
	}

}
