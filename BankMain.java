package com.tnsif.interfaces;

public class BankMain {
public static void main(String args[]) {
		
		BankImple ob=new BankImple();
		ob.withdraw(500);
		ob.deposit(2345);
		if(ob instanceof BankImple) {
		   
	        ob.deposit(6767);
		}	
		
	}
	}
