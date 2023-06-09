package com.lec.ex01_intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaMain {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				    new Student("홍길동", 95),
				    new Student("홍길순", 91),
				    new Student("홍길자", 98),
				    new Student("홍길상", 92)
				);
		System.out.println(list.size());  // 외부반복자, 직렬처리
		
		Stream<Student> stream = list.stream();
		System.out.println(stream.count());  // 내부반복자, 병렬처리

		System.out.println();
		System.out.println(list.size());
//		System.out.println(stream.count());  // 에러: 내부반복자이기 때문에 스트림을 다시 생성해야 함.
		stream = list.stream();
		System.out.println(stream.count());
		System.out.println();
		
		// 학생 이름과 점수를 출력
		// forEach() 최종처리 메서드
		stream = list.stream();
		stream.forEach(s -> System.out.println(s.name + "의 점수: " + s.score));
		System.out.println();
		
		stream = list.stream();
		stream.forEach(s -> {
			String name = s.name;
			int score = s.score;
			System.out.println(name + "의 점수: " + score);
		});
		System.out.println();
		
		stream = list.stream();
		stream.forEach(s -> System.out.println(s.getName() + "의 점수 = " + s.getScore()));
		
	}

}


class Student {
	
	public String name;
	public int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	
}







