package com.sunbeam;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Demo16_07Main {
	public static final String MOVIES_FILE = "movies.txt";
	
	public static void main(String[] args) {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Hidden Figures", 7.8));
		list.add(new Movie(2, "Harry Potter", 6.5));
		list.add(new Movie(3, "Superman", 7.5));

		try(FileOutputStream fout = new FileOutputStream(MOVIES_FILE)) {
			try (PrintStream pout = new PrintStream(fout)) {
				for(Movie m:list)
					pout.printf("|%5d|%-30s|%8.1f|\n", m.getId(), m.getTitle(), m.getRating());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Movies Saved.");
	}

}
