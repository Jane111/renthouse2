package com.renthouse.DataBase;
import java.sql.*;

public class Database {
	Connection conn;
	
	private void open(){	
		try {
			Class.forName("com.mysql.jdbc.Driver");   //指定驱动程序类型
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/renthouse", "root", "123456");
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
			rs = stmt.executeQuery(sql);//执行查询结果，执行后返回代表查询结果的ResultSet对象。
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
			re = stmt.executeUpdate(sql);//用于执行 INSERT、UPDATE 或 DELETE 语句以及 SQL DDL（数据定义语言）语句，例如 CREATE TABLE 和 DROP TABLE。INSERT、UPDATE 或 DELETE 语句的效果是修改表中零行或多行中的一列或多列。executeUpdate 的返回值是一个整数（int），指示受影响的行数（即更新计数）。对于 CREATE TABLE 或 DROP TABLE 等不操作行的语句，executeUpdate 的返回值总为零。
		} catch (SQLException e) {
			System.out.println(e.toString() + sql);
		}//stmt.execute(sql)可用于执行任何SQL语句，返回一个boolean值，表明执行该SQL语句是否返回了ResultSet。如果执行后第一个结果是ResultSet，则返回true，否则返回false。但它执行SQL语句时比较麻烦，通常我们没有必要使用execute方法来执行SQL语句，而是使用executeQuery或executeUpdate更适合，但如果在不清楚SQL语句的类型时则只能使用execute方法来执行该SQL语句了。
		close();
		return re;
	}
	
	
}
