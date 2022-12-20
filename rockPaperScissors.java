// ---------- INSTRUCTIONS ---------- //
/* Write a program that allows the user to play rock, paper, scissors.
 * ● The program should randomly generate a number (0, 1 or 2), which
 * represents scissors, rock and paper, respectively. (Hint: look up Math.random)
 * ● The program should then prompt the user to enter a number (0, 1 or 2).
 * ● Once the user has entered their number, the program should inform
 * them whether they win, lose or draw.
 * ● The rules of the game are as follows:
 * ○ Scissors beats paper ○ Rock beats scissors ○ Paper beats rock */

// ---------- TASK ---------- //

// Import modules
import java.util.Random;
import java.util.Scanner;

// Main class for game.
public class rockPaperScissors {
    
	// Main function to start game.
	public static void main (String[] args ) {
	
		// Open scanner and initialize random module.
		Random computerInput = new Random();
	    Scanner playerInput = new Scanner(System.in); 
	    
	    // Call function to play game.
	    System.out.println("Let's Play Rock, Paper, Scissors!\n");
		playGame (playerInput, computerInput ); 
		
	}	
		
	// Function to get player and computer choice.
	public static String playGame (Scanner playerInput, Random computerInput) {
	
		// Get the players choice. 
		String playerChoice;
		System.out.println("Your move! Enter rock, paper or scissors: "); 
		playerChoice = playerInput.nextLine();
    	
		//Generate a random number for the computers choice.
		String computerChoice = "";
		int randomNumber = computerInput.nextInt(3);
		
        if (randomNumber == 0) {
        	computerChoice = "rock"; 
        } 
        else if (randomNumber == 1) {
        	computerChoice = "paper";
        } 
        else if (randomNumber == 2) {
        	computerChoice = "scissors"; 
        }
		
        //Display the game choices.
        System.out.println("\nPlayer chose " + playerChoice + "!");
        System.out.println("Computer chose " + computerChoice + "!");

		// Variables to output for 'gameWinner'.
		String gameWinner = "";
		String rock = "Rock crushes Scissors.";
		String paper = "Paper wraps Rock.";
		String scissors = "Scissors cuts Paper.";
			
		// Conditional statements for the game logic.
		// If both choices are the same:
		if (playerChoice.equals(computerChoice)) {
			gameWinner = "\nNo winner! It's a draw."; 
		} 
		// If the winning option is PAPER
		else if (playerChoice.equals("rock") && computerChoice.equals("paper")) {
			gameWinner = "\nComputer wins! " + paper; 
		} 
		else if ( playerChoice.equals("paper") && computerChoice.equals("rock")) {
			gameWinner = "\nPlayer wins! " + paper; 
		}
		// If the winning option is ROCK
		else if ( playerChoice.equals("scissors") && computerChoice.equals("rock")) {
			gameWinner = "\nComputer wins! " + rock; 
		} 
		else if ( playerChoice.equals("rock") && computerChoice.equals("scissors")) {
			gameWinner = "\nPlayer wins! " + rock; 
		}
		// If the winning option is SCISSORS
		else if ( playerChoice.equals("paper") && computerChoice.equals("scissors")) {
			gameWinner = "\nComputer wins! " + scissors; 
		} 
		else if ( playerChoice.equals("scissors") && computerChoice.equals("paper")) {
			gameWinner = "\nPlayer wins! " + scissors; 
		}
		
		System.out.println (gameWinner) ;
		return gameWinner;
	} 

} 
		