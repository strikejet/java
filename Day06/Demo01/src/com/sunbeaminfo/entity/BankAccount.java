package com.sunbeaminfo.entity;

import java.util.Scanner;

public class BankAccount {
	private final int acccno;
	private String customerName;
	private double balance;
	private static int generate_accno;
	
	static {
		generate_accno = 1000;
	}
	
	public BankAccount() {
		this("",0);
	}
	
	public BankAccount(String customerName, double balance) {
		this.acccno = ++generate_accno;
		this.customerName = customerName;
		this.balance = balance;
	}

	public int getAcccno() {
		return acccno;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void acceptAccount() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name of customer = ");
		this.customerName = sc.next();
		
		System.out.println("Enter the initial balance");
		this.balance = sc.nextDouble();
	}
	
	public void displayAccount() {
		System.out.println("Accno = "+this.acccno);
		System.out.println("Name = "+this.customerName);
		System.out.println("Balance = "+this.balance);
	}
	
	public void changeBalance() {
		
	}
	
	
	
}
