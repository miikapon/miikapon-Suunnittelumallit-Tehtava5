package singleton;

public class Saldo {

	private float saldo;

	public static final Saldo saldoInstanssi = new Saldo();
	
	private Saldo(){
		this.saldo=0;
	}
	
	public static synchronized Saldo getInstanssi(){ 
		
		return saldoInstanssi; 
		
	}


	public float getSaldo() {
		return saldo;
	}
	
	public void updateBalance(float maara) {
		this.saldo+=maara;
	}
}