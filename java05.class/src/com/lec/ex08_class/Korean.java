package com.lec.ex08_class;

// 인터페이스는 상속이라 하지 않고 구현한다는 의미로
// implements를 사용한다.
public class Korean implements Human {

	@Override
	public void speak(String lang) {
		System.out.println(lang + "로 말을 합니다.");
		
	}

	@Override
	public void move() {
		System.out.println("김치를 만듭니다.");
		
	}

	@Override
	public void think() {
		System.out.println("한국어로 생각을 합니다.");
		
	}
	
	

}
