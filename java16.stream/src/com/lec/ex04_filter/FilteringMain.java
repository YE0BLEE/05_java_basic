package com.lec.ex04_filter;

import java.util.Arrays;
import java.util.List;

public class FilteringMain {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍길동", "소향", "손흥민", "소향", "홍길녀");
		
		// 1. distinct()
		names.stream().distinct().forEach(System.out :: print);
		System.out.println();
		
		// 2. filter() : '소'로 시작하는 이름만 필터
		names.stream().filter(n -> n.startsWith("소")).forEach(System.out :: print);
		System.out.println();
		
		// 3. 중복 제거 후, '소'로 시작하는 이름 필터
		names.stream().distinct().filter(n -> n.startsWith("소")).forEach(System.out :: print);
		System.out.println();
		names.stream().filter(n -> n.startsWith("소")).distinct().forEach(System.out :: print);
		System.out.println();
		

	}

}
