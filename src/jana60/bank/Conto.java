package jana60.bank;

public class Conto {
	
	private int numberCount;
	private String name;
	private float saldo;
	
	
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
		saldo = 0;
		this.saldo = saldo;
	}
	
}
