package jana60.bank;

import java.util.Random;

public class Conto {
	
	private int numberCount;
	private String name;
	private float saldo;
	
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
	public float getSaldo() {
		return saldo;
	}
	protected void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//  aggiungere soldi
	public float addSaldo(float somma) {
		return getSaldo() + somma;
	}
	
	public float removeSaldo(float somma) {
		float price = 0;
		if(getSaldo() != 0 && getSaldo() > somma) {
			price = getSaldo() - somma;
		} else {
			System.out.println("Non è possibile effettuare prelievi");
		}
		return price;
	}
}
