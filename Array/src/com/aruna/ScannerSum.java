package com.aruna;

import java.util.Scanner;

public class ScannerSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		
		System.out.println("Enter the values");
		for(int i=0;i<5;i++)//this for loop for enter the values from keyboard
		{
		a[i]=sc.nextInt();
		}
		System.out.println(" Total sum is: ");
		for(int num:a)//this for loop sum 
		{
		sum=sum+num;
		}

		System.out.println(sum);
		sc.close();

	}
	
}
