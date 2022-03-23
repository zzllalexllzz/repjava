package primeraevaluacion;


import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);

		String vector1[]= {"lunes","martes","miercoles","jueves","viernes","sabado","domingo","enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre","año"};
		String vector2[]= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday","january","february","march","april","may","june","july","august","september","october","november","december","year"};
		String palabra="";
		String palabraEn="";
		String palabraEs="";
		int palabraEncon=0;
		
		int opcion;
		do {
			System.out.println("-------MENU-----");
			System.out.println("1. ES a EN");
			System.out.println("2. EN a ES");
			System.out.println("3. Salir");
			
			System.out.println("INTRODUCE UNA OPCION");
			opcion=Integer.parseInt(tcl.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("introduce una palabra en ES");
				palabra=tcl.nextLine();
				for (int i = 0; i < vector1.length; i++) {
					if (palabra.equals(vector1[i]))  {
						palabraEncon=i;
					}
				}
				for (int i = 0; i < vector2.length; i++) {
					if (palabraEncon==i) {
						palabraEn=vector2[i].toUpperCase();
						break;
					}
				}
				System.out.println(palabraEn);
				
				break;
			case 2:
				System.out.println("introduce una palabra en EN");
				palabra=tcl.nextLine();
				for (int i = 0; i < vector2.length; i++) {
					if (palabra.equals(vector2[i]))  {
						palabraEncon=i;
					}
				}
				for (int i = 0; i < vector1.length; i++) {
					if (palabraEncon==i) {
						palabraEs=vector1[i].toUpperCase();
						break;
					}
				}
				System.out.println(palabraEs);
				break;
			case 3:
				System.out.println("PROGRAMA TERMINADO");
				break;
			}
			
		} while (opcion!=3);
		
	tcl.close();
	
	
	
	}

}
