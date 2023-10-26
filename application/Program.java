package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented");
		int x = sc.nextInt();
		Rent[] rooms = new Rent[10];
		
		for (int i = 1; i <= x; i++) {
			System.out.println("Rent #" + i + ":");
			sc.nextLine();
			System.out.println("name: ");
			String name = sc.nextLine();
			System.out.println("email: ");
			String email = sc.next();
			System.out.println("Number of room is: ");
			int a = sc.nextInt();
			rooms[a] = new Rent(name, email);
		}
	for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null)
				System.out.println(rooms[i]);
	}
		sc.close();

	}

}
