package PooClases;

import java.util.Objects;

public class Contactos {

	//atributos
		private String nombre;
		private String telefono;
		
		//constructor
		public Contactos(String nombre) {
			super();
			this.nombre = nombre;
			this.telefono=generarTel();
		}
		
		/**
		 * genera un numero telefonico  aleatorio con el primer digito en 6
		 * @return
		 */
		public String generarTel() {
			StringBuilder telf = new StringBuilder("6");
			
			for(int i=0; i<8;i++) {
				telf.append((char) (Math.random()*(48-57)+57));
			}
			return telf.toString();
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
		 * @return the telefono
		 */
		public String getTelefono() {
			return telefono;
		}
		/**
		 * @param telefono the telefono to set
		 */
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
		//to string
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Contactos [nombre=");
			builder.append(nombre);
			builder.append(", telefono=");
			builder.append(telefono);
			builder.append("]");
			return builder.toString();
				}
		
		//metodo equals que compara por nombre
		@Override
		public int hashCode() {
			return Objects.hash(nombre);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contactos other = (Contactos) obj;
			return Objects.equals(nombre, other.nombre);
		}
		
		
		
}
