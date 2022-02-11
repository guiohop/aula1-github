package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holderName = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		Account conta = new Account(accountNumber, holderName);
		
		double value = 0;
		if (Character.toLowerCase(answer) == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			conta.deposit(value);
		}
		
		System.out.println();
		System.out.printf("Account data:%n%s%n%n", conta);
		
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		conta.deposit(value);
		System.out.printf("Updated account data:%n%s%n%n", conta);

		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		conta.withdrawal(value);
		System.out.printf("Updated account data:%n%s%n", conta);
		
		sc.close();
	}

}
