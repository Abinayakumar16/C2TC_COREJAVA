package com.tnsif.daytwo;

public class NestedIfelseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20, c=5;
		System.out.println("The largest number is");
		if (a > b) {     //10>20; 
		if (a > c)
		System.out.println(a);
		else
		System.out.println(c);
		} else {
		if (c > b)
		System.out.println(c);
		else
		System.out.println(b);
		}

	}

}



