// Name: Lucy Finnerty
// Date: 11/18/24
// Purpose: Convert a file's content to uppercase and save it to another file of the user's choice.
import java.io.*;
import java.util.Scanner;
public class UppercaseFileConverter {
    
    public static void main(String[] args) throws IOException {
        String inputFileName;
        String outputFileName;
        File inputFile;

        Scanner input = new Scanner(System.in);

        // loop until a valid, non-empty file is provided
        while (true) {
            System.out.print("Please enter a file you would like to convert to uppercase: ");
            inputFileName = input.nextLine();
            inputFile = new File(inputFileName);

            // validate the file
            if (inputFile.length() == 0) {
                System.out.println("The file is empty, please try again.");
            } else {
                break; // file is not empty
            }
        }

        // prompt for the output file name
        System.out.print("Please enter a file where you would like to save the uppercase content: ");
        outputFileName = input.nextLine();
        File outputFile = new File(outputFileName);

        // process the input file and save content to the output file
        Scanner inputFileScanner = new Scanner(inputFile);
        PrintWriter outputFileWriter = new PrintWriter(outputFile);

        while (inputFileScanner.hasNextLine()) {
            String content = inputFileScanner.nextLine().toUpperCase();
            outputFileWriter.println(content);
        }

        // close scanner and writer
        inputFileScanner.close();
        outputFileWriter.close();

        System.out.println("File has been successfully converted to uppercase and saved to " + outputFileName);
    }
}