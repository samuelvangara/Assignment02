package com.java.Assignment2;

public class Problem4 {

	public static void main(String[] args) {
		Simple si = new Simple(){
			void car(){
				System.out.println("Lamborgini");
			}
		};
		si.car();
	}

}

abstract class Simple{
	static{
		System.out.println("this is static method");
	}
	{
		System.out.println("This is instance block");
	}
	abstract void car();
}
