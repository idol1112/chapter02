package com.javaex.ex05;

public class Goods {

	//필드
		private String name;
		private int price;
		
		//생성자
		public Goods() {
			//Goods 메모리(힙)에 올리는 것
		}
		public Goods(String name, int price) {
			//Goods 메모리(힙)에 올리는 것
			this.name = name;
			this.price = price;
		}
		//메소드-겟터세터
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		
		//메소드-일반
		public void showInfo () {
			System.out.println("이름 : "+name);
			System.out.println("가격"+this.getPrice());
			System.out.println("----------------");
		}

}
