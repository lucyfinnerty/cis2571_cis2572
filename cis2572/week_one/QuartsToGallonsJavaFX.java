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
        Label promptLabel = new Label("How many quarts of paint do you need for the painting job?");
        TextField inputField = new TextField();
        Button calculateButton = new Button("Calculate");
        Label resultLabel = new Label();
        
        // set up layout
        VBox layout = new VBox(10, promptLabel, inputField, calculateButton, resultLabel);
        layout.setAlignment(Pos.CENTER);
        
        // handle button click
        calculateButton.setOnAction(event -> {
            try {
                int paintingJobQuarts = Integer.parseInt(inputField.getText());
                int gallons = paintingJobQuarts / NUMBER_OF_QUARTS;
                int quarts = paintingJobQuarts % NUMBER_OF_QUARTS;

                resultLabel.setText("A painting job that needs " + paintingJobQuarts + " quarts requires " +
                        gallons + " gallons and " + quarts + " quarts of paint.");
            } catch (NumberFormatException e) {
                resultLabel.setText("Error: Please enter a valid integer.");
            }
        });
        // create scene and stage
        Scene scene = new Scene(layout, 400, 200);
        primaryStage.setTitle("Quarts to Gallons Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}