/*
 * Author: Lucy Finnerty
 * This program reads a sequence of numbers from the user and counts/displays the number of occurrences of each number.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NumberListGUI extends Application{
    private LinkedHashSet<Integer> numberSet = new LinkedHashSet<>();
    private TextArea displayArea;
    private TextField inputField;

    @Override
    public void start(Stage primaryStage) {
        // GUI components
        inputField = new TextField();
        inputField.setPromptText("Enter a number");
        Button addButton = new Button("Add");
        Button sortButton = new Button("Sort");
        Button shuffleButton = new Button("Shuffle");
        Button reverseButton = new Button("Reverse");
        displayArea = new TextArea();
        displayArea.setEditable(false);

        // layout
        VBox root = new VBox(10, inputField, addButton, displayArea, sortButton, shuffleButton, reverseButton); // vertical layout
        root.setStyle("-fx-padding: 10;"); // padding

        // event handling
        addButton.setOnAction(e -> addNumber()); // to add number to the list
        sortButton.setOnAction(e -> sortList()); // to sort the list
        shuffleButton.setOnAction(e -> shuffleList()); // to shuffle the list
        reverseButton.setOnAction(e -> reverseList()); // to reverse the list

        Scene scene = new Scene(root, 300, 400); // create scene
        primaryStage.setTitle("Number List App"); // set title
        primaryStage.setScene(scene); // set scene
        primaryStage.show(); // display the stage
    }
    /**
     * method that adds a number to the list
     */
    private void addNumber() {
        try { // try to parse the input
            int num = Integer.parseInt(inputField.getText().trim());
            if (numberSet.add(num)) { // add the number to the list
                displayNumbers(); // display the numbers
            }
            inputField.clear();
        } catch (NumberFormatException e) {
            inputField.clear(); 
        }
    }
    /**
     * method that displays the numbers in the list
     */
    private void displayNumbers() {
        String result = ""; // store the numbers
        for (int num : numberSet) { // iterate through the list
            result += num + " "; // add the number to the result
        }
        displayArea.setText(result.trim()); // display the numbers
    }
    /**
     * method that sorts the list
     */
    private void sortList() {
        List<Integer> sortedList = new ArrayList<>(numberSet); // copy the set to a list
        Collections.sort(sortedList); // sort the list
        numberSet.clear(); // clear the set
        numberSet.addAll(sortedList); // add the sorted list to the set
        displayNumbers(); // display the numbers
    }
    /**
     * method that shuffles the list
     */
    private void shuffleList() {
        List<Integer> shuffledList = new ArrayList<>(numberSet); // copy the set to a list
        Collections.shuffle(shuffledList); // shuffle the list
        numberSet.clear(); // clear the set
        numberSet.addAll(shuffledList); // add the shuffled list to the set
        displayNumbers(); // display the numbers
    }
    /**
     * method that reverses the list
     */
    private void reverseList() {
        List<Integer> reversedList = new ArrayList<>(numberSet); // copy the set to a list
        Collections.sort(reversedList); // sort the list
        Collections.reverse(reversedList); // reverse the list
        numberSet.clear(); // clear the set
        numberSet.addAll(reversedList); // add the reversed list to the set
        displayNumbers(); // display the numbers
    }    public static void main(String[] args) {
        launch(args); // launch the application
    }
}