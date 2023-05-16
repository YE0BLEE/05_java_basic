package com.lec.ex05_string_builder;

/*
    StringBuilder, StringBuffer 클래스
    
    문자열을 저장하는 String클래스는 내부의 문자열을 직접 수정할 수 없다.
    예를 들어 String.replace() 메서드는 내부의 문자열을 변경하는 것이 아닌
    새롭게 대체된 문자열 객체를 리턴한다. "JAVA " + "PROGRAMMING" 을 실행할 경우
    내부 문자열을 수정할 수 없기 때문에  "JAVA PROGRAMMING" 이라는 새로운 String객체를
    생성한 후에 그 객체의 메모리 주소를 리턴한다. 문자열을 결합할 경우에 +연산자를 사용하면
    그 수 만큼의 새로운 String객체의 수가 증가하기 때문에 프로그램 성능저하의 원인이 된다.
    
    따라서, 문자열을 변경하는 작업이 많을 경우에는 String클래스를 사용하는 것 보다
    java.lang에 있는 StringBuffer or StringBuilder 클래스를 사용하는 것이 좋다.
    이 두 클래스는 내부법: buffer, 데이터를 임시로 저장하는 메모리에 문자열을 저장해 두고
    그 안에서 수정, 추가, 삭제 등의 작업을 할 수 있도록 한다.
    String처럼 새로운 객체를 만들지 않고, 문자열을 조작할 수 있다는 장점이 있다.
    
    StringBuffer, StringBuilder의 사용법은 동일하지만 차이점은 StringBuffer는 멀티쓰레드환경에서
    사용할 수 있게 동기화가 적용이 되어있는 쓰레드: Thread에 안전하지만 
    StringBuilder는 안전하지 못해 단일쓰레드환경에서만 사용하도록 설계되어 있다.
    
    StringBuffer, StringBuilder 제공 메서드
    
    1. append : 문자열 끝에 주어진 문자열을 추가
    2. insert : 문자열 사이에 주어진 문자열을 삽입
    3. delete : 매개값으로 주어진 문자열을 삭제
    4. deleteCharAt : 주어진 위치(index)의 문자를 삭제
    5. replace : 다른 문자열로 변경
    6. reverse : 문자열을 그대로 뒤집기
    7. setCharAt : 주어진 위치의 문자열을 매개변수로 전달된 문자열로 대체
    
    StringBuilder(int capacity) 생성자는 capacity로 주어진 수 만큼의 문자를 저장할 수 있는
    초기 buffer를 생성한다. StringBuilder는 버퍼가 부족할 경우 자동으로 버퍼크기 만큼 증가시켜
    주기 때문에 초기 버퍼의 크기는 그다지 중요하지 않다.
*/

public class StringBufferMain {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 1. append
		sb.append("Java");
		System.out.println(sb.hashCode() + ", " + sb);
		sb.append(" Programming");
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 2. insert
		sb.insert(4, "홍길동");
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 3. delete
		sb.delete(4, 5);
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 4. deleteCharAt
		sb.deleteCharAt(4);
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 5. replace
		sb.replace(4, 6, "이강인");
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 6. reverse
		sb.reverse();
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 7. setCharAt
		sb.setCharAt(6, 'X');
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 8. length
		System.out.println(sb.hashCode() + ", " + sb.reverse() + ", length: " + sb.length());
		
		// 9. toString(): StringBuilder를 String으로 변환
		String result = sb.toString();
		System.out.println(result.hashCode() + ", " + result + ", " + result.getClass());
		
		// 10 . String을 StringBuffer 참조타입으로 변환
		StringBuffer sb1 = new StringBuffer(result);
		System.out.println(sb1.hashCode() + ", " + sb1 + ", " + sb1.getClass());

	}

}












