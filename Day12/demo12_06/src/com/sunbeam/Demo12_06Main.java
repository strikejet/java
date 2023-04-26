package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class Demo12_06Main {
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User(11, "john", "john@gmail.com", "123"));
		list.add(new User(22, "bill", "bill@gmail.com", "123"));
		list.add(new User(33, "steve", "steve@gmail.com", "123"));
		list.add(new User(44, "millar", "millar@gmail.com", "123"));
		list.add(new User(55, "turner", "turner@gmail.com", "123"));
		list.add(new User(66, "king", "king@gmail.com", "123"));
		
		list.forEach(u -> System.out.println(u));
		System.out.println();
		
		int keyUserId = 44;
		User key = new User();
		key.setId(keyUserId);
		int index = list.indexOf(key);
		if(index == -1)
			System.out.println("User Not Found.");
		else {
			System.out.println("User Found at Index : " + index);
			User u = list.get(index);
			System.out.println(u);
		}
		System.out.println();
		
		String keyEmail = "king@gmail.com";
		for (User u : list) {
			if(u.getEmail().equals(keyEmail)) {
				System.out.println("Found: " + u);
				break;
			}
		}
	}
}








