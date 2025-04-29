package com.tnsif.variablesdemo;

public class DemoVarMain {
	public static void main(String[] args)
	{
		DemoTypeVar ob=new DemoTypeVar();
		int result=ob.numone=10;
		System.out.println("instance variable"+result);
		ob.display();
		System.out.println("Static variable"+DemoTypeVar.numthree);
	}

}
