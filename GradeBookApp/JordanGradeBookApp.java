/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021
*/

/*Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by Ahriika Jordan 2021
*/

/*
Victor, P. (2021, March 1). Javafx Gridpane. EDUCBA. https://www.educba.com/javafx-gridpane/. 
Modified by Ahriika Jordan 2021
*/

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JordanGradeBookApp extends Application {
    @Override
    public void start(Stage stage) {

        // establishing a gridpane, buttons, textfields, labels, and a combobox.
        GridPane gridpane = new GridPane();

        // Three buttons are created and added to the gridpane. The buttons will save or
        // clear the data input into the form, and show the saved entries.
        Button clear = new Button("Clear");
        gridpane.add(clear, 8, 8);
        Button save = new Button("Save");
        gridpane.add(save, 9, 8);
        Button gradeEntries = new Button("Saved Grade Entries");
        gridpane.add(gradeEntries, 10, 8);

        // Three labels are created and three textfields are created. These labels and
        // textfiels are guides for what type of data to enter.
        Label fname = new Label("First Name: ");
        gridpane.add(fname, 1, 1);
        TextField fname1 = new TextField();
        gridpane.add(fname1, 2, 1);

        Label lname = new Label("Last Name: ");
        gridpane.add(lname, 1, 2);
        TextField lname1 = new TextField();
        gridpane.add(lname1, 2, 2);

        Label course = new Label("Course Name: ");
        gridpane.add(course, 1, 3);
        TextField course1 = new TextField();
        gridpane.add(course1, 2, 3);

        // The combobox is created to store letter grades that the user can select from.
        Label grade = new Label("Grade: ");
        gridpane.add(grade, 1, 4);
        String grades[] = { "A", "B", "C", "D", "F" };
        ComboBox grades1 = new ComboBox(FXCollections.observableArrayList(grades));
        gridpane.add(grades1, 2, 4);

        Scene scene1 = new Scene(gridpane, 700, 500);
        stage.setScene(scene1);
        stage.show();
    }

    // Main method for displaying the form.
    public static void main(String[] args) {
        launch(args);
    }
}