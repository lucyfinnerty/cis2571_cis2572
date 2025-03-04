/*
 * Author: Lucy Finnerty
 * This program creates two priority queues and adds elements to them. 
 * It then displays the union, difference, and intersection of the two queues.
 */
import java.util.PriorityQueue;
public class PriorityQueues {
    public static void main(String[] args) {
        // create a two priority queues
        PriorityQueue<String> queue = new PriorityQueue<>();
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        // add elements to the queue
        queue.offer("George");
        queue.offer("Jim");
        queue.offer("John");
        queue.offer("Blake");
        queue.offer("Kevin");
        queue.offer("Michael");
        // add elements to the queue2
        queue2.offer("George");
        queue2.offer("Katie");
        queue2.offer("Kevin");
        queue2.offer("Michelle");
        queue2.offer("Ryan");
        // display the union, difference, and intersection of the two queues
        System.out.println("Union: " + union(queue, queue2));
        System.out.println("Difference: " + difference(queue, queue2));
        System.out.println("Intersection: " + intersection(queue, queue2));
    }
    /**
     * returns the union of two priority queues
     * @param queue
     * @param queue2
     * @return union
     */
    public static PriorityQueue<String> union(PriorityQueue<String> queue, PriorityQueue<String> queue2) {
        PriorityQueue<String> union = new PriorityQueue<>(queue); // create a new queue with the elements of queue
        union.addAll(queue2); // add all elements of queue2 to the new queue
        return union; // return the new queue
    }
    /**
     * returns the difference of two priority queues
     * @param queue
     * @param queue2
     * @return difference
     */
    public static PriorityQueue<String> difference(PriorityQueue<String> queue, PriorityQueue<String> queue2) {
        PriorityQueue<String> difference = new PriorityQueue<>(queue); // create a new queue with the elements of queue
        difference.removeAll(queue2); // remove all elements of queue2 from the new queue
        return difference; // return the new queue
    }
    /**
     * returns the intersection of two priority queues
     * @param queue
     * @param queue2
     * @return intersection
     */
    public static PriorityQueue<String> intersection(PriorityQueue<String> queue, PriorityQueue<String> queue2) {
        PriorityQueue<String> intersection = new PriorityQueue<>(queue); // create a new queue with the elements of queue
        intersection.retainAll(queue2); // retain only the elements that are in both queues
        return intersection; // return the new queue
    }
}