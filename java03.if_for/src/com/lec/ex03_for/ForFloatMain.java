package com.lec.ex03_for;

public class ForFloatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for문 초기화식에서 루프 카운트 변수를 선언시에
		// 부동소수점타입(실수)는 사용하지 않아야 한다.
		
		for(float f=0.1f; f<=1.0f; f+=0.1f) {
			System.out.println(f);
		}
		// 상기 결과는 9번만 실행된다. 0.1은 float타입으로 정확하게
		// 계산할 수 없기 때문에 실제값은 0.1보다 약간 큰 값으로 처리된다.

	}

}
