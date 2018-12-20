package com.renthouse.common;
import java.sql.*;

public class Database {
	Connection conn;
	
	private void open(){	
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/renthousetest?characterEncoding=utf8&allowMultiQueries=true", "root", "password");
			//配置传入的字符为UTF-8，并且可以一次执行多条语句
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
	}
	
	private void close(){
		conn = null;
	}
	
	public ResultSet query(String sql){
		ResultSet rs = null;
		open();		
		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println(e.toString() + sql);
		}		
		return rs;
	}
	
	public int execute(String sql){
		int re = -1;
		open();
		try {
			Statement stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.toString() + sql);
		}
		close();
		return re;
	}
	
	
}
