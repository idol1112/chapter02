package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		
		System.out.println(mm.plus(100, 100));
		
		System.out.println(mm.plus(100.5, 100.2));
		
		System.out.println(mm.circleArea(5));
	}

}
