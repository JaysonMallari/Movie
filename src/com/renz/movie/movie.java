package com.renz.movie;
/*
 * @ Jayson Mallari
 */
import java.util.Scanner;
public class movie {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int movieMins;
		String movieName, movieRating, movieYear;
		
		//get Movie input from the user
		System.out.println("Please Enter the following information : ");
		System.out.print("Movie Name: ");
		movieName = in.nextLine();
		System.out.print("Movie Rating: ");
		movieRating = in.nextLine();
		System.out.print("Movie Year: ");
		movieYear = in.nextLine();
		System.out.print("Movie Time(minutes): ");
		movieMins = in.nextInt();
		
		//create an object movie01 and used user inputs value .
		MovieInfo movie01 = new MovieInfo(movieName, movieRating, movieYear, movieMins);
		//display our Object value
		System.out.println(movie01.toString());
	}
}
