package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		List <Employees> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++)
		{
			System.out.println();
			System.out.println("Employee n " + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (find_id(list, id)) {
			System.out.println("This id already exists, please write a new one");
			id = sc.nextInt();
			}
			System.out.print("name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salary);
			list.add(emp);
		}
		System.out.println("Enter the id of the employee that will have an increase: ");
		int idsalary = sc.nextInt();
		
		//outra maneira para verificar se o ID existe
		//Employees emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null); 
		
		
		Integer pos = position(list, idsalary);
		if (pos == null)
		{
			System.out.println("Id doesn't exist");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		System.out.println("List of employees:");
		for (Employees x: list) {
			System.out.println(x);
		}
		
		sc.close();
	}
	
	public static Boolean find_id(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
		return emp != null;
}
	
	public static Integer position(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
