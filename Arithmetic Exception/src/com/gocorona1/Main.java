package com.gocorona1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
					System.out.println("Enter the Integer:");
			int n= sc.nextInt();
			System.out.println("The Integer Is:"+n);
					}
		catch(InputMismatchException ioe)
		{
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception ce)
		{
			ce.printStackTrace();
		}

	}

}
