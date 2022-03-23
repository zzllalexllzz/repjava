/**
 * 
 */
package Examen1;

/**
 * @author darge
 *
 */
public class Horas {
	
	private int miliSegundos;
	private int segundos;
	private int minutos;
	private int hora;
	
	
	/**
	 * 
	 */
	public Horas() {
		super();
		
		
	}

	
	/**
	 * @param miliSegundos
	 * @param segundos
	 * @param minutos
	 * @param hora
	 */
	public Horas(int miliSegundos, int segundos, int minutos, int hora) {
		super();
		this.miliSegundos = miliSegundos;
		this.segundos = segundos;
		this.minutos = minutos;
		this.hora = hora;
	}
	
	public Horas (String hs) {
		Horas h =this.transformar(hs);
		this.miliSegundos = h.miliSegundos;
		this.segundos = h.segundos;
		this.minutos = h.minutos;
		this.hora = h.hora;
	}
	
	private Horas transformar (String hs) {
		
		String[] horasString=hs.split(":");
		 
		//No tiene 4 elementos la hora
		if (horasString.length != 4) {
			 return new Horas();
		 } else {
			//Comprobamos los numeros
			 int hora,minutos,segundos,miliSegundos;
			 try {
				  hora = Integer.parseInt(horasString[0]);
				  minutos = Integer.parseInt(horasString[1]);
				  segundos = Integer.parseInt(horasString[2]);
				  miliSegundos = Integer.parseInt(horasString[3]);
				 
			 }catch(NumberFormatException e) {
				 return new Horas();
			 }
			
			 Horas horareturn = new Horas(miliSegundos,segundos,minutos,hora);
			 
			 if (horareturn.horaValida()) {
				 return horareturn;
			 }else {
				 return new Horas();
			 }
			 
		 }
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.hora);
		builder.append(":");
		builder.append(this.minutos);
		builder.append(":");
		builder.append(this.segundos);
		return builder.toString();
	}
	
	public String horaCompleta() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.hora);
		builder.append(":");
		builder.append(this.minutos);
		builder.append(":");
		builder.append(this.segundos);
		builder.append(":");
		builder.append(this.miliSegundos);
		return builder.toString();
	}
	
	public boolean horaValida() {
	
		if ((this.hora<0) || (this.hora<23)) {
			return false;
		}else if ((this.minutos<0) || (this.minutos<59)) {
			return false;
		}else if ((this.segundos<0) || (this.segundos<59)) {
			return false;
		}else if ((this.miliSegundos<0) || (this.miliSegundos<99)) {
			return false;
		}
		
		return true;
	}
	/**
	 * Suma un segundo mas a la hora sin que se pase 
	 */
	
	public void segundoSiguiente() {
		
		if (this.segundos<59) {
			this.segundos++;
		}else if (this.segundos==59) {
			this.segundos=0;
			
			if (this.minutos<59) {
				this.minutos++;
			}else if (this.minutos==59) {
					this.minutos=0;
					
					if (this.hora<23) {
						this.hora++;
					}else if (this.hora==23) {
						this.hora=0;
					}
				}
			}
		}
}
