package com.vishnu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Venue v = new Venue();
try (Scanner s = new Scanner(System.in)) {
	System.out.println("Enter the venue name:");
	String name = s.nextLine();
	System.out.println("Enter the city name:");
	String city = s.nextLine();
	v.setName(name);
	v.setCity(city);
}
System.out.println("Venue Details:");
System.out.println("Venue Name: "+v.name);
System.out.println("Venue City: "+v.city);
	}

}
