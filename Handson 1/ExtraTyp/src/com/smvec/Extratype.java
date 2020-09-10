package com.smvec;
import java.util.Scanner;
public class Extratype {
	static String name;
	static long runs;
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Extratype details: ");
		name=sc.nextLine();
		runs=sc.nextLong();
		String strMain ="wide#1";
		String[] arrOfStr = strMain.split(",");
		for(int i=0;i<arrOfStr.length;i++)
		{
			System.out.println("str["+i+"]: "+arrOfStr[i]);
			System.out.println("Extratype details: ");
			System.out.println("Player NAme: "+name);
			System.out.println("Country Name: "+runs);
		}
	}
	Extratype pl = new Extratype ();
		}
