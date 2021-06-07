package com.javaex.ex13;

public class Student extends Person {
	
	//필드
	private String schoolName;

	
	
	//생성자
	public Student() {
	}
	
	public Student(String schoolName) {
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
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "age="+getAge()+"]";
	}
	
	
}
