/*
 * Author: Lucy Finnerty
 * This program reads an ASCII text file and counts the frequency of the characters in the file.
 */
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.*;

public class CharFreqCounter extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Enter name of ASCII text file:"); // prompt label
        TextField textField = new TextField(); // text field for file name
        Button button = new Button("Submit"); // button to submit file name
        TextArea resultArea = new TextArea(); // text area to display results
        resultArea.setEditable(false); // make text area read-only
        
        button.setOnAction(e -> { // event handler for button click
            String fileName = textField.getText(); // get file name from text field
            int[] counts = new int[26]; // array to store character counts
            String result = ""; // string to store result
            
            // try to open and read the file using BufferedReader
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { 
                int ch; // variable to store character
                while ((ch = reader.read()) != -1) {  // read character one by one until end of file
                    char character = Character.toUpperCase((char) ch); // convert character to uppercase
                    if (character >= 'A' && character <= 'Z') { // check if character is a letter
                        counts[character - 'A']++; // increment count for character
                    }
                }
                for (int i = 0; i < counts.length; i++) { // loop through counts array
                    result += (char) (i + 'A') + ": " + counts[i] + "\n"; // add character and count to result string
                }
            } catch (FileNotFoundException exception) { // catch file not found exception
                result = "File not found."; // set result to error message
            } catch (IOException exception) { // catch IO exception
                result = "Error reading file."; // set result to error message
            }
            resultArea.setText(result); // display result in text area
        });
        VBox vbox = new VBox(10, label, textField, button, resultArea); // create VBox layout
        Scene scene = new Scene(vbox, 400, 300); // create scene with VBox layout
        primaryStage.setTitle("Character Frequency Counter"); // set title of primary stage
        primaryStage.setScene(scene); // set scene of primary stage
        primaryStage.show(); // display primary stage
    }
    public static void main(String[] args) {
        launch(args); // launch javafx application
    }
}