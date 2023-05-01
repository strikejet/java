package com.sunbeam;

import java.io.Serializable;

public class Movie implements Serializable {
	private static final long serialVersionUID = -6921724673001800872L;
	
	private int id;
	private String title;
	private double rating;
	private transient String genres; // this field will not be serialized/deserialized
	
	public Movie() {
	}

	public Movie(int id, String title, double rating) {
		this.id = id;
		this.title = title;
		this.rating = rating;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", rating=" + rating + "]";
	}
	
}
