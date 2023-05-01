package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo16_06Main {
	public static final String MOVIE_FILE = "movies";
	
	public static void main(String[] args) {
		writeMovies();
		//readMovies();
	}

	public static void writeMovies() {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Hidden Figures", 7.8));
		list.add(new Movie(2, "Harry Potter", 6.5));
		list.add(new Movie(3, "Superman", 7.5));

		try(FileOutputStream fout = new FileOutputStream(MOVIE_FILE)) {
			try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Movies Saved.");
	}
	
	public static void readMovies() {
		List<Movie> list = new ArrayList<>();
		
		try(FileInputStream fin = new FileInputStream(MOVIE_FILE)) {
			try(ObjectInputStream oin = new ObjectInputStream(fin)) {
				list = (List<Movie>) oin.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Movie m : list)			
			System.out.println(m);
	}
}










