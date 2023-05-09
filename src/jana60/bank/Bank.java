package jana60.bank;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digitare il tuo nome");
		String userName = sc.next();
		
		
		Conto conto = new Conto(userName);
		
		while(true) {
			System.out.println("cosa vuoi fare?");
			System.out.println("1 versare");
			System.out.println("2 prelevare");
			System.out.println("3 uscire");
			
			int userChoise = sc.nextInt();
			if(userChoise < 1 || userChoise > 3) {
				continue;				
			}
			
			
			if(userChoise == 1) {
				System.out.println("Digitare l'importo da versare");
				int userImport = sc.nextInt();
				conto.addSaldo(userImport);
			} else if (userChoise == 2) {
				System.out.println("Digitare l'importo da prelevare");
				int userImport = sc.nextInt();
				conto.removeSaldo(userImport);
			} else {
				break;
			}
		}
		
		
		sc.close();
		
		System.out.println("NOME :" + conto.getName());
		System.out.println("NUMERO CARTA: " + conto.getNumberCount());
		System.out.println("Saldo disponibile: " + conto.getSaldo());
		
		
	}

}
