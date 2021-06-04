package com.javaex.ex10;

public class GoodApp {

	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[3];
		
		Goods computer = new Goods("그램", 100000);
		Goods camera = new Goods("니콘", 100000);
		Goods cup = new Goods("머그컵", 2000);
		
		goodsArray[0] = computer;
		goodsArray[1] = camera;
		goodsArray[2] = cup;
		
		for(int i=0;i<goodsArray.length;i++) {
			
		}

	}

}
