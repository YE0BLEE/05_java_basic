package com.lec.ex02_array;

public class MultiArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바에서는 다차원 배열을 선언할 수 있다.
		// 다차원 배열은 정방형과 비정방형의 배열이 있다.
		
		// 1. 2행 3열 배열 선언
		int[][] mathScores = new int [2][3];
		
		// 배열의 크기 확인
		System.out.println("1차원 배열의 크기 = " + mathScores.length);
		System.out.println("2차원 배열의 첫 번째 크기 = " + mathScores[0].length);
		System.out.println("2차원 배열의 두 번째 크기 = " + mathScores[1].length);
		System.out.println();
		
		// 2. 정방형 배열의 for문
		for(int i=0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]");
			}
		}
	    System.out.println();
	    
	    
	    // 3. 비정방형 배열
	    int[][] engScores = new int[3][];
	    System.out.println("1차원 배열의 크기 = " + engScores.length);
//	    System.out.println("2차원 배열의 첫 번째 크기 = " + engScores[0].length);
//		System.out.println("2차원 배열의 두 번째 크기 = " + engScores[1].length);
	    System.out.println();
	    
	    engScores[0] = new int[2];
	    engScores[1] = new int[5];
	    engScores[2] = new int[1];
	    System.out.println("2차원 배열의 첫 번째 크기 = " + engScores[0].length);
	    System.out.println("2차원 배열의 두 번째 크기 = " + engScores[1].length);
		System.out.println("2차원 배열의 세 번째 크기 = " + engScores[2].length);
		System.out.println();
	    
		for(int i=0; i<engScores.length; i++) {
			for(int j=0; j<engScores[i].length; j++) {
				System.out.println("engScores[" + i + "][" + j + "]");
			}
		}
	    System.out.println();

	}

}

















