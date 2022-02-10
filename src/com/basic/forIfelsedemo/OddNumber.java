package com.basic.forIfelsedemo;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter number here");
		int i=sc.nextInt();
		
		if  ((i%2)!=0)
		{
			System.out.println("number is odd");
		}
		
		else 
		{
			System.out.println("number is not a oddnumber");
		}
	sc.close();
	
	}
}
