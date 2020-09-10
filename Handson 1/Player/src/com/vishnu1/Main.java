package com.vishnu1;
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
	Player p = new Player();
	try(Scanner s = new Scanner(System.in))
	{
		System.out.println("Enter the player name:");
		String name = s.nextLine();
		System.out.println("Enter the country name:");
		String country = s.nextLine();
		System.out.println("Enter the skill:");
		String skill = s.nextLine();
		p.setName(name);
		p.setCountry(country);
		p.setSkill(skill);
	}
		System.out.println("Player Details:");
	System.out.println("Player Name: "+p.name);
	System.out.println("Country Name: "+p.country);
	System.out.println("Skill: "+p.skill);
		}

	}
