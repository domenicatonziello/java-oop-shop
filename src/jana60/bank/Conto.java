package jana60.bank;

import java.util.Random;

public class Conto {
	
	private int numberCount;
	private String name;
	private int saldo;
	
	public Conto (String name) {
		setName(name);
		
		Random random = new Random();
		numberCount = random.nextInt(1, 100);
		
		saldo = 0;
	}
	
	
	public int getNumberCount() {
		return numberCount;
	}
	protected void setNumberCount(int numberCount) {
		this.numberCount = numberCount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSaldo() {
		return saldo;
	}
	protected void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	//  aggiungere soldi
	public void addSaldo(int somma) {
		
		if(somma < 0) return;
		saldo += somma;
	}
	
	public boolean removeSaldo(int somma) {
		if(somma < 0) {
			return false;
		}
		if(somma <= saldo) {
			saldo -= somma;
			return true;			
		}
		return false;
	}
}
