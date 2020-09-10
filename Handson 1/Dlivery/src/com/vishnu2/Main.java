package com.vishnu2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			long over;
			long ball;
			long runs;
			String batsman;
			String bowler;
			String nonStriker;
			System.out.println("Enter the overs: ");
			over=s.nextLong();
			System.out.println("Enter the ball: ");
			ball=s.nextLong();
			System.out.println("Enter the runs: ");
			runs=s.nextLong();
			System.out.println("Enter the batsman: ");
			batsman=s.nextLine();
			System.out.println("Enter the bowler: ");
			bowler=s.nextLine();
			System.out.println("Enter the nonStriker: ");
			nonStriker=s.nextLine();
			
			Delivery dev = new Delivery(over,ball,runs,batsman,bowler,nonStriker);
			dev.displayDeliveryDetails();
		}
}

}
