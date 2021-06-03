package com.javaex.ex06;

public class point {
		//필드
		private int x;
		private int y;
		
		//메소드
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public void draw() {
			System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		}
}
