package com.vishnu8;
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner sca= new Scanner(System.in);
	System.out.println("Choosestall Type: ");
	System.out.println("1.Goldstall: ");
	System.out.println("2.Premiumstall: ");
	System.out.println("3.Executivestall: ");
	int choice;
	choice=sca.nextInt();
	if(choice==1)
	{
		System.out.println("Enter Stall Details");
		System.out.println("Stallname: ");
		String stallname=sca.nextLine();
		System.out.println("Cost: ");
		int cost=sca.nextInt();
		System.out.println("Ownername: ");
		String ownname=sca.nextLine();
		System.out.println("Number of screen: ");
		int numscr=sca.nextInt();
		Stall st=new Goldstall(stallname,ownname,cost,numscr);
		st.display();
	}
	if(choice==2)
	{
		System.out.println("Enter Stall Details");
		System.out.println("Stallname: ");
		String stallname=sca.nextLine();
		System.out.println("Cost: ");
		int cost=sca.nextInt();
		System.out.println("Ownername: ");
		String ownname=sca.nextLine();
		System.out.println("Sets: ");
		int projector=sca.nextInt();
		Stall st=new Premiumstall(stallname,ownname,cost,projector);
		st.display();
	}
	if(choice==3)
	{
		System.out.println("Enter Stall Details");
		System.out.println("Stallname: ");
		String stallname=sca.nextLine();
		System.out.println("Cost: ");
		int cost=sca.nextInt();
		System.out.println("Ownername: ");
		String ownname=sca.nextLine();
		System.out.println("Number of screen: ");
		int tvscreen=sca.nextInt();
		Stall st=new Executivestall(stallname,ownname,cost,tvscreen);
		st.display();
	}
	}
}
