package singleton;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Saldo: " + Saldo.getInstanssi().getSaldo());
		TiliSiirto palkka = new Tulo("Palkka: ", 3500);
		System.out.println(palkka);
		palkka.paivitaSaldo(palkka.getMaara());
		System.out.println("Saldo nyt: " + Saldo.getInstanssi().getSaldo());
		TiliSiirto televisio = new Meno("Televisio", -500);
		System.out.println(televisio);
		televisio.paivitaSaldo(televisio.getMaara());
		System.out.println("Saldo nyt: " + Saldo.getInstanssi().getSaldo());
	}
}