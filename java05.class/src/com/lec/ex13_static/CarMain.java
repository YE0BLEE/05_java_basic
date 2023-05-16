package com.lec.ex13_static;

/*
    정적 메서드와 정적 블럭 사용시에 주의할 점
    
    정적 메서드와 정적 블럭을 선언할 때 주의할 점은 객체가 생서되지 않아도
    즉, 객체가 없어도 실행된다는 특징 때문에 정적 메서드와 정적 블럭 내부에
    인스턴스 필드나 인스턴스 멤버를 사용할 수 없다.
    객체 자신의 참조 키워드인 this도 사용할 수 없다.
    
    정적 메서드와 정적 블럭에서 객체 멤버를 사용하고 싶다면 객체를 먼저 생성하고
    참조 변수로 접근해야 한다.
    
    또한, main 메서드도 정적 메서드이기 때문에 동일한 규칙이 적용된다.
    이런 이유로 main 메서드도 객체 생성없이 객체 멤버(필드와 메서드)를 바로 사용할 수 없다. 
*/

public class CarMain {

	int speed;
	void run() {
		System.out.println("현재 속력 " + speed + "km/h" + " 입니다.");
	}
	
	public static void main(String[] args) {
		
		// speed와 run은 객체 멤버이기 때문에 정적 멤버인 main에서 접근 불가
//		speed = 100;
//		run();
		
		CarMain car = new CarMain();
		car.speed = 100;
		car.run();
		
		

	}

}









