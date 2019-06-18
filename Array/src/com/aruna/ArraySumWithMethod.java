package com.aruna;

//import java.util.Arrays;
import java.util.Scanner;

public class ArraySumWithMethod {

	int a[] = { 10, 20, 30, 40, 50 };

	public void sum()// it doent return anything beacause it is void
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("total sum is: " + sum);
	}

	public int sub()// return
	{
		int sub = 0;
		//Arrays.sort(a); to put array in increasing order

		for (int j = 0; j < a.length - 4; j++) 
		{
			sub = sub - a[j];
			a[j] = sub;
			sub = a[j] - a[j + 1];
		}

		return sub;

	}
	
	public void multiplication()
	{
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
		int n=scan.nextInt();
		
		for(int i=0;i<=10;i++)
		{
		System.out.println(n+"*"+i+"="+ (n*i));
		}
		scan.close();
	}
	
	public int division()
	{
		int a=20,b=10;
		int div=a/b;
		return div;
	}
	

	public static void main(String[] args) {

		ArraySumWithMethod arr = new ArraySumWithMethod();
		
		arr.sum();
		System.out.println("subtraction method: " + arr.sub());
		arr.multiplication();
System.out.println("Division Method: " + arr.division()); 

	}

}
