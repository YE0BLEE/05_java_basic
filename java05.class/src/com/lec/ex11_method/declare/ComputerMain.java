package com.lec.ex11_method.declare;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com1 = new Computer();
		System.out.println("1~10까지 합 = " + com1.add(1,2,3,4,5,6,7,8,9,10));
		System.out.println("1~ 5까지 합 = " + com1.add(1,2,3,4,5));
		System.out.println();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("1~10까지 합 = " + com1.add(arr));
		System.out.println("1~ 5까지 합 = " + com1.add(new int[] {1,2,3,4,5}));
		System.out.println();
		
		System.out.println("1~10까지 합 = " + com1.add1(1,2,3,4,5,6,7,8,9,10));
		System.out.println("1~ 5까지 합 = " + com1.add1(1,2,3,4,5));
		System.out.println("1~ 3까지 합 = " + com1.add1(1,2,3));
		System.out.println("1~11까지 합 = " + com1.add1(1,2,3,4,5,6,7,8,9,10,11));
		

	}

}
