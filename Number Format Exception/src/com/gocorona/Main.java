package com.gocorona;
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Item Type Details: ");
			System.out.println("Enter the Name:");
			String name = sc.nextLine();
			System.out.println("Enter the Deposit:");
		Double deposit = sc.nextDouble();
		System.out.println("Enter the Cost Per Day:");
		Double costpershow = sc.nextDouble();
		Itemtype it = new Itemtype();
		it.setName(name);
		it.setDeposit(deposit);
		it.setCostpershow(costpershow);
		it.display();
		}
		catch(NumberFormatException e)
		{
			System.out.println("java.lang.NumberFormatException:For input string:");
		}
		catch(Exception ce)
		{
			ce.printStackTrace();
		}
	}

}
