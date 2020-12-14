package com.itbulls.rostkowski.piformatting;

import java.util.Formatter;

public class PINumberFormatting {

	public static void main(String[] args) {
		
		Formatter formatter = new Formatter();
		
		formatter = new Formatter();
		formatter.format("%.2g", Math.PI);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%.3g", Math.PI);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%.4g", Math.PI);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%.5g", Math.PI);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%.6g", Math.PI);
		System.out.println(formatter);
		
		
		System.out.println("----------------------");
		
		System.out.printf("%.1f%n", Math.PI);
		System.out.printf("%.2f%n", Math.PI);
		System.out.printf("%.3f%n", Math.PI);
		System.out.printf("%.4f%n", Math.PI);
		System.out.printf("%.5f%n", Math.PI);
	}

}
