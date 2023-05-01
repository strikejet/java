package com.sunbeam;
import java.sql.*;

public class Demo16_01Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/dac_quotes";
	public static final String DB_USER = "dac";
	public static final String DB_PASSWORD = "dac";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void displayAllUsersFwd() {
		String sql = "SELECT id, first_name, last_name, email, mobile FROM users";
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					int id = rs.getInt("id");
					String firstName = rs.getString("first_name");
					String lastName = rs.getString("last_name");
					String email = rs.getString("email");
					String mobile = rs.getString("mobile");
					System.out.printf("%d, %s, %s, %s, %s\n", id, firstName, lastName, email, mobile);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void displayAllUsersRev() {
		String sql = "SELECT id, first_name, last_name, email, mobile FROM users";
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			try(PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
				ResultSet rs = stmt.executeQuery();
				rs.afterLast(); // set rs to after last position
				while(rs.previous()) {
					int id = rs.getInt("id");
					String firstName = rs.getString("first_name");
					String lastName = rs.getString("last_name");
					String email = rs.getString("email");
					String mobile = rs.getString("mobile");
					System.out.printf("%d, %s, %s, %s, %s\n", id, firstName, lastName, email, mobile);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void displayRandomUser() {
		int row = 3;
		String sql = "SELECT id, first_name, last_name, email, mobile FROM users";
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			try(PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
				ResultSet rs = stmt.executeQuery();
				if(rs.absolute(row)) { // set rs to given row
					int id = rs.getInt("id");
					String firstName = rs.getString("first_name");
					String lastName = rs.getString("last_name");
					String email = rs.getString("email");
					String mobile = rs.getString("mobile");
					System.out.printf("%d, %s, %s, %s, %s\n", id, firstName, lastName, email, mobile);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changePassword() {
		int userId = 4;	// sc.nextInt();
		String newPassword = "yogesh@321"; // sc.next();
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			String sql = "SELECT * FROM users WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
				stmt.setInt(1, userId);
				ResultSet rs = stmt.executeQuery();
				if(rs.next()) {
					rs.updateString("passwd", newPassword);
					rs.updateRow();
					System.out.println("Password changed.");
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//displayAllUsersFwd();
		//displayAllUsersRev();
		//displayRandomUser();
		changePassword();
	}
}
