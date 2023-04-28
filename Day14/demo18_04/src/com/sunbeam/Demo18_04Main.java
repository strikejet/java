package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

public class Demo18_04Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/dac_quotes";
	public static final String DB_USER = "dac";
	public static final String DB_PASSWD = "dac";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);	
			stmt = con.createStatement();
			
			String sql = "SELECT id, quote, author, user_id, created_at FROM quotes";
			rs = stmt.executeQuery(sql);
		
			while(rs.next()) {
				int id = rs.getInt("id");
				String quote = rs.getString("quote");
				String author = rs.getString("author");
				int userId = rs.getInt("user_id");
				Timestamp createdAt = rs.getTimestamp("created_at");
				System.out.printf("id=%d, quote=%s, by=%s, user=%d, time=%s\n", id, quote, author, userId, createdAt);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
