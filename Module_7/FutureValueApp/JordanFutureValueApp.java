import java.fx.application.Application;
import java.fx.scene.Scene;
import java.fx.scene.control.Label;
import java.fx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.scene.control.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;

private class JordanFutureValueApp extends Application{
    @Overrride 
    public void start(Stage primaryStage){
        
        private Label lblMonthlyPayment = new Label("Monthly Payment:");
        private TextField monthlyPayment = new TextField();
        private Label lblInterestRate = new Label("Interest Rate:");
        private TextField interestRate = new TextField();
        private Label lblYears = new Label("Years:");
        private Integer ComboBox = new Integer();
        private Button btnCalculate = new Button("Calculate");
        private Button btnClear = new Button("Clear");
        private TextArea result = new TextArea();

        GridPane.setHalignment(lblMonthlyPayment, HPos.Right);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        pane.add(actionBtnContainer, 1, 4);

        primaryStage stage = new Stage();
        primaryStage.setTitle("Jordan Future Value App.");
        primaryStage.show();
    }
}

