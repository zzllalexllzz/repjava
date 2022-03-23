package FechaUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestFechaUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FechaUtils f = new FechaUtils();
		
		f.cuentaAtras(LocalDateTime.of(1995,9,19,13,00,00), "cumple");
		System.out.println(f.diaCumple(LocalDate.of(1995,9,19), 2022));
		System.out.println(f.numYears(LocalDate.of(1995,9,19)));
		System.out.println(f.isIntervalo(LocalDateTime.of(2022,1,1,13,00,00), LocalDateTime.of(2022,3,6,13,00,00), LocalDateTime.of(2022,2,2,13,00,00)));
		System.out.println(f.zodiaco(LocalDate.of(1995,9,19)));
		
	}
  
}
