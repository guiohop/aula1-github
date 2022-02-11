package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		Student[] quartos = new Student[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			quartos[room] = new Student(name, email);
		}
			
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			
			if(quartos[i] != null) {
				System.out.printf("%d: %s, %s%n", i, quartos[i].getName(), quartos[i].getEmail() );
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
