package TarjetaRegalo;

public class TarjetaRegalo {

	//propiedades
	private static int num = 0;
	private String numero;
	private double saldo;
	
	
	//constructores
	public TarjetaRegalo() {
		this.saldo=0;
		
		TarjetaRegalo.num++;
		this.numero=TarjetaRegalo.generarTarjeta();
	}
	public TarjetaRegalo(double saldo) {
		this.saldo = saldo;
	}
	//generator de numero
		public static String generarTarjeta() {
			//generar un numero de cuenta aleatorio
			StringBuilder sb = new StringBuilder("TR204005");//falta 12 numeros
			for (int i = 0; i < 12; i++) {
				int num = (int)(Math.random()*10);//0 a 9
				sb.append(num);
			}
			return sb.toString();
		}
		//gasta
		public void gasta(double cantidad) {
			if ((this.saldo - cantidad) >= 0)
				this.saldo-=cantidad;
		}
		public void fusionarTargeta(TarjetaRegalo otra) {
			this.saldo +=otra.getSaldo();
			otra.setSaldo(0);
		}
		
		//to string
		public static int getNum() {
			return num;
		}
		public static void setNum(int num) {
			TarjetaRegalo.num = num;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		//to string
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("TarjetaRegalo [numero=");
			builder.append(numero);
			builder.append(", saldo=");
			builder.append(saldo);
			builder.append("]");
			return builder.toString();
		}
	
	
}
