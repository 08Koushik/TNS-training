package com.tnsif.accessmodmain;
import com.tnsif.accessmodifiers.*;

public class AccessModMain {
	public static void main(String[] args)
	{
		AccessModifiers ob=new AccessModifiers();
		
        System.out.println("Accessing from different package (non-subclass):");
        System.out.println("public: " + ob.numone);
        // System.out.println("protected: " + obj.number); //Error
        // System.out.println("private: " + obj.num);     //Error

        
	}
}
