package com.lec.ex18_getset;

import java.util.Date;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		
		emp.setEmpno(7968);
		System.out.println("사원번호 = " + emp.getEmpno());
		
		emp.setAdult(true);
		System.out.println("성인여부 = " + emp.isAdult());
		
		emp.setDisease(true);
		System.out.println("질병유무 = " + emp.isDisease());
		System.out.println();
		
		Employee emp1 = new Employee(1000, "홍길동", new Date(), 10000, 10, true, "991223-1234567");
		Employee emp2 = new Employee(1001, "홍길순", new Date(), 20000, 20, true, "951223-2234567");
		Employee emp3 = new Employee(1001, "홍길상", new Date(), 25000, 30, true, "9251223-1234567");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println();
		
		
		String[] str = {"손흥민", "이강인", "김민재"};
		
		Employee[] employees = {emp1, emp2, emp3, new Employee(),
				new Employee(1100, "손흥민", new Date(), 10000, 10, true, "941245-2356789")};
		for(Employee employee : employees) {
			System.out.println(employee.toString());
		}

	}

}






