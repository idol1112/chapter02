package com.javaex.ex11;

public class MyMath {
	
	//필드
	private static double pi = 3.14;
	
	//생성자
	
	
	//메서드 g/s
	
	
	//메소드 일반 //메소드 오버로딩 ( 메소드명은 같으나 파라미터가 다름 )
	public static int plus(int a, int b) {
		
		int result = a+b; //복잡한 계산식 가정
		
		return result; 
	}
	
	public static double plus(double a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double circleArea(int radius) {
		double result = radius * radius * pi;
		return result;
	}
	
}
