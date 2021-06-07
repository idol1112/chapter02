package com.javaex.ex14;

public class Student extends Person {
	
	//필드
	private String schoolName;

	
	
	//생성자
	public Student() {
		super();
		System.out.println("student()");
	}
	/*
	/*
	//부모의 Person(2)생성자 사용
	public Student(String name, int age, String schoolName) {
		//super(name, age);
		super();
		this.schoolName = schoolName;
		System.out.println("student(3)");
	}
	*/
	//부모의 Person()생성자 사용
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name);
		super.setAge(age);
		this.schoolName = schoolName;
	}
	//메소드 겟셋
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	
	//메소드 기본
	public void showInfo() {//화면출력용 오래 걸린다., 만들기 힘듬
		System.out.println("------------------------");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("학교: "+schoolName);
		System.out.println("------------------------");
	}
	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "age="+getAge()+"]";
	}
	
	
}
