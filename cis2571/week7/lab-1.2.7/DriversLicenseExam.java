// Name: Lucy Finnerty
// Date: 10/4/24
// Purpose: When a user enters their answers for the exam, the program will determine if 
// they passed, amount of correct/incorrect questions, and the question numbers missed
import java.util.Scanner;
public class DriversLicenseExam {
    
    static char[] correctAnswers = {'B', 'D', 'A', 'A', 'C'}; // array that hold the answers to the exam
    static char[] studentAnswers = new char[5]; // empty array with 5 spaces for user's answers
    public static void main(String[] args) {
        // new scanner object to read user input
        Scanner input = new Scanner(System.in);
        char answer; // user answer
        // display opening statement, asking user for their answers
        System.out.println("Driver's License Exam Answer Sheet\nPlease enter your answers for the 5 multiple choice questions:");
        // loop through each index of studentAnswers array
        for(int i = 0; i < studentAnswers.length; i++) {
            // prompt user for their answer to the current question
            System.out.print("Answer for question " + (i + 1) + ": ");
            answer = input.next().toUpperCase().charAt(0); // read user's input, convert to upper case, store it in 'answer' variable

            // make sure user only enter A B C or D
            while(answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D'){
                // display statement if they enter invalid input
                System.out.print("Invalid input. Please enter A, B, C, or D: ");
                answer = input.next().toUpperCase().charAt(0); // read and store input in 'answer' variable
            }
            // store valid input into studentAnswers array at current index
            studentAnswers[i] = answer;
        }
        // call passed() method and pass studentAnswers array as parameter
        // if passed() return true...
        if(passed(studentAnswers)) {
            System.out.println("\nYou passed!"); // display message saying they passed
        } else { // else (passed() returned false) display another message telling them otherwise
            System.out.println("\nYou did not pass, good luck next time!");
        }
        // display amount of correct and incorrect answers
        System.out.println("Correct Answers: " + totalCorrect(studentAnswers));
        System.out.println("Incorrect Answers: " + totalIncorrect(studentAnswers));
        
        // set array to have the amount of questions missed by user by calling questionsMissed() with studentAnswers as parameter
        int[] missedQuestions = questionsMissed(studentAnswers);
        // if the student missed at least 1 or more questions...
            if (missedQuestions.length > 0) {
                System.out.print("Missed Questions: "); // display amount
                // loop throught missedQuestions array to display each missed question (1-5)
                for (int i = 0; i < missedQuestions.length; i++) {
                    System.out.print(missedQuestions[i] + " ");
                }
            } else { // else if the user missed 0, then display this statement
                System.out.println("You didn't miss any questions.");
            }
    }
    /* 
     * method that determines if the student passed by getting 3 out of 5 questions correct
     * 
     * parameter - array that hold student's answers
    */
    public static boolean passed(char[] answers) {
        // to count the amount of correct answers user inputted
        int correctCount = 0;
        // loop through each index of the correctAnswers
        for(int i = 0; i < correctAnswers.length; i++) {
            // compare student answer to correct answer at current index
            if(studentAnswers[i] == correctAnswers[i]) {
                correctCount++; // increment counter when if condition is true
            }
        }
        // will return true when satisfied, false if correctCount is < 3
        return correctCount >= 3;
    }
    /* 
     * method that returns number of correct answers by user
     * 
     * parameter - array that holds student's answers
    */
    public static int totalCorrect(char[] answers) {
        // to count the amount of correct answers user inputted
        int correct = 0;
        // loop through each index of the correctAnswers
        for(int i = 0; i < correctAnswers.length; i++) {
            // compare student answer to correct answer at current index
            if(studentAnswers[i] == correctAnswers[i])
            correct++; // increment counter when if condition is true
        }
        // return amount of correct answers
        return correct;
    }
    /* 
     * method that returns number of incorrect answers by user
     * 
     * parameter - array that holds student's answers
    */
    public static int totalIncorrect(char[] answers) {
        // to count the amount of incorrect answers user inputted
        int incorrect = 0;
        // loop through each index of the correctAnswers
        for(int i = 0; i < correctAnswers.length; i++) {
            // compare student answer to correct answer at current index
            if(studentAnswers[i] != correctAnswers[i])
            incorrect++; // increment counter when if condition is true
        }
        // return amount of incorrect answers
        return incorrect;
    }
    /* 
     * method that returns an array with the question numbers missed
     *
     * parameter - array that holds student's answers
    */
    public static int[] questionsMissed(char[] answers) {
        // a counter to track the number of missed questions
        int missedCount = 0;
        // loop through each index of the correctAnswers
        for(int i = 0; i < correctAnswers.length; i++) {
             // compare student answer to correct answer at current index
            if(studentAnswers[i] != correctAnswers[i])
                missedCount++; // increment counter when if condition is true
        }
        // an array to store the indexes of the missed questions with size missedCount
        int[] missed = new int[missedCount];
        // index variable for missed array
        int index = 0;
        // loop through each index of the correctAnswers
        for(int i = 0; i < correctAnswers.length; i++) {
            // compare student answer to correct answer at current index
            if(studentAnswers[i] != correctAnswers[i]) {
                // store the question number in the missed array
                missed[index] = i+1;
                index++; // increment index for next missed question
            }
        }
        // return array containing missed question numbers
        return missed;
    }
}