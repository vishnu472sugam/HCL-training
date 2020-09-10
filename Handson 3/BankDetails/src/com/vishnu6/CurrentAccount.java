package com.vishnu6;

public class CurrentAccount extends Accounts {
	private String TINnum;
	public CurrentAccount(String accname,String accnum,String bankname,String TINnum)
	{
		super(accname,accnum,bankname);
	}
	
	public String getTINnum() {
		return TINnum;
	}
	public void setTINnum(String tINnum) {
		TINnum = tINnum;
	}
	public void display()
	{
		System.out.println("Account Number: "+super.accnum);
		System.out.println("Account Name: "+super.accname);	
		System.out.println("Bank Name: "+super.bankname);
		System.out.println("TIN Number: "+TINnum);
	}

	}

