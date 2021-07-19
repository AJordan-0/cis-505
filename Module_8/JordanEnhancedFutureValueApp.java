/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021
*/

/*Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by Ahriika Jordan 2021
*/

//imports for several javafx variables referenced in the program
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.HPos;
import javafx.geometry.Insets;

public class JordanEnhancedFutureValueApp extends Application {
    @Override
    public void start(Stage primaryStage) {

        // Variables set buttons, labels, text fields, text areas, and a Combobox
        GridPane pane = new GridPane();
        Label lblMonthlyPayment = new Label("Monthly Payment:");
        TextField txtMonthlyPayment = new TextField();
        Label lblInterestRate = new Label("Interest Rate:");
        TextField txtInterestRate = new TextField();
        Label lblYears = new Label("Years:");
        ComboBox<Integer> cbox = new ComboBox<Integer>();
        Button btnCalculate = new Button("Calculate");
        Button btnClear = new Button("Clear");
        TextArea txtResults = new TextArea();

        // Setting the alignment for where the "Monthly Payment" Text will be on the
        // pane
        GridPane.setHalignment(lblMonthlyPayment, HPos.RIGHT);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Setting the alignment for where the "Interest Rate" text will be and the
        // color
        lblInterestRate.setTextFill(Color.RED);
        pane.add(lblInterestRate, 1, 2);
        GridPane.setHalignment(lblInterestRate, HPos.RIGHT);

        // Setting the specifications for the Clear and Calculate buttons
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        pane.add(actionBtnContainer, 1, 4);

        // Setting the title of the stage and displaying (showing) the stage
        Stage stage = new Stage();
        primaryStage.setTitle("Jordan Future Value App.");
        primaryStage.show();
    }

    private Button onActioButton() {
        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate.setOnAction(e -> clearFormFields());
    }

    private void calculateResults() extends FinanceCalculator{
        System.out.println("Calculation as of " + today);      
        System.out.println("The future value is " + futureValue);
        }

    // This runs the program and displays the desired pane
    public void main(String[] args) {
        launch(args);
    }
}