package com.aruna;

public class BasicArray {

	public static void main(String[] args) {
		int number[]=new int[2];
		
		number[0]=9;
		number[1]=10;
		//number[2]=2; if you add this line it gives ArrayIndexOutOFBounds exception
		
		
		for(int i=0;i<number.length;i++)
		{
			System.out.println("number[" + i  +"] : " + number[i]);
		}

	}

}
