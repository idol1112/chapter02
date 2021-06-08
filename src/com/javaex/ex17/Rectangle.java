package com.javaex.ex17;

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
}
