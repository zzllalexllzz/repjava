
package Herencia2;

import java.util.ArrayList;

public class TestBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco Cajamar = new Banco();
		
		CuentaCorriente cc1 = new CuentaCorriente(1000, 5);
		CuentaCorriente cc2 = new CuentaCorriente(2000, 6);
		CuentaJoven cj1 = new CuentaJoven(3000, 7);
		CuentaJoven cj2 = new CuentaJoven(4000, 8);
		CuentaAhorro ca1 = new CuentaAhorro(5000, 9, 1);
		CuentaAhorro ca2 = new CuentaAhorro(600, 10, 2);
		
		Cajamar.addCuenta(cc1);
		Cajamar.addCuenta(cj2);
		Cajamar.getCuenta(cc1.getNumeroCuenta()).ingresar(1000000);
		Cajamar.getCuenta(cj2.getNumeroCuenta());
	
		System.out.println(Cajamar);
		
		
	}

}
