package entities;

import java.util.Objects;

public class application {

	public static void main(String[] args) {
		
		client s1 = new client("Maria", "maria@gmail.com");
		client s2 = new client("Maria", "maria@gmail.com");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
	}

}