package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo16_05Main {
	public static final String MOVIE_FILE = "movies";
	
	public static void main(String[] args) {
		//writeMovies();
		readMovies();
	}

	public static void writeMovies() {
		Movie m = new Movie(1, "Hidden Figures", 7.8);

		try(FileOutputStream fout = new FileOutputStream(MOVIE_FILE)) {
			try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(m);
				System.out.println("Movie Saved.");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readMovies() {
		Movie m = null;
		try(FileInputStream fin = new FileInputStream(MOVIE_FILE)) {
			try(ObjectInputStream oin = new ObjectInputStream(fin)) {
				m = (Movie) oin.readObject();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(m);
	}
}










