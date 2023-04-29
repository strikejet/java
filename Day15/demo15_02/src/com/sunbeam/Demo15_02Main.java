package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class Demo15_02Main {
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter query: ");
		String sql = sc.nextLine();

		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
 			try(PreparedStatement stmt = con.prepareStatement(sql)) {
 				boolean isResultSet = stmt.execute();
 				if(isResultSet) {
 					ResultSet rs = stmt.getResultSet();
 					ResultSetMetaData metadata = rs.getMetaData();
 					System.out.println("Number of Columns: " + metadata.getColumnCount());
 					for (int i = 1; i <= metadata.getColumnCount(); i++) {
						String colLabel = metadata.getColumnLabel(i);
						System.out.print(colLabel + ", ");
 					}
 					System.out.println();
 					while(rs.next()) {
 						for (int i = 1; i <= metadata.getColumnCount(); i++) {
 							Object colValue = rs.getObject(i);
 							System.out.print(colValue.toString() + ", ");
 						}
 						System.out.println();
 					}
 				}
 				else {
 					int cnt = stmt.getUpdateCount();
 					System.out.println("Affected Rows: " + cnt);
 				}
 			} 			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
















