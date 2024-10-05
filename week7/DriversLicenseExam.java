package week7;
import java.util.Scanner;
public class DriversLicenseExam {

    static char[] correctAnswers = {'B', 'D', 'A', 'A', 'C'};
    static char[] studentAnswers = new char[5];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Driver's License Exam Answer Sheet\nPlease enter your answers for the 5 multiple choice questions:");
        char answer;
        for(int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Answer for question " + (i + 1) + ": ");
            answer = input.next().charAt(0);

            while(answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D'){
                System.out.print("Invalid input. Please enter A, B, C, or D: ");
                answer = input.next().toUpperCase().charAt(0);
            }
            studentAnswers[i] = answer;
        }
        if(passed(studentAnswers)) {
            System.out.println("\nYou passed!");
        } else { 
            System.out.println("\nYou did not pass, good luck next time!");
        }
        System.out.println("Correct Answers: " + totalCorrect(studentAnswers));
        System.out.println("Incorrect Answers: " + totalIncorrect(studentAnswers));
        
        int[] missedQuestions = questionsMissed(studentAnswers);
            if (missedQuestions.length > 0) {
                System.out.print("Missed Questions: ");
                for (int i = 0; i < missedQuestions.length; i++) {
                    System.out.print(missedQuestions[i] + " ");
                }
            } else {
                System.out.println("You didn't miss any questions.");
            }
    }
    /* */
    public static boolean passed(char[] answers) {
        int correctCount = 0;
        for(int i = 0; i < correctAnswers.length; i++) {
            if(studentAnswers[i] == correctAnswers[i]) {
                correctCount++;
            }
        }
        return correctCount >= 3;
    }
    /* */
    public static int totalCorrect(char[] answers) {
        int correct = 0;
        for(int i = 0; i < correctAnswers.length; i++) {
            if(studentAnswers[i] == correctAnswers[i])
            correct++;
        }
        return correct;
    }
    /* */
    public static int totalIncorrect(char[] answers) {
        int incorrect = 0;
        for(int i = 0; i < correctAnswers.length; i++) {
            if(studentAnswers[i] != correctAnswers[i])
            incorrect++;
        }
        return incorrect;
    }
    /* */
    public static int[] questionsMissed(char[] answers) {
        int missedCount = 0;
        for(int i = 0; i < correctAnswers.length; i++) {
            if(studentAnswers[i] != correctAnswers[i])
                missedCount++;
        }
        int[] missed = new int[missedCount];
        int index = 0;
        for(int i = 0; i < correctAnswers.length; i++) {
            if(studentAnswers[i] != correctAnswers[i]) {
                missed[index] = i+1;
                index++;
            }
        }
        return missed;
    }
}