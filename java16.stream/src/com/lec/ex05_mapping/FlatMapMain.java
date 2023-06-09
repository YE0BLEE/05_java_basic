package com.lec.ex05_mapping;

import java.util.Arrays;
import java.util.List;

/*
    매핑: flatMapXXX(), mapXXX(), asXXXStream(), boxed()
    
    매핑은 중간처리기능으로 스트림의 요소를 다른 요소로 대체하는 작업을 말한다.
    스트림에서 제공하는 매핑메서드는 flatMapXXX(), mapXXX(), asXXXStream(), boxed()가 있다.
    
    1. flatMapXXX() : 이 메서드는 요소를 대체하는 복수 개의 요소들로 구성된 새로운 스트림으로 리턴
    
    2. mapXXX() : 이 메서드는 요소를 대체하는 한 개의 요소로 구성된 새로운 스트림으로 리턴
    
    3. asXXXStream()
    
       a. asDoubleStream()메서드는 IntStream의 int, LongStream의 long의 값 등을 double타입으로 리턴
       b. asLongStream()메서드는 int 값을 long으로 타입변환 후 LongStream으로 리턴
       
    4. boxed() : int, long, double 기본타입을 각각 Integer, Long, Double로 박싱 후 stream으로 리턴
*/

public class FlatMapMain {

	public static void main(String[] args) {
		
		// 1. flatMap : 복수 개의 요소로 대체
		List<String> list1 = Arrays.asList("java8 lambda", "stream mapping");
		list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))  // java8, lambda, stream, mapping
		              .forEach(System.out :: println);
		System.out.println();
		
		// 2. flatMapToInt
		List<String> list2 = Arrays.asList("10,20,30", "40,50,60,70,80,90,100");
		list2.stream().flatMap(data -> Arrays.stream(data.split(",")))
        .forEach(System.out :: println);
        System.out.println();
        
        
        list2.stream().flatMapToInt(data -> {
        	String[] str_arr = data.split(",");
        	int[] int_arr = new int[str_arr.length];
        	for(int i=0; i<str_arr.length; i++) {
        		int_arr[i] = Integer.parseInt(str_arr[i].trim());
        	}
        	return Arrays.stream(int_arr);
        }).forEach(System.out :: println);

	}

}











