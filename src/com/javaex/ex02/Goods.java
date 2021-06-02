package com.javaex.ex02;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	
	//메소드-겟터세터
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		if(this.price<0) {
			return 0;
		}else {
		return price;
		}
	}
	
	//메소드-일반
	public void showInfo () {
		System.out.println("이름 : "+name);
		System.out.println("가격"+this.getPrice());
		System.out.println("----------------");
	}
}
