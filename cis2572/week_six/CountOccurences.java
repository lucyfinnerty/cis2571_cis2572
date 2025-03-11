/*
 * Author: Lucy Finnerty
 * This program reads a sequence of numbers from the user and counts/displays the number of occurrences of each number.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Map<Integer, Integer> frequencyMap = new HashMap<>(); // key: number, value: frequency
        Set<Integer> mostFreqNums = new HashSet<>(); // store the most frequent number(s)
        Scanner scanner = new Scanner(System.in); // read user input

        int maxCount = 0; // store the max frequency
        int num; // store the number read from the user

        System.out.println("Enter numbers (0 to stop): "); // prompt user for input
         while(true) { // loop until user enters 0
            num = scanner.nextInt(); // read the number
            if(num == 0) { break;} // exit loop if user enters 0

            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); // update the frequency of the number
            int count = frequencyMap.get(num); // get the frequency of the number

            if(count > maxCount) { // update the most frequent number(s)
                maxCount = count; // update the max frequency
                mostFreqNums.clear(); // clear the set
                mostFreqNums.add(num); // add the number to the set
            } else if(count == maxCount) { // add the number to the set if tied for the most frequent
                mostFreqNums.add(num); // add the number to the set
            }
         }
         scanner.close();
         System.out.println("The most frequent number(s): " + mostFreqNums); // display the most frequent number(s)
    }
}