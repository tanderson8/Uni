/*
Author: Ta'im Anderson
January 2017
*/

import java.util.Scanner; 

public class GuessingGameV2 {

 public static void main(String[] args) {

	 // Initializing variables.
	int x = 100, y = -100, randomNumber, counter = 0;
	char userRetry = 'y';
	boolean isCorrect = true, tryAgain = (userRetry == 'y');
	
	// Outer do loop which restarts the game if the user inputs "y" indicating that they want to play again.
	do { 		
		
		 // Random number generator from -100 to 100.
		 randomNumber = (int)(Math.random() * (y - x +1)+ x);
  
		 System.out.println("Guess a number between -100 and 100");
		 
		 // User input for the user to guess a number.
		 Scanner readNumber = new Scanner (System.in);
		 int userNumber = readNumber.nextInt();
		
		// Second do loop which loops the game if the user guesses the wrong number.
		 do {
			 
			 // If/Else statement giving instructions on what to do whether the user guesses the correct number or not.
			 if(userNumber == randomNumber) {
				 System.out.println("You chose " + userNumber + ". Your guess was correct! Would you like to play again (y/n)?");
				 counter ++;
				 isCorrect = true; 
				 
				 // User input for user to answer if they want to play again or not.
				 Scanner restart = new Scanner (System.in);
				 userRetry = restart.next().charAt(0); 
				 
				 // If/Else statement giving instructions on what to do whether the user chooses to play again.
				 if(userRetry == 'y') {
					 tryAgain = true;
				
				 }
				 else if(userRetry == 'n') {
					 tryAgain = false;
					 System.out.println("Thank you for playing! Goodbye.");

				 }
				 
		   	}
			 
			 else if(userNumber < randomNumber) {
				 System.out.println("You chose " + userNumber + ". it was too low, try again.");
				 
				 isCorrect = false;
				 counter ++;
				 userNumber = readNumber.nextInt();
				 
		   	}
			 else if(userNumber > randomNumber) {
				 System.out.println("You chose " + userNumber + ". it was too high, try again.");
				 
				 isCorrect = false;
				 counter ++;
				 userNumber = readNumber.nextInt();
		 }
			 
			 
		 }while (!(isCorrect));
		 
	System.out.println("You tried the game " + counter + " times.");
		 
	}while ((tryAgain == true));
	
	
 }
 }



