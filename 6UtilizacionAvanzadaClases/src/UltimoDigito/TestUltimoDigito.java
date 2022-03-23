package UltimoDigito;

import java.util.Scanner;

public class TestUltimoDigito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tcl = new Scanner(System.in);
		System.out.println("Introduce un numero para saber el ultimo digito");
		int num = Integer.parseInt(tcl.nextLine());
		UltimoDigito ud = new UltimoDigito();
		System.out.println(ud.UltimoDig(num));
		tcl.close();
	}

}
