package com.sunbeam;

public class Demo15_04Main {
	public static void main(String[] args) {
		UserService userService = new UserService();
		QuoteService quoteService = new QuoteService();
		// case 1:
		//userService.signUp();
		//case 2:
		// userService.signIn();
		
		// case m:
		//quoteService.displayAllQuotes();
		
		// case n:
		quoteService.displayUserFavoriteQuotes();
		
		quoteService.close();
		userService.close();
	}
}
