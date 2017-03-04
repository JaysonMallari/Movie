package com.renz.movie;

public class MovieInfo {
	private String movieName, movieRating, movieYear;
	private int movieMins;
	
	public MovieInfo( String movieName, String movieRating, String movieYear, int movieMins){
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.movieYear = movieYear;
		this.movieMins =movieMins;
	}
	
	public String toString(){
		return "\nThis is your Movie " +
				"\nName: "+ movieName +
				"\nRating: "+ movieRating +
				"\nYear: "+ movieYear +
				"\nDuration: "+ movieMins;
	}

}
