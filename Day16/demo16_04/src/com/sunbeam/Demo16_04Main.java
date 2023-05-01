package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo16_04Main {
	public static final String MOVIE_FILE = "movies";
	
	public static void main(String[] args) {
		//writeMovies();
		readMovies();
	}

	public static void writeMovies() {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Hidden Figures", 7.8));
		list.add(new Movie(2, "Harry Potter", 6.5));
		list.add(new Movie(3, "Superman", 7.5));

		try(FileOutputStream fout = new FileOutputStream(MOVIE_FILE)) {
			try(DataOutputStream dout = new DataOutputStream(fout)) {
				for (Movie m : list) {
					dout.writeInt( m.getId() ); // id(int) --> bytes --> FOS
					dout.writeUTF( m.getTitle() ); // title(String) --> bytes --> FOS
					dout.writeDouble( m.getRating() ); // rating(double) --> bytes --> FOS
				}
				System.out.println("Movies Saved.");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readMovies() {
		List<Movie> list = new ArrayList<>();
		try(FileInputStream fin = new FileInputStream(MOVIE_FILE)) {
			try(DataInputStream din = new DataInputStream(fin)) {
				while(true) {
					int id = din.readInt();
					String title = din.readUTF();
					double rating = din.readDouble();
					Movie m = new Movie(id, title, rating);
					list.add(m);
				}
			}
		}
		catch (EOFException e) {
			// do nothing
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Movie m : list)
			System.out.println(m);
	}
}










