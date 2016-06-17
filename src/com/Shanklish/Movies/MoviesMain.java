package com.Shanklish.Movies;

import java.util.ArrayList;
import java.util.Scanner;


public class MoviesMain
    {

	public static void main( String[] args )
	{
	    Scanner scan = new Scanner(System.in);

	    ArrayList<Movie> moovies = new ArrayList<Movie>();

	    System.out.println("What movie genre are you interested in?(animated, scifi, drama, musical or horror");
	    String choice = scan.nextLine();
	    scan.nextLine();

	    
	    for(int i = 0; i < 101.; i++)
		     {
			 moovies.add(MovieIO.getMovie(i));		//adds movies to arraylist		 
		     }

	   for ( int i = 0 ; i < moovies.size() ; i++ )
	    {
		 Movie myMovie = moovies.get(i);		//stores elements of arraylist into Movie object
		 
		 if(myMovie.getCategory().equalsIgnoreCase(choice))
		     System.out.println(myMovie.getTitle());

	    }
		
		    
		   
	    }

	}
    
