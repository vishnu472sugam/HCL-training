package com.gocorona;

public class Itemtype {
Double deposit;
Double costpershow;
String name;
public Itemtype()
{
}
public Itemtype(String name,Double deposit,double costpershow)
{
	this.name=name;
	this.deposit=deposit;
	this.costpershow=costpershow;
}
public Double getDeposit() {
	return deposit;
}
public void setDeposit(Double deposit) {
	this.deposit = deposit;
}
public Double getCostpershow() {
	return costpershow;
}
public void setCostpershow(Double costpershow) {
	this.costpershow = costpershow;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String toString()
{
	return "Itemtype{"+"name='"+name+'\''+",deposit="+deposit+",costpershow="+costpershow+'}';
}
public void display()
{
	System.out.println("The Details are: ");
	System.out.println("Name: "+this.name);
	System.out.println("Deposit: "+this.deposit);
	System.out.println("Costpershow: "+this.costpershow);
}
}
