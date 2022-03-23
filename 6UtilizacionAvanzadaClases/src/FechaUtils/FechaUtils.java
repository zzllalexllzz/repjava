package FechaUtils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaUtils {

	enum zodiac {
		ARIES, TAURO, GEMINIS, CANCER, LEO, VIRGO, LIBRA, ESCORPIO, SAGITARIO, CAPRICORNIO, ACUARIO, PISCIS
	}
	/**
	 * metodo que devuelve la fecha y el tiemo que falta  hasta llegar a la fecha determinada
	 * (o pasada por parametro);
	 * @param fechaHasta
	 * @param titulo
	 */
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {
		LocalDateTime hoy = LocalDateTime.now();
		Period p = Period.between(fechaHasta.toLocalDate(), hoy.toLocalDate());
		Duration d = Duration.between(fechaHasta.toLocalTime(), hoy.toLocalTime());
		System.out.println("Han pasado "+p.getYears()+" años "+p.getMonths()+" meses "+p.getDays()+" dias "+
		d.toHours()+" horas "+d.toMinutes()+" minutos "+d.getSeconds()+" segundos");
	}
	
	/**
	 * metodo que devuelve el dia que sera tu cumpleanios del año que le pases como parametro
	 * @param fechaCumple
	 * @param anio
	 * @return
	 */
	public static String diaCumple(LocalDate fechaCumple, int anio) {
		LocalDate fecha = fechaCumple.withYear(anio);
		Locale loc = Locale.forLanguageTag("es-ES");
		String dia = fecha.format(DateTimeFormatter.ofPattern("EEEE",loc));
		return dia;
	}
	
	/**
	 * metodo que devuelve los años que tiene has ahora
	 * @param fechaCumple
	 * @return
	 */
	public static int numYears(LocalDate fechaCumple) {
		LocalDate hoy = LocalDate.now();
		Period p = Period.between(fechaCumple, hoy);
		return p.getYears();
	}
	
	/**
	 * metodo que devuleve true si la fecha determinada existe entre la fecha inicio y la fecha fin.
	 * @param inicio
	 * @param fin
	 * @param fecha
	 * @return
	 */
	public static boolean isIntervalo(LocalDateTime inicio, LocalDateTime fin, LocalDateTime fecha) {	
		if (inicio.isBefore(fecha) && fin.isAfter(fecha))
			return true;
		
		return false;
	}
	
	/**
	 * metodo que devuelve el signo correspondiente  deacuerdo al dia y mes dado por la fecha 
	 * pasado por parametro
	 * @param fecha
	 * @return
	 */
	public static String zodiaco(LocalDate fecha) {
		switch (fecha.getMonthValue()) {
		case 1:
			if (fecha.getDayOfMonth()<=20) {
				return zodiac.CAPRICORNIO.toString();
			}else {
				return zodiac.ACUARIO.toString();
			}
		case 2:
			if (fecha.getDayOfMonth()<=19) {
				return zodiac.ACUARIO.toString();
			}else {
				return zodiac.PISCIS.toString();
			}
		case 3:
			if (fecha.getDayOfMonth()<=20) {
				return zodiac.PISCIS.toString();
			}else {
				return zodiac.ARIES.toString();
			}
		case 4:
			if (fecha.getDayOfMonth()<=20) {
				return zodiac.ARIES.toString();
			}else {
				return zodiac.TAURO.toString();
			}
		case 5:
			if (fecha.getDayOfMonth()<=20) {
				return zodiac.TAURO.toString();
			}else {
				return zodiac.GEMINIS.toString();
			}
		case 6:
			if (fecha.getDayOfMonth()<=21) {
				return zodiac.GEMINIS.toString();
			}else {
				return zodiac.CANCER.toString();
			}
		case 7:
			if (fecha.getDayOfMonth()<=22) {
				return zodiac.CANCER.toString();
			}else {
				return zodiac.LEO.toString();
			}
		case 8:
			if (fecha.getDayOfMonth()<=23) {
				return zodiac.LEO.toString();
			}else {
				return zodiac.VIRGO.toString();
			}
		case 9:
			if (fecha.getDayOfMonth()<=22) {
				return zodiac.VIRGO.toString();
			}else {
				return zodiac.LIBRA.toString();
			}
		case 10:
			if (fecha.getDayOfMonth()<=22) {
				return zodiac.LIBRA.toString();
			}else {
				return zodiac.ESCORPIO.toString();
			}
		case 11:
			if (fecha.getDayOfMonth()<=22) {
				return zodiac.ESCORPIO.toString();
			}else {
				return zodiac.SAGITARIO.toString();
			}
		case 12:
			if (fecha.getDayOfMonth()<=21) {
				return zodiac.SAGITARIO.toString();
			}else {
				return zodiac.CAPRICORNIO.toString();
			}
		}
		return null;
	}
}
