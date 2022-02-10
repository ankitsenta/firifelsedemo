package com.basic.forIfelsedemo;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Please enter year");
int year=sc.nextInt();

if (year%4==0)
{
	System.out.println("Enter year is Leap Year");	
}
else
{
	System.out.println("Enter year is not a Leap Year");	

}
sc.close();
	}

}
