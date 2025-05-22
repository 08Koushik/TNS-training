package com.tnsif.exceptionhandling;

public class WithoutException {
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException{
		try {
			int a=10;
			int b=0;
			int c=a/b;
			int arr[]= {1,2,3,4};
			arr[5]=6;
			System.out.println(c);
			System.out.println(arr[5]);	
		}
		catch(ArithmeticException e) {
			System.out.println("A number can't be divided by zero");
		}
		catch(Exception e) {
			System.out.println("Array index out of bounds");
		}
	}

}
