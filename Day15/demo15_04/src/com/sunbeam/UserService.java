package com.sunbeam;

import java.util.Scanner;

public class UserService {
	private UserDao userDao;
	
	public UserService() {
		try {
			userDao = new UserDao();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		userDao.close();
	}
	
	public void signUp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("First Name: ");
		String firstName = sc.next();
		System.out.print("Last Name: ");
		String lastName = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Password: ");
		String passwd = sc.next();
		System.out.print("Mobile: ");
		String mobile = sc.next();
		User u = new User(0, firstName, lastName, email, passwd, mobile);
		try {
			int cnt = userDao.save(u);
			System.out.println("Users Saved: " + cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changePassword() {
		Scanner sc = new Scanner(System.in);
		System.out.print("User Id: ");
		int userId = sc.nextInt();
		String email = sc.next();
		System.out.print("New Password: ");
		try {
			int cnt = userDao.changePassword(userId, email);
			System.out.println("Password changed: " + cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void signIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Password: ");
		String passwd = sc.next();
		try {
			User u = userDao.findByEmail(email);
			if(u != null && u.getPasswd().equals(passwd))
				System.out.println("Welcome, " + u.getFirstName());
			else
				System.out.println("Invalid email or password.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




