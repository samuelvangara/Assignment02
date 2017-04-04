package com.java.Assignment2;

public class Problem5 {

	public static void main(String[] args) {
		Test t = new Test();
	}

}

class Test{
	static{
		System.out.println("this is static method");
	}

	{
		System.out.println("Lamborgini");	
	}
	Test(){
		System.out.println("This is Constructor block");
	}
}
