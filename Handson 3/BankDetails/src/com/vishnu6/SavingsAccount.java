package com.vishnu6;

public class SavingsAccount extends Accounts {
	String orgname;
	public SavingsAccount(String accname,String accnum,String bankname,String orgname)
	{
		super(accname,accnum,bankname);
		this.orgname=orgname;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	protected void display()
	{
		System.out.println("Account Number: "+super.accname);
		System.out.println("Account Name: "+super.accname);	
		System.out.println("Bank Name: "+super.bankname);
		System.out.println("Organisation Name: "+orgname);
	}

}
