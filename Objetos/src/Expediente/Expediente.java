package Expediente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

import NotasCurso.NotasCurso;

public class Expediente {

	//tipo enum definido para mi clase
	enum Modalidad {FPB, GRADOMEDIO, GRADOSUPERIOR};
	
	//atributos
	private static int  totalAlumnos=0;//contador de objetos de tipo expediente
	private final int id=Expediente.totalAlumnos+1;
	private String nombre;
	private String apellido;
	private char sexo;
	private LocalDate fechaNacimiento;
	private Modalidad modalidad;
	private int curso;
	private ArrayList<NotasCurso>notas;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expediente [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", modalidad=");
		builder.append(modalidad);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", notas=");
		builder.append(notas);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
	}
	
	public int getEdad() {
		return LocalDate.now().getYear()-this.fechaNacimiento.getYear();
	}
	public boolean mayorEdad() {
		if (this.getEdad()>=18) {
			return true;
		}
		return false;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the modalidad
	 */
	public Modalidad getModalidad() {
		return modalidad;
	}

	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * @return the totalAlumnos
	 */
	public static int getTotalAlumnos() {
		return totalAlumnos;
	}

	/**
	 * @return the notas
	 */
	public ArrayList<NotasCurso> getNotas() {
		return notas;
	}

	//constructor
	public Expediente(String nombre, String apellido, LocalDate fechaNacimiento, int curso) {
		Expediente.totalAlumnos++;//suma uno cada vez que ceo un objeto
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.curso = curso;
		
		//Inicializar ArrayList
		this.notas = new ArrayList<>();
	}

	public int getId() {
		return this.id;
	}
}
