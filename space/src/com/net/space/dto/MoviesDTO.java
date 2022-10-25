package com.net.space.dto;

import java.util.Arrays;

public class MoviesDTO {
	private String movieName;
	private String[] actors;
	private int budget;
	private String[] producers;
	private int releaseDate;
	private int collection;
	
	public MoviesDTO() {
		
	}

	@Override
	public String toString() {
		return "MoviesDTO [movieName=" + movieName + ", actors=" + Arrays.toString(actors) + ", budget=" + budget
				+ ", producers=" + Arrays.toString(producers) + ", releaseDate=" + releaseDate + ", collection="
				+ collection + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String[] getProducers() {
		return producers;
	}

	public void setProducers(String[] producers) {
		this.producers = producers;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getCollection() {
		return collection;
	}

	public void setCollection(int collection) {
		this.collection = collection;
	}
	
	
}
