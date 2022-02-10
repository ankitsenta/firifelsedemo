package com.basic.forIfelsedemo;

import java.util.Scanner;

public class EvenNumber {

	

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		
		if  (0==i%2)
		{
			System.out.println("number is even");
		}
		
		else 
		{
			System.out.println("number is not a evennumber");
		}
		sc.close();
	}
     
	
}
