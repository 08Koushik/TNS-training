package com.tnsif.exceptionhandling;

class MyException extends Exception{
	public MyException(String mesg) {
		super(mesg);
	}
}
class ValidateAge{
	public static void validateAge(int age) throws MyException,ArithmeticException{
		if(age<0) {
			throw new MyException("Invalid age");
		}
		else {
			System.out.println("valid age");
		}
	}
}


public class CustomException {
	public static void main(String args[]) {
		try {
			ValidateAge.validateAge(12);
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid age");
		}
	}

}
