package com.WrapperDemo;

public class Demo {

	
	public static void main(String[] args) {
		byte b = 34;
		Byte a = new Byte(b);
		System.out.println(a.byteValue());
		System.out.println(a.intValue());
		System.out.println(a.floatValue());
	}
}
