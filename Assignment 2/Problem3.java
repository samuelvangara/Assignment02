package com.java.Assignment2;

public class Problem3 {

	public static void main(String[] args) {
		Block b = new Block(){
			public void type() {
				System.out.println("this is interface block");
				System.out.println(Block.method());
			}
			{
				System.out.println("this is instance block");
			}
		};
		b.type();
	}
	interface Block{
		static String method(){
			return "this is static block";
		}
		void type();
	}
}