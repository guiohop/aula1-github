package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price, quantity;
		
		System.out.println("What is the dollar price? ");
		price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.currencyConversion(price, quantity));
		
		
		
		
		sc.close();
		
		
	}

}
