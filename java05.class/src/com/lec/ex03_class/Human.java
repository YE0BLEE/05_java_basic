package com.lec.ex03_class;

public class Human {
	
	// 1. 필드
	String name;

	
	// 2. 생성자
	public Human() {}
	
	public Human(String name) {
		super();  // this : 객체 자신, super : 부모
		this.name = name;
	}
	
	
	// 3. 메서드
	// 문법 : void : return되는 값이 없을 때
	//        데이터타입 : return 데이터타입과 동일한 값
	
	// 메서드 오버로딩
	void speak() {System.out.println("말을 합니다.");}

	public void speak(String lang) {
		System.out.println(lang + "로 말을 합니다.");
		
		
	}

	public void speak(int age, String lang) {
		System.out.println("나는 "+ age + "살 입니다. " + lang + "로 말을 합니다.");
		
		
	}
	
	public void speak(String lang, int age) {
		System.out.println("나는 " + lang + "로 말을 합니다. 나이는 " + age + "살 입니다.");
		
		
	}

}







