package com.lec.ex10_abstract_method;

public abstract class Animal {
	
	public String kind;
	
	public void breath() { System.out.println("숨을 쉰다."); }
	
//	public void sound() { System.out.println("소리를 낸다."); }

	public abstract void sound();  // 추상메서드로 자식클래스에서 반드시 구현해야 한다.
	
	
}
