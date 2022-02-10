package com.basic.forIfelsedemo;
import java.util.Scanner;
public class FibonaciSeries {

	
	static int n1=0,n2=1,n3;
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		int count=sc.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=0;i<count-2;i++)
		{
	
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(" "+n3+" ");
	
	}
	}
}
