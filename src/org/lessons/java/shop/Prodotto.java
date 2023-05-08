package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	

	//GETTER E SETTER 
	
	public int getCodice() {
		return codice;
	}
	private void setCodice() {
		Random random = new Random();
		int randomCodice = random.nextInt(100);
		this.codice = randomCodice;
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
		return prezzo + iva;
	}
	public String fullName() {
		String codiceStr = "" + codice;
		return codiceStr + nome;
	}
	
}
