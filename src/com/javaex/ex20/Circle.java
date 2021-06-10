package com.javaex.ex20;

public class Circle extends Shape {
	
	//필드
	private int radius;
	
	
	//생성자
	public Circle() {
		
	}


	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	
	
	//메소드 g/s
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//메소드-일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public void draw() {
		//[면색:빨강, 선색:검정] 도형을 그렸습니다.
		System.out.println("[면색:"+fillColor+", 선색:"+lineColor+", 반지름:"+radius+"] 원을 그렸습니다.");
	}
	
	public double area() {
		return radius*radius*3.14;
	}
}
