/*
 * Author: Lucy Finnerty
 * This program calculates the number of gallons and quarts of paint needed for a painting job and uses JavaFX.
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class QuartsToGallonsJavaFX extends Application {

    private static final int NUMBER_OF_QUARTS = 4;
    
    @Override
    public void start(Stage primaryStage) {
        Label promptLabel = new Label("How many quarts of paint do you need for the painting job?"); // label to prompt user for input
        TextField inputField = new TextField(); // text field to store user input
        Button calculateButton = new Button("Calculate"); // button to calculate gallons and quarts
        Label resultLabel = new Label(); // label to display results
        
        // set up layout
        VBox layout = new VBox(10, promptLabel, inputField, calculateButton, resultLabel);
        layout.setAlignment(Pos.CENTER); // center all elements
        
        // handle button click event
        calculateButton.setOnAction(event -> {
            try {
                int paintingJobQuarts = Integer.parseInt(inputField.getText()); // parse user input from text field as an integer
                int gallons = paintingJobQuarts / NUMBER_OF_QUARTS; // calculate number of gallons and remaining quarts needed
                int quarts = paintingJobQuarts % NUMBER_OF_QUARTS;

                // display results in the label
                resultLabel.setText("A painting job that needs " + paintingJobQuarts + " quarts requires " +
                        gallons + " gallons and " + quarts + " quarts of paint.");
            } catch (NumberFormatException e) { // handle non-integer input
                resultLabel.setText("Error: Invalid input. Please try again!");
            }
        });
        // create scene and stage
        Scene scene = new Scene(layout, 400, 200);
        primaryStage.setTitle("Quarts to Gallons Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args); // launch JavaFX application
    }
}