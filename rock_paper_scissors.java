import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors {

	public static int userChoice;						// User's play variable
	public static int cpuChoice = (int)(Math.random() * 3) + 1;		// Randomly generated cpu choice
	public static boolean error = false;					// sets up error checking variable

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("\n\nWelcome to rock paper scissors\n\nPlease choose rock(1), paper(2), or scissors(3):");
		userChoice = scan.nextInt();
		
		whoWon(userChoice, cpuChoice);

	} 

	public static void whoWon(int userChoice, int cpuChoice) {
		
		if (cpuChoice == 1){				// in retrospect, a switch statement
			System.out.print("I chose rock.");      // would have been much cleaner for 
		}						// the first two if statement blocks
		else if (cpuChoice == 2){
			System.out.print("I chose paper.");
		}
		else if (cpuChoice ==3){
			System.out.print("I chose scissors.");
		}
		else {
			error = true;
		}

		

		if (userChoice == 1) {
			System.out.print(" You chose rock.");
		}
		else if (userChoice == 2) {
			System.out.print(" You chose paper.");
		}

		else if (userChoice == 3) {
			System.out.print(" You chose scissors.");
		}
		else {
			error = true;
		}



		if (error == true) {
			System.out.print(" THERE WAS AN ERROR, PLEASE RESTART THE PROGRAM");
		}
		else if (userChoice == cpuChoice) {
			System.out.print(" It is a draw.");
		}
		else if (userChoice == 1 && cpuChoice == 3) {
			System.out.print(" You win!");
		}
		else if (userChoice == 2 && cpuChoice == 1) {
			System.out.print(" You win!");
		}
		else if (userChoice == 3 && cpuChoice == 2) {
			System.out.print(" You win!");
		}
		else {
			System.out.print(" You lose!");
		}
	}
}  

