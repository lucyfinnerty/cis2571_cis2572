// Name: Lucy Finnerty
// Date: 11/11/24
// Purpose: This program displays a GUI and calculates assessment value and property tax given the actual value of property.
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class PropertyTax extends Application{
    // constants for calculations
    final double ASSESSMENT_PERCENTAGE = 0.60; // 60% of actual value
    final double TAX_RATE = 0.64; // $0.64 per $100 of assessment value
    final double PER_100 = 100.0; // used to convert assessment value to a per-100 value for tax calculation

    // variables used in event handler
    private TextField actualValueField; // text field for user to input actual prop. value
    private Label assessmentValueLabel; // label to display calculaed assessment value
    private Label propertyTaxLabel; // label to display calculated property tax

    public static void main(String[] args) {
        launch(args); // launches start method
    }
    /**
     * This method starts the application by creating a VBox layout with a text field for the
     * user to enter actual value of their property. As well as a calculate button that is set
     * to an event handler to calculate assessment value and proptery tax. The calulated numbers
     * are then set to their respective labels.
     * 
     * @param primaryStage
     */
    public void start(Stage primaryStage) {
        // layout setup
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        // label that tells user to enter actual value of property
        Label instructionLabel = new Label("Enter the actual value of the property:");
        // new text field with a prompt
        actualValueField = new TextField();
        actualValueField.setPromptText("Actual value in dollars");

        // labels to display results
        assessmentValueLabel = new Label("Assessment Value: ");
        propertyTaxLabel = new Label("Property Tax: ");

        // calculate Button
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(new CalcButtonHandler()); // set event hadler for calc button to compute assessment value and property tax

        // add components to layout
        layout.getChildren().addAll(instructionLabel, actualValueField, calculateButton, assessmentValueLabel, propertyTaxLabel);

        Scene scene = new Scene(layout, 300, 250); // create new scene
        primaryStage.setTitle("Property Tax Calculator"); // give gui window a name
        primaryStage.setScene(scene); // set scene on stage
        primaryStage.show(); // display
    }
    /**
     * Event handler for calculateButton
     */
    class CalcButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            // get actual value from input and parse it
            double actualValue = Double.parseDouble(actualValueField.getText());

            // calculate assessment value and property tax
            double assessmentValue = actualValue * ASSESSMENT_PERCENTAGE;
            double propertyTax = (assessmentValue / PER_100) * TAX_RATE;

            // display the results
            assessmentValueLabel.setText(String.format("Assessment Value: $%.2f", assessmentValue));
            propertyTaxLabel.setText(String.format("Property Tax: $%.2f", propertyTax));
        }
    }
}