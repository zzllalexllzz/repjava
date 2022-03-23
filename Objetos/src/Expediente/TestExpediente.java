package Expediente;

import java.time.LocalDate;

import NotasCurso.NotasCurso;

public class TestExpediente {

	public static void main(String[] args) {


		Expediente a1 = new Expediente("carlos","guerrero",LocalDate.of(2000, 2, 20), 1);
		System.out.println(a1);
		
		a1.getNotas().add(new NotasCurso("programacion",1,5,8,6));
		System.out.println(a1);
	}

}
