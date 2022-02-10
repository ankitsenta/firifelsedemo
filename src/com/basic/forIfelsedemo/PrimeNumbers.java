package com.basic.forIfelsedemo;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,m,j,flag;
		//Scanner sc= new Scanner(System.in);
		//int num=sc.nextInt();
		System.out.println("Display the prime number between 1 to 100");
		for(int i=0; i<100;++i)
		{
			m=i/2;
			flag=0;
			if (i==0||i==1)
			{
			}
			else
			{
			for(j=2;j<m;j++)
			{
			if(i%j==0)
			flag=1;
			}
					
				if(flag==0)
				
				System.out.print(i+" ");
				
			}
			
		}
		
		
		
	}

}
