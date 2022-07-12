package movieGuessingGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameClass {

	public static void main(String[] args) throws IOException {

		// Reading movies name into an array from file ////////////////////////

		List<String> listOfStrings = new ArrayList<String>();

		// load the data from file
		listOfStrings = Files.readAllLines(Paths.get("C:\\Users\\skpos\\Downloads\\movies.txt"));

		// convert arraylist to array
		String[] moviesArray = listOfStrings.toArray(new String[0]);

		// print each line of string in array using advanced for loop
//		for (String eachString : moviesArray) {
//			System.out.println(eachString);
//		}

		// Selecting one random movie and displaying it with ----------- ///////////////

		Random random = new Random();

		String selectedRandomMovie = moviesArray[random.nextInt(moviesArray.length)]; // selecting random movie
//		System.out.println("\nSelected random movie: " + selectedRandomMovie);

		String movieNameWithUnderscore = "";

		for (int i = 0; i < selectedRandomMovie.length(); i++) { // replacing movie name with underscores

			movieNameWithUnderscore += "-";
		}

//		System.out.println(movieNameWithUnderscore);
//		System.out.println(selectedRandomMovie);
		Scanner scn = new Scanner(System.in);

		// The Logic ////////////////////////////////////////////////////////////////

		StringBuilder sb = new StringBuilder(movieNameWithUnderscore);
		StringBuilder tempVar = new StringBuilder(selectedRandomMovie);

		int wrongCount = 0;
		int iterationsMade = selectedRandomMovie.length();
		ArrayList<Character> wrongWordsUsed = new ArrayList<>();
		ArrayList<Character> LettersUsed = new ArrayList<>();

		while (wrongCount < 10 && iterationsMade > 0) {

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

			if (wrongCount == 10) {
				System.out.println("\nSorry you are out of guesses you have guessed (10) wrong characters  :(");
			}

		}

		scn.close();

	}

}
