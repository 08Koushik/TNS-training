package com.tnsif.accessmodifiers;

public class AccessModifiers {
	public int numone;
	private int num;
	protected int number;
	public void show() {
        System.out.println("Inside AccessModifiers class:");
        System.out.println("public: " + numone);
        System.out.println("private: " + num);
        System.out.println("protected: " + number);
    }
}

