/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021
*/

/*Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by Ahriika Jordan 2021
*/

//imports for several javafx variables referenced in the program
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.geometry.HPos;
import javafx.geometry.Insets;

public class JordanFutureValueApp2 extends Application {
    @Override
    public void start(Stage primaryStage) {

        // Variables set buttons, labels, text fields, text areas, and a Combobox
        GridPane pane = new GridPane();

        // Setting the alignment and sizing for the GridPane
        GridPane.setHalignment(pane, HPos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Creating and adding the label and textfield for the monthly payment amount
        Label lblMonthlyPayment = new Label("Monthly Payment: ");
        pane.add(lblMonthlyPayment, 1, 0);
        TextField monthlyPayment = new TextField();
        monthlyPayment.setPrefSize(100, 25);
        pane.add(monthlyPayment, 2, 0);

        // Creating and adding the label and textfield for the interest rate amount
        Label lblInterestRate = new Label("Interest Rate: ");
        pane.add(lblInterestRate, 1, 1);
        TextField interestRate = new TextField();
        interestRate.setPrefSize(100, 25);
        pane.add(interestRate, 2, 1);

        // Creating a label to explain how to enter the interest rate (as a double
        // value)
        Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 2, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        // Creating a combobox and label for the user to select how many years to use
        // for the calculation
        Label lblYears = new Label("Years: ");
        pane.add(lblYears, 1, 3);
        Integer year[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ComboBox<Integer> cbox = new ComboBox<Integer>(FXCollections.observableArrayList(year));
        cbox.setPrefSize(100, 25);
        pane.add(cbox, 2, 3);

        // Creating "clear" and "calculate" buttons and adding them to the gridpane
        Button btnClear = new Button("Clear");
        pane.add(btnClear, 1, 4);
        Button btnCalculate = new Button("Calculate");
        pane.add(btnCalculate, 2, 4);

        // Creating a text area to display the calculation, and establishing the size of
        // the text area
        TextArea result = new TextArea();
        result.setPrefSize(200, 150);
        pane.add(result, 1, 5);

        // Setting the specifications for the Clear and Calculate buttons
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        pane.add(actionBtnContainer, 1, 4);

        // Setting the title of the stage and displaying (showing) the stage
        Scene stage = new Scene(pane, 400, 400);
        primaryStage.setScene(stage);
        primaryStage.setTitle("Jordan Future Value App.");
        primaryStage.show();
    }

    // This runs the program and displays the desired pane
    public static void main(String[] args) {
        launch(args);
    }
}