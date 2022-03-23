package Parking;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parking {

	//atributos
	private ArrayList<Vehiculo>vehiculos;
	private ArrayList<PlazaAparcamiento>plazas;
	private int plazasDisponibles;
	private float saldoAcumulado;
	public static final float  PRECIO_BASE_POR_MINUTO=0.04f;
	public static final float PRECIO_BASE_POR_METRO=0.2f;
	
	//contructor
	public Parking() {
		super();
		this.saldoAcumulado=0;
	
		this.vehiculos = new ArrayList<>();
		this.plazas = new ArrayList<>();
		
		
		for(int i=1; i<=100; i++) {
			PlazaAparcamiento plaza = new PlazaAparcamiento(i,true);
			plazas.add(plaza);
		}
		this.plazasDisponibles=100;
	}
	
	public int getNumeroPlazasLibres() {
		return plazasDisponibles;
	}
	/**
	 * @return the saldoAcumulado
	 */
	public float getSaldoAcumulado() {
		return saldoAcumulado;
	}
	
	public ArrayList<Vehiculo> getVehiculosAparcados() {
		return vehiculos;
	}
	
	public float saldoAcumulado() {
		return saldoAcumulado;
	}
	
	//imprime informacion del parkign de cada plaza
	public void imprimeParking() {
		for (PlazaAparcamiento pl : plazas) {
			System.out.println(pl);
			for (Vehiculo ve : vehiculos) {
				if (ve.getPlazaAparcamiento().equals(pl)) {
					System.out.println("Vehiculo con matricula "+ve.getMatricula()+" lleva aparcado "+
							ve.calcularMinutos()+" minutos y el coste actual es "+ve.calcularImporte());
				}
				
			}
			
		}
	}
	
	/**
	 * METODO DE RESGITRO DE ENTRADA
	 * @param v
	 * @return
	 */
	public String registrarEntradaVehiculo(Vehiculo v) {
		if (plazasDisponibles > 0) {
			for(PlazaAparcamiento p : plazas) {
				if (p.isLibre()==true) {
					p.setLibre(false);
					v.setPlaza(p);
					v.setFechaEntrada(LocalDateTime.now());
					this.vehiculos.add(v);
					this.plazasDisponibles--;
					return "El coche con matricula "+v.getMatricula()+" esta aparcado el la plaza "+p.getNumeroPlaza();
				}
			}
		} else {
			return "El parking esta lleno";
		}
		
		return null;
	}
	
	/**
	 * METODO DE REGISTRO DE SALIDA
	 * @param v
	 * @return
	 */
	
	public String registrarSalidaVehiculo(Vehiculo v) {
		for (Vehiculo veh : vehiculos) {
			if (veh.equals(v)) {
				this.saldoAcumulado+= v.calcularImporte();
				veh.getPlazaAparcamiento().setLibre(true);
				this.plazasDisponibles++;
				this.vehiculos.remove(v);
				return "Vehiculo con matricula " + v.getMatricula() + " entra en la fecha " + v.getFechaEntrada() + " salida fecha " + LocalDateTime.now() +
						" estando " +v.calcularMinutos()+ " costando " + v.calcularImporte();
			}else {
				return "Ese coche no esta en el parking"; 
			}
		}
		return null;
	}
	
	//OTRA MANERA DE HACERLo hay un problemiya de que el false no vuelve a true
	/*
	public String registrarSalidaVehiculo(Vehiculo v) {
		if (this.vehiculos.indexOf(v)>=0) {
			this.saldoAcumulado+= v.calcularImporte();
			this.plazas.remove(v.getPlazaAparcamiento());	
			this.plazasDisponibles++;
			this.vehiculos.remove(v);
			return "Vehiculo con matricula " + v.getMatricula() + " entra en la fecha " + v.getFechaEntrada() + " salida fecha " + LocalDateTime.now() +
					" estando " +v.calcularMinutos()+ " costando " + v.calcularImporte();
		}else {
			return "Ese coche no esta en el parking"; 
		}
		
	}
	*/
	

	

	
	
}
