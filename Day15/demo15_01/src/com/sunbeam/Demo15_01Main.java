package com.sunbeam;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Date;

public class Demo15_01Main {
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
		//getQuotesOfUser();
		getQuoteDetails();
	}

	public static void getQuoteDetails() {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			String sql = "CALL sp_getquote_details(?, ?, ?)";
			try(CallableStatement stmt = con.prepareCall(sql)) {
				int quoteId = 2; // sc.nextInt();
				stmt.setInt(1, quoteId);
				stmt.registerOutParameter(2, Types.VARCHAR);
				stmt.registerOutParameter(3, Types.VARCHAR);
				stmt.execute();
				String quote = stmt.getString(2);
				String author = stmt.getString(3);
				System.out.println(quote + " -- " + author);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getQuotesOfUser() {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			String sql = "CALL sp_getquotes(?)";
			try(CallableStatement stmt = con.prepareCall(sql)) {
				int userId = 1; // sc.nextInt();
				stmt.setInt(1, userId);
				
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						String quote = rs.getString("quote");
						String author = rs.getString("author");
						Timestamp createdAt = rs.getTimestamp("created_at");
						Date quoteDate = createdAt == null? null : new Date(createdAt.getTime());
						String firstName = rs.getString("first_name");
						String lastName = rs.getString("last_name");
						
						System.out.printf("%s, %s, %s, %s, %s\n", quote, author, quoteDate, firstName, lastName);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}











