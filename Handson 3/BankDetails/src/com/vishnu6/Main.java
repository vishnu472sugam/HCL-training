package com.vishnu6;
import java.util.Scanner;
public class Main {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
int choice;
Scanner sca=new Scanner(System.in);
System.out.println("choose the account type");
System.out.println("1.current account");
System.out.println("2.savings account");
choice=sca.nextInt();
sca.nextLine();
String Acctype;
Acctype=sca.nextLine();
String a[]=Acctype.split(",");
if(choice==1)
{
	CurrentAccount ca= new CurrentAccount(a[0],a[1],a[2],a[3]);
	ca.display();
}
else if(choice==2)
{
	SavingsAccount sa= new SavingsAccount(a[0],a[1],a[2],a[3]);
	sa.display();
}
	}

}
