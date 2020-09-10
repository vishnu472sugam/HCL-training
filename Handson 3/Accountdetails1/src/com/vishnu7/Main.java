package com.vishnu7;
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
	int choice;
	Scanner sca=new Scanner(System.in);
	System.out.println("enter the details:");
	String ba;
	ba=sca.nextLine();
	String s[]=ba.split(",");
	Fixedaccount fa=new Fixedaccount();	
	fa.display();
	}
}
