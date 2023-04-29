package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	private Connection con;
	private PreparedStatement insertUserStmt;
	private PreparedStatement changePasswdStmt;
	private PreparedStatement findByEmailStmt;
	
	public UserDao() throws Exception {
		con = DbUtil.getConnection();
		String insertUserSql = "INSERT INTO users(first_name,last_name,email,passwd,mobile) VALUES(?,?,?,?,?)";
		insertUserStmt = con.prepareStatement(insertUserSql);
		String changePasswdSql = "UPDATE users SET passwd=? WHERE id=?";
		changePasswdStmt = con.prepareStatement(changePasswdSql);
		String findByEmailSql = "SELECT * FROM users WHERE email=?";
		findByEmailStmt = con.prepareStatement(findByEmailSql);
	}
	
	public void close() {
		try {
			findByEmailStmt.close();
			changePasswdStmt.close();
			insertUserStmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int save(User u) throws Exception {
		int cnt = 0;
		insertUserStmt.setString(1, u.getFirstName() );
		insertUserStmt.setString(2, u.getLastName() );
		insertUserStmt.setString(3, u.getEmail() );
		insertUserStmt.setString(4, u.getPasswd() );
		insertUserStmt.setString(5, u.getMobile() );
		cnt = insertUserStmt.executeUpdate();
		return cnt;
	}
	
	public int changePassword(int userId, String newPassword) throws Exception {
		changePasswdStmt.setString(1, newPassword);
		changePasswdStmt.setInt(2, userId);
		int cnt = changePasswdStmt.executeUpdate();
		return cnt;
	}
	
	public User findByEmail(String email) throws Exception {
		findByEmailStmt.setString(1, email);
		ResultSet rs = findByEmailStmt.executeQuery();
		if(rs.next()) {
			int userId = rs.getInt("id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			email = rs.getString("email");
			String passwd = rs.getString("passwd");
			String mobile = rs.getString("mobile");
			User u = new User(userId, firstName, lastName, email, passwd, mobile);
			return u;
		}
		return null;
	}
	
	// findByEmailAndPassword() -- lab assignment
	
}
