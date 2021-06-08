package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);
		Rectangle r02 = new Rectangle("노랑", "검정", 6, 6);
		Rectangle r03 = new Rectangle("초록", "검정", 7, 7);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//배열을 이용한 그리기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//배열을 이용한 면색 변경
		for(int i=0; i<rArray.length; i++) {
			rArray[i].setFillColor("파랑");
		}
		
		//배열을 이용한 그리기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		/*
		//변수를 이용한 그리기
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle("빨강", "검정", 11);
		Circle c02 = new Circle("노랑", "검정", 22);
		Circle c03 = new Circle("노랑", "검정", 22);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//배열을 이용한 원 그리기
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
	}

}
