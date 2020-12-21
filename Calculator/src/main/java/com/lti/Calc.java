package com.lti;

public class Calc {

	public static int add(int n, int m){
		return (n+m);
	}
	
	public static int sub(int n, int m){
		return (n-m);
	}
	
	public static int pro(int n, int m){
		return (n*m);
	}
	public static int div(int n, int m){
		return (n/m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum= "+add(10,20));
		System.out.println("Difference= "+sub(50,20));
		System.out.println("Product= "+pro(50,20));
		System.out.println("Division= "+div(10,2));

	}

}
