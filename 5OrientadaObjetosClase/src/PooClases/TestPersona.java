package PooClases;

import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		int opcion;
		
		System.out.println("Introduce tu nombre: ");
		String nombre = tcl.nextLine();
		System.out.println("Introduce tu edad: ");
		int edad = Integer.parseInt(tcl.nextLine());
		System.out.println("Introduce tu sexo");
		System.out.println("H = Hombre, M = Mujer: ");
		String sexo = tcl.nextLine();
		System.out.println("Introduce tu peso: ");
		double peso = Double.parseDouble(tcl.nextLine());
		System.out.println("Introduce tu altura(m): ");
		double altura = Double.parseDouble(tcl.nextLine());
		
		Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
		
		do {
			System.out.println("-------MENU------");
			System.out.println("1.- ¿Es mayor?");
			System.out.println("2.- Calcular peso ideal");
			System.out.println("3.- Informacion del objeto");
			System.out.println("4.- Salir");
			
			System.out.println("Elige una opcion: ");
			opcion= Integer.parseInt(tcl.nextLine());
			
			switch (opcion) {
			case 1:
				if (p1.esMayorDeEdad()==true) {
					System.out.println("Es mayor de edad");
				}else {
					System.out.println("Es Menor de edad");
				}
				break;
			case 2:
				if (p1.calcularIMC()==-1) {
					System.out.println("Estas en tu peso ideal");
				} else if (p1.calcularIMC()==0) {
					System.out.println("Estas por debajo de tu peso ideal");
				}else if (p1.calcularIMC()==1) {
					System.out.println("Estas con sobrepeso");
				}
				break;
			case 3:
				System.out.println(p1);
				break;
			case 4:
				System.out.println("Programa Terminado");
				break;
			}
		}while(opcion!=4);
		
		tcl.close();
	}
}
