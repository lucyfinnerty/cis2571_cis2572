/*
 * Author: Lucy Finnerty
 * This program computes the hash code for a given string using a custom hash function.
 */

import java.util.Scanner;
public class HashCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner object to read user input
        int cont; // variable to control the loop

        do {
            System.out.println("Hashcode For Strings"); // print title
            System.out.print("Enter string to get hashcode: "); // prompt user for input
            String str = input.nextLine().trim(); // read user input and trim whitespace
            int hash = hashCodeForString(str); // compute hash code using custom method
            System.out.println(hash); // print the hash code
            System.out.print("Continue(0/1)? "); // prompt user to continue or exit
            cont = input.nextInt(); // read user input for continuation
            input.nextLine(); // consume the newline character left by nextInt()
        } while (cont == 1); // continue if user enters 1
        input.close(); // close the scanner object
    }
    /**
     * This method computes the hash code for a given string.
     *
     * @param s the string to compute the hash code for
     * @return the computed hash code
     */
    public static int hashCodeForString(String s) {
        int hash = 0; // initialize hash to 0
        for(int i = 0; i < s.length(); i++) { // iterate through each character in the string
            hash = 31 * hash + s.charAt(i); // compute hash using the formula hash = 31 * hash + character value
        }
        return hash; // return the hash code
    }
}