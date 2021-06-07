package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		
//		Student s01 = new Student();
//		s01.setName("정우성");
//		s01.setAge(50);
//		s01.setSchoolName("민사고등학교");
//		
//		s01.showInfo();
		
		//Student 생성자(3) 사용
		//생성자 순서 (부모까지 포함)
		/*
		Student s02 = new Student("이효리", 45, "제주고등학교");
		s02.showInfo();
		*/
		// 부모의 디폴트 생성자 사용-->확인
		//Student s03 = new Student();
		
		Student s04 = new Student("유재석", 47, "풍덕고등학교");
	}

}
