package com.lec.ex05_protected.pkg1;

public class B {
	
	// 동일 패키지 다른 클래스의 protected로 선언된
	// 필드, 생성자, 메서드는 접근이 가능하다.
	public B() {}
	B(int xxx) {}
	
	
	void method_b() {
		
		A a = new A();  // 동일 패키지 다른 클래스의 protected 생성자 접근 가능
		a.field1 = "문자열";
//		a. field2 = "접근불가";
		a.method_a();  // 동일 패키지 다른 클래스의 protected 메서드 접근 가능
		
		
	}


}
