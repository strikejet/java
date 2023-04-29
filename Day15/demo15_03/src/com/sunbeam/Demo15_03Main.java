package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo15_03Main {
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

	// funds transfer from acc1 to acc2
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount: ");
		double amount = sc.nextDouble();
		System.out.print("Enter from account: ");
		int fromAccId = sc.nextInt();
		System.out.print("Enter to account: ");
		int toAccId = sc.nextInt();
	
		Connection con = null;
		try {
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			con.setAutoCommit(false); // START TRANSACTION;
			String sql = "UPDATE accounts SET balance=balance+? WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setDouble(1, -amount);
				stmt.setInt(2, fromAccId);
				int cnt1 = stmt.executeUpdate();

				stmt.setDouble(1, +amount);
				stmt.setInt(2, toAccId);
				int cnt2 = stmt.executeUpdate();
			
				if(cnt1 != 1 || cnt2 != 1)
					throw new RuntimeException("Funds transfer failed.");
			}
			// COMMIT;
			con.commit();
			System.out.println("Funds transferred.");
		}
		catch (Exception e) {
			e.printStackTrace();
			// ROLLBACK;
			con.rollback();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}










