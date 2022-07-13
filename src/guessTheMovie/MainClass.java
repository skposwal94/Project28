package guessTheMovie;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {

		String moviePathInyourComputer = "C:\\Users\\skpos\\Downloads\\movies.txt";
		int noOfGuessesAllowed = 10;

		String[] moviesArray = MovieClass.readFileReturnArray(moviePathInyourComputer); // reading file and storing in
																						// array

		String selectedRandomMovie = MovieClass.selectRandomMovie(moviesArray); // selecting random movie from that
																				// array

		// The Logic

		System.out.println("Welcome to the game!!!!");
		MovieClass.gameLogic(noOfGuessesAllowed, selectedRandomMovie);

	}

}
