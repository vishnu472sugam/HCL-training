package com.vishnu6;

public class Accounts {
 protected String accname; 
protected	String accnum;
protected String bankname;
public Accounts (String accname,String accnum,String bankname) {
	super();
	this.accname=accname;
	this.accnum=accnum;
	this.bankname=bankname;
}
public String getAccname() {
	return accname;
}
public void setAccname(String accname) {
	this.accname = accname;
}
public String getAccnum() {
	return accnum;
}
public void setAccnum(String accnum) {
	this.accnum = accnum;
}
public String getBankname() {
	return bankname;
}
public void setBankname(String bankname) {
	this.bankname = bankname;
}

}
