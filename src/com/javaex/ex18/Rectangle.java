package com.javaex.ex18;

public class Rectangle extends Shape {
	
	//필드
	private int width;
	private int height;
	
	
	//생성자
	public Rectangle() {
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		//super();      // Shape() --> 표기는 super()
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	
	//메소드-gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 기본
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public void draw() {
		//[면색:빨강, 선색:검정] 도형을 그렸습니다.
		System.out.println("[면색:"+fillColor+", 선색:"+lineColor+", 가로:"+width+", 가로:"+height+"] 사각형을 그렸습니다.");
	}
	
	public double area() {
		return width*height;
	}
}
