package EjerciciosPoo;

import java.util.Locale;
import java.util.Scanner;

public class TestEjercicio8 {
	//PESO
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("introduce una cantidad");
		int cantidad =Integer.parseInt(tcl.nextLine());
		System.out.println("tipo de unidad: Lb = Libras, Li = Lingotes, Oz = Onzas, Pe = Peniques, K = Kilogramos, G = Gramos");
		String unidad=tcl.nextLine();
		
		Ejercicio8 p1 = new Ejercicio8(cantidad, unidad);
		System.out.println(p1);
		
		System.out.println("*****MENU*****");
		System.out.println("Lb = Libras");
		System.out.println("Li = Lingotes");
		System.out.println("Oz = Onzas");
		System.out.println("Pe = Peniques");
		System.out.println("K = Kilogramos");
		System.out.println("G = Gramos");
		
		System.out.println("introduce el la simbolo");
		String simb =tcl.nextLine();
		System.out.println(p1.getPeso(simb));
		
		tcl.close();
		
		
	}
}
