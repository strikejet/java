package com.sunbeam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo13_07Main {
	public static void main(String[] args) {
		//Set<User> set = new HashSet<>();
		//Set<User> set = new LinkedHashSet<>();
		//Set<User> set = new TreeSet<>();
		Set<User> set 
			= new TreeSet<>((x,y) -> x.getEmail().compareTo(y.getEmail()));

		set.add(new User(55, "turner", "turner@gmail.com", "123")); // ret true
		set.add(new User(44, "millar", "millar@gmail.com", "123")); // ret true
		set.add(new User(22, "bill", "bill@gmail.com", "123")); // ret true
		set.add(new User(11, "john", "john@gmail.com", "123")); // ret true
		set.add(new User(33, "steve", "steve@gmail.com", "123")); // ret true
		set.add(new User(66, "king", "king@gmail.com", "123")); // ret true
		set.add(new User(44, "miller", "killar@gmail.com", "123")); // ret false
		set.add(new User(77, "david", "millar@gmail.com", "123")); // ret false
		
		set.forEach(ele -> System.out.println(ele));
	}
}



