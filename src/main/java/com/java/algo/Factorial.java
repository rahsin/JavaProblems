package com.java.algo;

public class Factorial {
	
	public int recFactorial(int n){
		if(n == 0)
			return 1 ;
		else
			return n*recFactorial(n -1 );
	} 
	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.recFactorial(-5));
	}

}
