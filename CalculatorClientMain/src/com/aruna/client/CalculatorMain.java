package com.aruna.client;

import com.aruna.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		//System.out.println(cal.calculate(5, 9, "PLUS"));
		int result=cal.calculate(5, 9, null);//execute return a*b line ;
		System.out.println("Result: " + result);

	}

}
