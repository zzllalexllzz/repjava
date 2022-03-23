package ConversorFechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversorFechas {

	public String normalToAmericano(String fc) {
		String fam;
		DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter form =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fa = LocalDate.parse(fc,forma);
		fam = fa.format(form);
		return fam;
	}
	
	public String americanoToNormal(String fc) {
		String fno;
		LocalDate fn = LocalDate.parse(fc);
		DateTimeFormatter form =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
		fno =fn.format(form);
		return fno;	
	}
	//System.out.println(cf.americanoToNormal("2002/02/01"));
	//System.out.println(cf.normalToAmericano("04/11/2015"));
}
