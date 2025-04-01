/*
 * Author: Lucy Finnerty
 * This program compares the time taken to traverse a LinkedList using an Iterator and get(index).
 */
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); // a new LinkedList
        // populate the list with 5 million integers
        for(int i = 0; i < 5000000; i++) {
            list.add(i);
        }

        // traverse using an Iterator
        long startTime = System.nanoTime(); // get the current time
        Iterator<Integer> iterator = list.iterator(); // create an iterator
        while(iterator.hasNext()) { // while there are more elements
            iterator.next(); // move to the next element
        }
        long endTime = System.nanoTime(); // get the current time
        long iteratorTime = endTime - startTime; // calculate the time taken
        System.out.println("Time taken using Iterator: " + iteratorTime / 1000000 + " ms"); // display the time taken

        // traverse using get(index)
        startTime = System.nanoTime(); // get the current time
        for(int i = 0; i < list.size(); i++) { // for each element in the list
            list.get(i); // get the element at index i
        }
        endTime = System.nanoTime(); // get the current time
        long getTime = endTime - startTime; // calculate the time taken
        System.out.println("Time taken using get(index): " + getTime / 1000000 + " ms"); // display the time taken
    }
}