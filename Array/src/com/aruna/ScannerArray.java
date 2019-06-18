package com.aruna;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int array[]=new int[size];//if i enter 4 it gives arrayIndexOutOfBounds because the total array length is 6(0-5) indexes
		array[0]=1;
		array[2]=200;
		array[4]=300;
		array[5]=500;
		array[3]=245;
		array[1]=150;
		for(int i=0;i<array.length;i++)
		{
		System.out.println(array[i]);
		}
		sc.close();

	}

}
