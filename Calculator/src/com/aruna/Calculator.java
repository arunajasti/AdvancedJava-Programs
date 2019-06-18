package com.aruna;

public class Calculator {


	public int calculate(int a, int b, String type) 
	{
		if("PLUS".equals(type))
		{
			return a+b;
		}else
			if("MINUS".equals(type))
		{
		return a-b;
		}else
			return a*b;	
		}
}
