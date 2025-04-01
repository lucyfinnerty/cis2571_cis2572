/* Author: Lucy Finnerty
 * This program finds the maximum element in a 2D array of any type by using a generic method.
 */
public class MaxElement {
    public static <E extends Comparable<E>> E max(E[][] list) {
        if(list == null || list.length == 0 || list[0].length == 0) { // check if the list is null or empty
            return null; // return null if true
        }
        E max = list[0][0]; // set the first element as the max
        for (E[] elements : list) { // loop through the list
            for (E element : elements) { // loop through the elements
                if (element.compareTo(max) > 0) { // compare the element to the max
                    max = element; // set the element as the max if it is greater
                }
            }
        }
        return max; // return the max
    }
    public static void main(String[] args) {
        Integer[][] list = { // 2D array of integers
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("The max element is " + max(list)); // print the max element

        Double[][] list2 = { // 2D array of doubles
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6},
            {7.7, 8.8, 9.9}
        };
        System.out.println("The max element is " + max(list2)); // print the max element

        String[][] list3 = { // 2D array of strings
            {"red", "blue", "green"},
            {"yellow", "purple", "orange"},
            {"black", "white", "gray"}
        };
        System.out.println("The max element is " + max(list3)); // print the max element
    }
}