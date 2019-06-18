package com.aruna;

public class ArraySum {

public static void main(String[] args) {
		int a[]={10,20,30,40};
		
		int sum=0;
		
		System.out.println("print the elements: " );
		
		for(int i=0;i<a.length;i++)//this forloop for print the elements
		{
			System.out.println(a[i] );
		}
		
		for(int i=0;i<a.length;i++)//this forloop for sum
		{
			sum=sum+a[i];
			
		}
		System.out.println( "totalsum is: " + sum);

	}

}
