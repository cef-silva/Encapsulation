package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAcount;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAcount bankAccount;
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAcount(accountNumber, name, initialDeposit);
		}
		else {
			bankAccount = new BankAcount(accountNumber, name);	
		}
		
		System.out.println("Acount data:");
		System.out.println(bankAccount);
		
		System.out.println("Enter a deposit value: ");
		double value = sc.nextDouble();
		bankAccount.deposit(value);
		
		System.out.println("Updated account data:");
		System.out.println(bankAccount);
		
		System.out.println("Enter a withdraw value: ");
		value = sc.nextDouble();
		bankAccount.withdraw(value);
		
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);
		
				
		sc.close();
	}

}
