package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class Demo18_06Main {
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
		//addNewQuote();
		//displayQuotesOfUser();
		//addNewQuoteImproved();
		displayQuotesOfUserImproved();
	}

	private static void displayQuotesOfUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User Id: ");
		String userId = sc.nextLine();
		
		String sql = "SELECT id, quote, author, user_id FROM quotes WHERE user_id = " + userId;
		System.out.println("SQL: " + sql);
		
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try(Statement stmt = con.createStatement()) {
				try(ResultSet rs = stmt.executeQuery(sql)) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String quote = rs.getString("quote");
						String author = rs.getString("author");
						int uId = rs.getInt("user_id");
						System.out.printf("%d, %s, %s, %d\n", id, quote, author, uId);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void addNewQuote() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter New Quote: ");
		String quoteStr = sc.nextLine();
		System.out.println("Enter Author: ");
		String author = sc.nextLine();
		System.out.println("Enter User Id: ");
		int userId = sc.nextInt();
		
		//String sql = "INSERT INTO quotes(quote,author,user_id) VALUES('"+quoteStr+"','"+author+"',"+userId+")";
		String sql = String.format("INSERT INTO quotes(quote,author,user_id) VALUES('%s','%s',%d)", quoteStr, author, userId);
		System.out.println("SQL: " + sql);
		
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try(Statement stmt = con.createStatement()) {
				int cnt = stmt.executeUpdate(sql);
				System.out.println("Rows affected: " + cnt);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void addNewQuoteImproved() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter New Quote: ");
		String quoteStr = sc.nextLine();
		System.out.println("Enter Author: ");
		String author = sc.nextLine();
		System.out.println("Enter User Id: ");
		int userId = sc.nextInt();
		
		String sql = "INSERT INTO quotes(quote,author,user_id,created_at) VALUES(?,?,?,?)";
		System.out.println("SQL: " + sql);
		
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, quoteStr);
				stmt.setString(2, author);
				stmt.setInt(3, userId);
				long time = new java.util.Date().getTime();
				java.sql.Timestamp ts = new Timestamp(time);
				stmt.setTimestamp(4, ts);
				
				int cnt = stmt.executeUpdate();
				System.out.println("Rows affected: " + cnt);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void displayQuotesOfUserImproved() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User Id: ");
		int userId = sc.nextInt();
		
		String sql = "SELECT id, quote, author, user_id FROM quotes WHERE user_id = ?";
		System.out.println("SQL: " + sql);
		
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, userId);
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String quote = rs.getString("quote");
						String author = rs.getString("author");
						int uId = rs.getInt("user_id");
						System.out.printf("%d, %s, %s, %d\n", id, quote, author, uId);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}













