package Profesor;

import java.time.LocalDate;
import java.util.ArrayList;

public class DepartamentoInformatica {

	public static void main(String[] args) {
		
		ArrayList<Profesor> deIn = new ArrayList<>();
		deIn.add(new ProfesorTitular(50, "p1","p11" , "p111", LocalDate.of(2010, 01, 01), 1000, false));
		deIn.add(new ProfesorInterino(10, "p2", "p22", "p222", null, 0, null));

	}

}
