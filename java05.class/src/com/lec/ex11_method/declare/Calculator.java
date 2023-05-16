package com.lec.ex11_method.declare;

public class Calculator {
	
	/*
	     메서드: method
	     
	     메서드는 객체의 동작에 해당하는 중괄호{}블럭을 갖는다. 중괄호 블럭은
	     이름을 가지고 있는데 이 것이 메서드명이다. 메서드를 호출하게 되면 
	     이 중괄호 블럭에 있는 실행문들이 일괄적으로 실행된다.
	     
	     메서드는 1) 필드를 읽거나 수정 2) 다른 객체를 생성해서 다양한 기능을 수행한다.
	     메서드는 객체간의 데이터 전달 수단으로 사용된다. 메서드는 외부로 부터 매개값을 
	     받을 수 있고, 실행한 후에 그 결과를 리턴할 수 있다.
	     
	      1. 메서드 선언
	      
	         메서드의 선언은 선언부와 실행부로 구성된다. 선언부에는 접근제한자, 리턴타입, 
	         메서드명과 매개변수 등을 선언하고, 이 선언부를 메서드 시그니처(method signature)라고 한다.
	         메서드의 실행부는 중괄호{}블럭을 말한다.
	      
	      2. 리턴 타입
	      
	         리턴 타입은 메서드가 실행한 결과를 리턴할 때 그 값의 데이터타입을 말한다.
	         메서드는 리턴값이 있을 수도 있고, 없을 수도 있다. 리턴값이 없을 경우에는 리턴 타입을 
	         void로 선언 - 반환되는 값의 데이터타입(기본타입, 참조타입)을 정의한다.
	      
	      3. 메서드 명명규칙
	      
	        1) 숫자로 시작 불가
	        2) $, _ 를 제외한 특수문자 사용불가
	        3) 관례로 메서드 이름은 소문자로 시작
	        4) 카멜케이스를 준수
	      
	 */
	
	// 실습. 사칙연산 기능을 가진 계산기 클래스
    // powerOn, add, sub, mul, div, powerOff
    // powerOn/Off를 제외한 4가지 메서드는 리턴값이 있도록 구현
	
	public void powerOn() {
		System.out.println("power on");

	}
	
	public void powerOff() {
		System.out.println("power off");

	}
	
	public int add(int a, int b) {
		int add = a + b;
		return add;
	}
	
	public int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}
	
	public int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}
	
	public double div(int a, int b) {
		if(b==0) {
			System.out.println("can't divided by 0");
			System.out.println();
			return 0;
		} else {
			double div = a / b;
			return div;
		}

	}
	
	
	String xxx(boolean val) {
		if(val) {
			return "true: 참조타입 String(문자열)을 반환했습니다!";
		} else {
			return "false: 참조타입 String(문자열)을 반환했습니다!";
		}
	}
	
	String yyy() {
		return new String("참조타입");
	}
	
	Calculator zzz() {
//		Calculator cal = new Calculator();
//		return cal;
		return new Calculator();
	}
	
	
	
}











