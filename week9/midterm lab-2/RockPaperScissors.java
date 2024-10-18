import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice ="";
        String userChoice="";
        int userWins=0;
        int computerWins=0;

        // get number of games to play
        int numOfGames = 0;
        while (numOfGames < 1) {
            System.out.print("Please enter a number greater than or equal to 1: ");
            numOfGames = input.nextInt();
            input.nextLine();
        }
        // Arrays to store choices and winners
        String[] userChoices = new String[numOfGames];
        String[] computerChoices = new String[numOfGames];
        String[] winners = new String[numOfGames];

        // loop through the number of games - beginning of for loop
        for (int round = 0; round < numOfGames;) {
            System.out.println("\nGame " + (round +1));
            System.out.println("========================");

            boolean validInput = false;
            // prompt the user and validate the input
            while (!validInput) { // while true
                System.out.print("Please enter rock, paper, or scissors: ");
                userChoice = input.nextLine().toLowerCase(); // convert to lowercase for comparison to choices array
                for (int i = 0; i < choices.length; i++) {
                    if (userChoice.equals(choices[i])) {
                        validInput = true;
                        break;
                    }
                }
            }
            computerChoice = choices[random.nextInt(3)];
            // store choices for summary
            userChoices[round] = userChoice;
            computerChoices[round] = computerChoice;
            // display computer and user choices
            System.out.println("The computer's choice was " + computerChoice + ".");
            System.out.println("The user's choice was " + userChoice + ".");

            // check for a tie
            if (userChoice.equals(computerChoice)) {
                System.out.println("\nThe game is tied!\nGet ready to play again...");
                //winner = "Tie";
                //round--; // replay the same game
                continue;
            }
            // user wins
            if((userChoice.equals("rock") && computerChoice.equals("scissors"))){
                System.out.println("\nRock smashes scissors.\nThe user wins!");
                userWins++;
                winners[round] = "User";
            } else if((userChoice.equals("paper") && computerChoice.equals("rock"))){
                System.out.println("\nPaper wraps rock.\nThe user wins!");
                userWins++;
                winners[round] = "User";
            } else if((userChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("\nScissors cut paper.\nThe user wins!");
                userWins++;
                winners[round] = "User";
            } // computer wins
            else if((userChoice.equals("scissors") && computerChoice.equals("rock"))){
                System.out.println("\nRock smashes scissors.\nThe computer wins!");
                computerWins++;
                winners[round] = "Computer";
            } else if((userChoice.equals("rock") && computerChoice.equals("paper"))){
                System.out.println("\nPaper wraps rock.\nThe computer wins!");
                computerWins++;
                winners[round] = "Computer";
            } else if((userChoice.equals("paper") && computerChoice.equals("scissors"))){
                System.out.println("\nScissors cut paper.\nThe computer wins!");
                computerWins++;
                winners[round] = "Computer";
            }
            round++;
        } // end of for loop
        // display summary
        System.out.println("\nSummary\n========================");
        for(int round = 0; round < numOfGames; round++) {
            System.out.println("Game " + (round + 1) + ": User: " + userChoices[round] + "  Computer: " + computerChoices[round] + "  Winner: " + winners[round] + "\n");
        }
        System.out.println("Result\n========================");
        if(userWins > computerWins){
            System.out.println("User wins! User won " + userWins + " out of " + numOfGames + " games.");
        } else if(userWins < computerWins) {
            System.out.println("Computer wins! Computer won " + computerWins + " out of " + numOfGames + " games.");
        } else {
            System.out.println("It is a draw. Both user and computer have won " + userWins + " out of " + numOfGames + " games.");
        }
    }
}