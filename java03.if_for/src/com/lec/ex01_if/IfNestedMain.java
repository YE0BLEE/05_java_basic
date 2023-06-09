package com.lec.ex01_if;

public class IfNestedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 81~100 사이의 난수를 생성
		Math.random(); // 0.0 <= random < 1.0 범위의 실수를 리턴
		double num = Math.random();
		System.out.println(num);
		System.out.println(num*20);            // 0.0 <= x < 20
		System.out.println((int)(num*20)+81);  // 81.0 <= x < 1000
		
		int score = (int)(num*20) + 81;
		
		// 중첩 if
		// 1. >=90 -> 95>= A+, A0;
		// 2. >=80 -> 85>= B+, B0;
		String grade = "";
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		} else if(score>=80) {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B0";
			}
		}
        System.out.println(grade);
	}

}
