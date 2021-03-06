package Tienda;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Categoria moviles = new Categoria("moviles");
		Categoria peri = new Categoria("perifericos");
		Categoria orde = new Categoria("ordenador");
		
		Producto p1  = new Producto("IP13", "Tel apple", moviles, 50, 1.20);
		Producto p2 = new Producto("Logitech", "Raton gaming", peri, 50, 1.21);
		Producto p3  = new Producto("Asus rog", "Portatl gaming",orde , 50, 1.20);
		
		ClienteRegistrado cr1 = new ClienteRegistrado("Alexander", "Barahona", "45812585A", "Albox", "mi casa", "alex@gmail.com", "12345678", LocalDate.of(1987, 10, 10));
		
		Pedido ped1 = new Pedido(cr1);
		/*
		if (cr1.chekPassword("12345678")) {
			Pedido ped1 = new Pedido(cr1);
		    ped1.nuevaLinea(new LineaPedido(p1, 1));
		    ped1.nuevaLinea(new LineaPedido(p2, 1));
		    System.out.println(ped1);
		   
		    try {
				ped1.toPdf();
			} catch (Exception e) {
				// TODO: handle exception
			}  
		}
		*/
		Scanner tcl = new Scanner(System.in);
		int opcion=0;
		System.out.println("pass=12345678");
		System.out.println("Introduce la contraseņa");
		String pass = tcl.nextLine();
		if(cr1.chekPassword(pass)) {
			do {
				System.out.println("-----------Menu--------");
				System.out.println("1. Comprar");
				System.out.println("2. Estado");
				System.out.println("3. Factura");
				System.out.println("4. Salir");
				System.out.println("-----------------------");
				
				System.out.println("Elegir una opcion");
				opcion=Integer.parseInt(tcl.nextLine());
				
				switch (opcion) {
				case 1:
					System.out.println("------Lista de productos------");
					System.out.println("1. "+p1.nombre+", "+p1.precio+", "+p1.getDescripcion());
					System.out.println("2. "+p2.nombre+", "+p2.precio+", "+p2.getDescripcion());
					System.out.println("3. "+p3.nombre+", "+p3.precio+", "+p3.getDescripcion());
					System.out.println("------------------------------");
					
					System.out.println("Introduce el numero del producto");
					int op=Integer.parseInt(tcl.nextLine());
					switch (op) {
					case 1:
						ped1.nuevaLinea(new LineaPedido(p1, 1));
						break;
					case 2:
						ped1.nuevaLinea(new LineaPedido(p2, 1));
						break;
					case 3:
						ped1.nuevaLinea(new LineaPedido(p3, 1));	
						break;
					}
					break;
				case 2:
					System.out.println(ped1);
					break;
				case 3:
					try {
						ped1.toPdf();
					} catch (Exception e) {
						// TODO: handle exception
					}
					System.out.println("Factura creada");
					break;
				case 4:
					System.out.println("Compra terminada");
					break;
				}
			} while (opcion!=4);
		} else {
			System.out.println("ERROR, la contrasena no es correcta");
		}
		
		tcl.close();
		
	}

}
