package org.lessons.java.shop;

public class Main {
 
	public static void main(String[] args) {
		Prodotto prod1 = new Prodotto();
		prod1.setNome("nome prodotto");
		prod1.setDescrizione("descrizione");
		prod1.setPrezzo(12.99f);
		prod1.setIva(10);
		
		System.out.println("codice prodotto: " + prod1.getCodice());
		System.out.println("nome "+ prod1.getNome());
		System.out.println("descrizione"+ prod1.getDescrizione());
		System.out.println("prezzo base" + prod1.getPrezzo());
		System.out.println("prezzo con iva" + prod1.totalPrice());
		System.out.println("iva prodotto: " + prod1.getIva());
		System.out.println("nome completo: " + prod1.fullName());
		
	}
}
