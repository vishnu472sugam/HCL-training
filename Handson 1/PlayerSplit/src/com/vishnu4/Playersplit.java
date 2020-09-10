package com.vishnu4;
import java.util.Scanner;

public class Playersplit {
static String name;
static String country;
static String skill;
public static void main(String[] args)
{
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the player:");
	name=sc.nextLine();
	country=sc.nextLine();
	skill=sc.nextLine();
	String strMain ="MS dhoni,India,All rounder";
	String[] arrOfStr = strMain.split(",");
	for(int i=0;i<arrOfStr.length;i++)
	{
		System.out.println("str["+i+"]: "+arrOfStr[i]);
		System.out.println("player detaisl:");
		System.out.println("Player NAme: "+name);
		System.out.println("Country Name: "+country);
		System.out.println("Skill: "+skill);
	}
}
	Playersplit pl = new Playersplit ();
	
	}
