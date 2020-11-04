package singleton;

public class TiliSiirto {
	private float maara;
	private String kuvaus;
	Saldo saldo = Saldo.getInstanssi();
	
	public TiliSiirto(String kuvaus, float maara) {
		this.kuvaus = kuvaus;
		this.maara = maara;
	}
	
	public float getMaara() {
		return this.maara;
	}; 
	

	@Override
	public String toString() {
		return this.getKuvaus() + " " + this.getMaara();
	}


	public String getKuvaus() {
		return this.kuvaus;
	}
	
	public void paivitaSaldo(float maara) {
		saldo.updateBalance(maara);
	}


}
