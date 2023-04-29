package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class QuoteService {
	private QuoteDao quoteDao;
	public QuoteService() {
		try {
			quoteDao = new QuoteDao();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close() {
		quoteDao.close();
	}
	
	public void displayAllQuotes() {
		try {
			List<Quote> list = quoteDao.findAll();
			list.forEach(q -> System.out.println(q));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayUserFavoriteQuotes() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User Id: ");
		int userId = sc.nextInt();
		try {
			List<Quote> list = quoteDao.findFavoritesByUserId(userId);
			System.out.println("Favorite Quotes of User: ");
			list.forEach(q -> System.out.println(q));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



