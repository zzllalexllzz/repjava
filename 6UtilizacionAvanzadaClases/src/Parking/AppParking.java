package Parking;

import java.util.Scanner;

import Parking.Coche.Combustible;

public class AppParking {

	public static void main(String[] args) {
		
		Scanner tcl = new Scanner(System.in);
		int opcion=0;
		
		Parking parking = new Parking();
		
		do {
			System.out.println("----------------MENU-------------");
			System.out.println("0. Salir");
			System.out.println("1. Registrar entrada vehiculo");
			System.out.println("2. Registrar salida vehiculo");
			System.out.println("3. Numero de plazas disponibles");
			System.out.println("4. Imprimir estado del parking");
			System.out.println("5. Saldo acumulado");
			System.out.println("---------------------------------");
			
			System.out.println("Elige una opcion");
			opcion = Integer.parseInt(tcl.nextLine());
			System.out.println("---------------------------------");
			
			switch (opcion) {
				case 0: {
					System.out.println("Programa terminado");
					break;
				}
				case 1: {//nad mas entrar a la opcion hay un menu si lo que quiere meter es un coche o una furgo
					System.out.println("-----------");
					System.out.println("---ELIGE---");
					System.out.println("1. coche o 2. furgoneta");
					System.out.println("-----------------------");
					int opc=Integer.parseInt(tcl.nextLine());
					if (opc==1) {
						System.out.println("Dime una matricula");
						String matricula = tcl.nextLine();
						System.out.println("Dime una marca");
						String marca = tcl.nextLine();
						System.out.println(parking.registrarEntradaVehiculo(new Coche(matricula,marca,null)));
					}else if(opc==2) {
						System.out.println("Dime una matricula");
						String matricula = tcl.nextLine();
						System.out.println("Dime una marca");
						String marca = tcl.nextLine();
						System.out.println(parking.registrarEntradaVehiculo(new Furgoneta(matricula,marca,0)));
					}
					break;
				}
				case 2: {
					System.out.println("-----------");
					System.out.println("---ELIGE---");
					System.out.println("1. coche o 2. furgoneta");
					System.out.println("-----------------------");
					int opc=Integer.parseInt(tcl.nextLine());
					if (opc==1) {
						System.out.println("Dime una matricula");
						String matricula = tcl.nextLine();
						System.out.println("Dime una marca");
						String marca = tcl.nextLine();
						System.out.println(parking.registrarSalidaVehiculo(new Coche(matricula,marca,null)));
					}else if(opc==2) {
						System.out.println("Dime una matricula");
						String matricula = tcl.nextLine();
						System.out.println("Dime una marca");
						String marca = tcl.nextLine();
						System.out.println(parking.registrarSalidaVehiculo(new Furgoneta(matricula,marca,0)));
					}
					break;
				}
				case 3: {
					System.out.println(parking.getNumeroPlazasLibres());
					break;
				}
				case 4: {
					parking.imprimeParking();
					break;
				}
				case 5: {
					System.out.println(parking.getSaldoAcumulado());
					break;
				}
				default:
					System.out.println("opcion incorrecta");
			}
			
		} while (opcion!=0);
				
		
		tcl.close();
	}

}
