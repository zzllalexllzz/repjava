package TarjetaRegalo;

public class TestTarjetaRegalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TarjetaRegalo tr1 = new TarjetaRegalo();
		System.out.println(tr1);
		tr1.setSaldo(500);
		System.out.println(tr1);
		tr1.gasta(200);
		System.out.println(tr1);
		
		TarjetaRegalo tr2 = new TarjetaRegalo();
		System.out.println(tr1.getNum());
		
	}
	

}
