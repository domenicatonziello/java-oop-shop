package org.lessons.java.shop;

import java.util.Random;


public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	public Prodotto (String nome, String descrizione, float prezzo, int iva) {
		Random random = new Random();
		codice = random.nextInt(11111111,99999999);
		
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	

	//GETTER E SETTER 
	
	public int getCodice() {
		return codice;
	}
	
	protected void setCodice(int codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	// prezzo base
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	//prezzo con iva
	public float totalPrice() {
		return getPrezzo() * (1 +getIva() / 100);
	}
	public String fullName() {
		String codiceStr = "" + getCodice();
		return codiceStr + nome;
	}
	
}
