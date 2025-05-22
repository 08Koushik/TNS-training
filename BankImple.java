package com.tnsif.interfaces;

public class BankImple implements Bank{
private double balance=1500;
	
//	//parameterized constructor
//	public BankImple(double balance) {
//		super();
//		this.balance = balance;
//	}
	@Override
	public void withdraw(double amount) {
       if(amount>0&&amount<=balance) {
       	balance=balance-amount;
       	System.out.println("The amount after withdraw"
       	+balance);
       }
       else {
       	System.err.println("Insufficient balance");
       	}
		
	}
	@Override
	public void deposit(double amount) {
        if(amount<DEPOSIT_LIMIT) {
		balance=balance+amount;
		System.out.println("The amount after deposit"
	        	+balance);
	}
        else {
        	System.err.println("Deposit limit exceeds");
	
        }
}
}


