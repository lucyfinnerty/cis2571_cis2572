// Name: Lucy Finnerty
// Date: 10/17/24
// Purpose: Program that lets the user play the game of Rock, Paper, Scissors against the computer.
// User or computer win the following scenarios: rock smashes scissors, scissors cut paper, paper wraps rock.
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // new scanner object to read user input
        Random random = new Random(); // new random object to generate random int 1-3
        String[] choices = {"rock", "paper", "scissors"}; // array with all 3 choices
        String computerChoice =""; // the computer's choice of rock, paper, or scissors
        String userChoice=""; // the user's choice of rock, paper, or scissors
        int userWins=0; // amount of times user wins
        int computerWins=0; // amount of times computer wins

        // get number of games user wants to play
        int numOfGames = 0; // holds the number of games
        while (numOfGames < 1) { // while numOfGames is less than 1, ask user how many games they want to play
            System.out.print("Please enter a number greater than or equal to 1: ");
            numOfGames = input.nextInt(); // must be 1 or greater
            input.nextLine();
        }
        // arrays to store choices and winners
        String[] userChoices = new String[numOfGames];
        String[] computerChoices = new String[numOfGames];
        String[] winners = new String[numOfGames];

        // loop through the number of games (for loop begins)
        for (int round = 0; round < numOfGames;) {
            // display game number (round)
            System.out.println("\nGame " + (round + 1));
            System.out.println("========================");

            // input validation
            boolean validInput = false; // user input defaulted to false (invalid)
            while (!validInput) { // while true
                // prompt user to enter one of the three choices
                System.out.print("Please enter rock, paper, or scissors: ");
                userChoice = input.nextLine().toLowerCase(); // set input to userChoice and convert to lowercase for comparison to choices array
                // iterate through each element of choices array
                for (int i = 0; i < choices.length; i++) {
                    if (userChoice.equals(choices[i])) { // compare user's choice to element at current index
                        validInput = true; // set to true when user's choice equates to an element
                        break; // while loop breaks
                    }
                }
            }
            // computer's choice is randomly generated 1-rock 2-paper 3-scissors
            computerChoice = choices[random.nextInt(3)];
            // store choices for summary
            userChoices[round] = userChoice;
            computerChoices[round] = computerChoice;
            // display computer and user choices
            System.out.println("The computer's choice was " + computerChoice + ".");
            System.out.println("The user's choice was " + userChoice + ".");

            // check for a tie - user's choice is the same as the computer's
            if (userChoice.equals(computerChoice)) {
                // display to user that it was a tie and they will play again
                System.out.println("\nThe game is tied!\nGet ready to play again...");
                continue;
            }
            //----------user wins scenarios----------//
                // user: rock and computer: scissors
            if((userChoice.equals("rock") && computerChoice.equals("scissors"))){
                System.out.println("\nRock smashes scissors.\nThe user wins!"); // display results
                userWins++; // increment to document a win
                winners[round] = "User"; // set user as winner for this game (round)
                //user: paper and computer: rock
            } else if((userChoice.equals("paper") && computerChoice.equals("rock"))){
                System.out.println("\nPaper wraps rock.\nThe user wins!"); // display results
                userWins++; // increment to document a win
                winners[round] = "User"; // set user as winner for this game (round)
                // user: scissors and computer: paper
            } else if((userChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("\nScissors cut paper.\nThe user wins!"); // display results
                userWins++; // increment to document a win
                winners[round] = "User"; // set user as winner for this game (round)
            } 
            //----------computer wins scenarios----------//
                // user: scissors and computer: rock
            else if((userChoice.equals("scissors") && computerChoice.equals("rock"))){
                System.out.println("\nRock smashes scissors.\nThe computer wins!"); // display results
                computerWins++; // increment to document a win
                winners[round] = "Computer"; // set computer as winner for this game (round)
                // user: rock and computer: paper
            } else if((userChoice.equals("rock") && computerChoice.equals("paper"))){
                System.out.println("\nPaper wraps rock.\nThe computer wins!"); // display results
                computerWins++; // increment to document a win
                winners[round] = "Computer"; // set computer as winner for this game (round)
                // user: paper and computer: scissors
            } else if((userChoice.equals("paper") && computerChoice.equals("scissors"))){
                System.out.println("\nScissors cut paper.\nThe computer wins!"); // display results
                computerWins++; // increment to document a win
                winners[round] = "Computer"; // set computer as winner for this game (round)
            }
            round++; // increment round to go to the next game
        } // end of for loop

        // display summary
        System.out.println("\nSummary\n========================");
        for(int round = 0; round < numOfGames; round++) { // iterate to and print each game (round)
            // print the game number, user's choice, computer's choice, and the winner for each round
            System.out.println("Game " + (round + 1) + ": User: " + userChoices[round] + "  Computer: " + computerChoices[round] + "  Winner: " + winners[round] + "\n");
        }
        // display result
        System.out.println("Result\n========================");
        if(userWins > computerWins){ // when user has more wins, display final results
            System.out.println("User wins! User won " + userWins + " out of " + numOfGames + " games.");
        } else if(userWins < computerWins) { // when computer has more wins, display final results
            System.out.println("Computer wins! Computer won " + computerWins + " out of " + numOfGames + " games.");
        } else { // display tied results
            System.out.println("It is a draw. Both user and computer have won " + userWins + " out of " + numOfGames + " games.");
        }
    }
}