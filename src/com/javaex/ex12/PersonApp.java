package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		//테스트
		Person p = new Person("김윤형", 24);
		p.showInfo();
		
		Student s = new Student("상현고등학교");
		s.setAge(27);
		s.setName("김덕배");

	}

}
