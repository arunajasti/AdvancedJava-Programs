package com.aruna;
//i want print only 3 names
public class ArrayDemo {

	public static void main(String[] args) {
		String names[]=new String[4];
		names[0]="aruna";
		names[1]="arjun";
		names[2]="sandhya";
		names[3]="suni";
		System.out.println("Normal For loop\n");
		for(int i=0;i<4;i++)
		{
			if(names[i].equals("suni"))
				break;
		System.out.println("Names[" + i + "]: " + names[i]);
		}
		//for each loop
		System.out.println("\nEnhanced for loop\n");
		for(String values:names)
		{

			if(values.equals("suni"))
				break;
		System.out.println(values);
		}
		}
	}


