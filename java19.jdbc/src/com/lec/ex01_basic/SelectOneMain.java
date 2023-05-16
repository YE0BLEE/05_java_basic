package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOneMain {
	
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "TIGER";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			String sql = "select * from emp where empno=? and job=?";
			int row = 0;
			
			// emp테이블에서 한 건 읽기
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  7369);
			pstmt.setString(2, "CLERK");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String hiredate = rs.getString("hiredate");
				System.out.println("empno: " + empno + ", ename: " + ename + ", hiredate: " + hiredate);
			} else {
				System.out.println("data not founded");
			}
			
		} catch (Exception e) {
			System.out.println("DB connect failed");
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}

	}

}