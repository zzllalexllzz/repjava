package EjerciciosPoo;
	//INCIDENCIAS
public class Ejercicio9 {

	//propiedades 
	private int codigo;
	private String estado;
	private String problema;
	private String solucion;
	private static int pendientes=0;
	
	
	//constructor
	public Ejercicio9(int codigo, String problema) {
		super();
		this.codigo = codigo;
		this.estado = "abierta";
		this.problema = problema;
		this.solucion = "";
		Ejercicio9.pendientes++;//se incrementa +1 cada ves q se crea un objeto 
		
	}

	//getters y setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public static int getPendientes() {
		return pendientes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ejercicio9 [codigo=");
		builder.append(codigo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", problema=");
		builder.append(problema);
		builder.append(", solucion=");
		builder.append(solucion);
		builder.append("]");
		return builder.toString();
	}

	public void resuelve(String solucion) {
		this.estado = "Resuelta";
		this.solucion = solucion;
		Ejercicio9.pendientes--;
		
	}
	
	
}
