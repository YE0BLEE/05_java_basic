package com.lec.ex03_class;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메서드 오버로딩
		Human kor = new Human("손흥민");
		kor.speak();
		
		Human usa = new Human("미국놈");
		usa.speak("영어");
		
		Human chn = new Human("중국놈");
		chn.speak("광동어");
		
		kor.speak("한국어");
		
		kor.speak(30, "영어");
		
		usa.speak(25, "한국어");
		
		kor.speak("영어", 32);

	}

}
