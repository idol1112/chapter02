package com.javaex.ex14;

public class Person {
	
		//필드
		protected String name;
		protected int age;
		
		//생성자
		public Person() {
			System.out.println("person()");
		}
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
			System.out.println("person(2)");
		}

		//메소드 겟/셋
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		//데이터 확인용
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
		
		
		//메소드 기본
		public void showInfo() {//화면출력용 오래 걸린다., 만들기 힘듬
			System.out.println("------------------------");
			System.out.println("이름: "+name);
			System.out.println("나이: "+age);
		}

}
