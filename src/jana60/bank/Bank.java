package jana60.bank;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		
		
		Conto conto = new Conto(userName);
		
		System.out.println("Cosa vuoi fare? : versare , prelevare , uscire.");
		String userChoise = sc.next();
		
		if(userChoise == "versare") {
			System.out.println("Digitare l'importo da versare");
			int userImport = sc.nextInt();
			conto.addSaldo(userImport);
		} else if (userChoise == "prelevare") {
			System.out.println("Digitare l'importo da prelevare");
			int userImport = sc.nextInt();
			conto.removeSaldo(userImport);
		}
		
		sc.close();
		
		System.out.println("NOME :" + conto.getName());
		System.out.println("NUMERO CARTA: " + conto.getNumberCount());
		System.out.println("Saldo disponibile: " + conto.getSaldo());
		
		
	}

}
