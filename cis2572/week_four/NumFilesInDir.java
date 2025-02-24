/*
 * Author: Lucy Finnerty
 * This program prompts the user to enter a directory and displays the number of the files in the directory.
 */
import java.io.File;
import java.util.Scanner;

public class NumFilesInDir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create scanner object for user input
        System.out.print("Enter a directory path: "); // prompt user to enter a directory path
        String directoryPath = input.nextLine(); // store user input in directoryPath
        input.close();

        File directory = new File(directoryPath); // create a file object with the directory path
        if (!directory.isDirectory() || !directory.exists()) { // check if the directory exists
            System.out.println("Directory does not exist."); // if it doesn't exist, print an error message
            return; // exit the program
        }
        long totalSize = 0; // a variable to store the total size of the files in the directory
        int fileCount = countFiles(directory); // a variable to store the number of files in the directory
        totalSize = countSize(directory); // set totalSize to the total size of the files in the directory using the countSize method
        System.out.println(fileCount + " files"); // print the number of files in the directory
        System.out.println("The total size of the files in the directory is " + totalSize + " bytes."); // print the total size of the files
    }
    /**
     * This method counts the number of files in a directory and its subdirectories.
     * @param directory the directory to count the files in
     * @return the number of files in the directory
     */
    public static int countFiles(File directory) {
        int count = 0;
        File[] files = directory.listFiles(); // get a list of files in the directory
        if(files != null) { // check if the directory is not empty
            for (File file : files) { // iterate through the files in the directory
                if (file.isFile()) { // check if the file is a File
                    count++; // increment the count
                } else if (file.isDirectory()) { // check if the file is a directory
                    count += countFiles(file); // recursively call the method to count the files in the subdirectory
                }
            }
        }
        return count; // return the count
    }
    /**
     * This method counts the total size of the files in a directory and its subdirectories.
     * @param directory the directory to count the files in
     * @return the total size of the files in the directory
     */
    public static long countSize(File directory) {
        long totalSize = 0;
        File[] files = directory.listFiles(); // get a list of files in the directory
        if(files != null) { // check if the directory is not empty
            for (File file : files) { // iterate through the files in the directory
                if (file.isFile()) { // check if the file is a File
                    totalSize += file.length(); // add the size of the file to the totalSize
                } else if (file.isDirectory()) { // check if the file is a directory
                    totalSize += countSize(file); // recursively call the method to count the size of the files in the subdirectory
                }
            }
        }
        return totalSize; // return the totalSize
    }
}