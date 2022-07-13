package guessTheMovie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MovieClass {

	// method for reading movies name into an array from file

	public static String[] readFileReturnArray(String filePathInyourComputer) throws IOException {

		List<String> listOfStrings = new ArrayList<String>();

		// load the data from file
		listOfStrings = Files.readAllLines(Paths.get(filePathInyourComputer));

		// convert arraylist to array
		String[] moviesArray = listOfStrings.toArray(new String[0]);

		// print each line of string in array using advanced for loop
//		for (String eachString : moviesArray) {
//			System.out.println(eachString);
//		}

		return moviesArray;

	}

	// method for selecting Random movie

	public static String selectRandomMovie(String[] moviesArray) {

		Random random = new Random();
		String selectedRandomMovie = moviesArray[random.nextInt(moviesArray.length)]; // selecting random movie

		return selectedRandomMovie;

	}

	// game logic /////

	public static void gameLogic(int noOfWrongCountsAllowed, String selectedRandomMovie) {

		StringBuilder tempVar = new StringBuilder(selectedRandomMovie);
		String movieNameWithUnderscore = "";

		for (int i = 0; i < selectedRandomMovie.length(); i++) { // replacing movie name with underscores

			movieNameWithUnderscore += "-";
		}

		StringBuilder sb = new StringBuilder(movieNameWithUnderscore);

		int wrongCount = 0;
		int iterationsMade = selectedRandomMovie.length();
		ArrayList<Character> wrongWordsUsed = new ArrayList<>();
		ArrayList<Character> LettersUsed = new ArrayList<>();
		Scanner scn = new Scanner(System.in);

		while (wrongCount < noOfWrongCountsAllowed && iterationsMade > 0) {

			boolean letterFound = false;
			boolean wrongLetterAlreadyUsed = false;
			boolean letterIsinMovie = false;
			boolean letterAlreadyUsed = false;

			System.out.println("\nYou are guessing: " + sb);
			System.out.println("You have guessed (" + wrongCount + ") wrong letters:" + wrongWordsUsed);
			System.out.print("Guess a letter: ");
			char letterGuessed = scn.nextLine().charAt(0);

			for (int i = 0; i < selectedRandomMovie.length(); i++) { // replacing underscores with guessed characters

				if (tempVar.charAt(i) == letterGuessed) {

					sb.setCharAt(i, letterGuessed);
					tempVar.setCharAt(i, '$');
					iterationsMade--;
					letterFound = true;

				}

			}

			for (int j = 0; j < selectedRandomMovie.length(); j++) {

				if (selectedRandomMovie.charAt(j) == letterGuessed) {
					letterIsinMovie = true;
				}
			}

			for (char c : LettersUsed) {

				if (c == letterGuessed) {

					letterAlreadyUsed = true;
				}

			}

			for (char c : LettersUsed) { // to advise user to guess another character already answered this one
											// correctly

				if (c == letterGuessed) {
					System.out.println(
							"You have already guessed '" + letterGuessed + "' correctly please try another chararcter");
				}
			}

			if (letterAlreadyUsed == false && letterIsinMovie == true) {

				LettersUsed.add(letterGuessed);

			}

			for (char c : wrongWordsUsed) { // to advise user to guess another character already answered this one
											// incorrectly

				if (c == letterGuessed) {
					wrongLetterAlreadyUsed = true;
					System.out.println("You have already guessed '" + letterGuessed
							+ "' incorrectly please try another chararcter");
				}
			}

			if (letterFound == false && wrongLetterAlreadyUsed == false && letterIsinMovie == false) {
				wrongCount++;
				wrongWordsUsed.add(letterGuessed);
			}

			if (iterationsMade == 0) {
				System.out.println("\nYou won you guessed '" + selectedRandomMovie + "' correctly :)");
			}

			if (wrongCount == noOfWrongCountsAllowed) {
				System.out.println("\nSorry you are out of guesses you have guessed (" + noOfWrongCountsAllowed
						+ ") wrong characters  :(");
			}

		}

		scn.close();

	}

}
