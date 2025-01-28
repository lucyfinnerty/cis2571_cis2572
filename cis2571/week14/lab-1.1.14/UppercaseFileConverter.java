// Name: Lucy Finnerty
// Date: 11/18/24
// Purpose: Convert a file's content to uppercase and save it to another file of the user's choice.
import java.io.*;
import java.util.Scanner;
public class UppercaseFileConverter {
    public static void main(String[] args) throws IOException {
        String inputFileName; // name of input file to be read
        String outputFileName; // name of output file with input file content converted to uppercase
        File inputFile; // File object for the input file
        File outputFile; // File object for the output file

        Scanner input = new Scanner(System.in); // new scanner object for user input

        // loop until a valid, non-empty file is provided
        while (true) {
            System.out.print("Please enter a file you would like to convert to uppercase: "); // prompt user for valid file name to be read
            inputFileName = input.nextLine(); // set file name to user's input
            inputFile = new File(inputFileName); // set File object to user's file name they input

            // check if the file is empty
            if (inputFile.length() == 0) {
                System.out.println("The file is empty, please try again."); // ask user to try again
            } else {
                break; // file is not empty
            }
        }
        // prompt for the output file name
        System.out.print("Please enter a file where you would like to save the uppercase content: ");
        outputFileName = input.nextLine(); // set file name to user's input
        outputFile = new File(outputFileName); // set File object to user's file name they input

        // initialize Scanner to read the input file and PrintWriter to write to the output file
        Scanner inputFileScanner = new Scanner(inputFile);
        PrintWriter outputFileWriter = new PrintWriter(outputFile);

        // read each line from the input file, convert it to uppercase, and write it to the output file
        while (inputFileScanner.hasNextLine()) {
            String content = inputFileScanner.nextLine().toUpperCase(); // convert current line to uppercase
            outputFileWriter.println(content); // Wwite the uppercase content to the output file
        }
        // close scanner and writer
        inputFileScanner.close();
        outputFileWriter.close();
        // Notify the user that the file has been successfully converted and saved
        System.out.println("File has been successfully converted to uppercase and saved to " + outputFileName);
    }
}