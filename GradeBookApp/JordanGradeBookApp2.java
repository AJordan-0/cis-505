/*Chavan, K. (2019, May 6). How to add action listener to JButton in Java. 
https://www.tutorialspoint.com/how-to-add-action-listener-to-jbutton-in-java. 
Modified by Ahriika Jordan 2021*/

/*Java swing: JTextField. GeeksforGeeks. (2021, April 14). https://www.geeksforgeeks.org/java-swing-jtextfield/. 
Modified by Ahriika Jordan 2021*/

/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021*/

/*Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by Ahriika Jordan 2021*/

/*Victor, P. (2021, March 1). Javafx Gridpane. EDUCBA. https://www.educba.com/javafx-gridpane/. 
Modified by Ahriika Jordan 2021*/

/*YouTube. (2020). Java FileReader (read a file). YouTube. https://www.youtube.com/watch?v=Hr8tLlj32BQ. 
Modified by Ahriika Jordan 2021*/

/*YouTube. (2020). Java FileWrite (write to a file). YouTube. https://www.youtube.com/watch?v=kjzmaJPoaNc. 
Modified by Ahriika Jordan 2021*/

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;

class JordanGradeBookApp2 extends JFrame implements ActionListener {

    // initialize variables
    static JTextField tf1;
    static JTextField tf2;
    static JTextField tf3;
    static JFrame frame;
    static JButton save;
    static JButton clear;
    static JButton entries;
    static JLabel fname;
    static JLabel lname;
    static JLabel course;
    static JLabel grade;
    static JComboBox cbox;

    JordanGradeBookApp2() {
    }

    public static void main(String[] args) throws IOException {

        // initializes the frame, JLabels, JButtons, JTextFields, and JComboBox
        JFrame frame = new JFrame("Grade Book Application");

        JLabel fname = new JLabel("First Name");
        JLabel lname = new JLabel("Last Name");
        JLabel course = new JLabel("Course Name");
        JLabel grade = new JLabel("Grade");

        JButton save = new JButton("Save");
        JButton clear = new JButton("Clear");
        JButton entries = new JButton("Saved Entries");

        JordanGradeBookApp2 action = new JordanGradeBookApp2();

        save.addActionListener(action);
        clear.addActionListener(action);
        entries.addActionListener(action);

        JTextField tf1 = new JTextField(15);
        JTextField tf2 = new JTextField(15);
        JTextField tf3 = new JTextField(15);

        String[] letterGrade = { " ", "A", "B", "C", "D", "F" };
        JComboBox cbox = new JComboBox(letterGrade);
        cbox.addActionListener(cbox);

        // initialize panel and add the variables to the panel
        JPanel panel = new JPanel();
        panel.add(fname);
        panel.add(tf1);
        panel.add(lname);
        panel.add(tf2);
        panel.add(course);
        panel.add(tf3);
        panel.add(grade);
        panel.add(cbox);
        panel.add(save);
        panel.add(clear);
        panel.add(entries);

        // add the panel to the frame and set the size of the components
        frame.add(panel);
        frame.setSize(500, 500);
        frame.show();
    }

    public void actionPerformed(ActionEvent e) {
        String click = e.getActionCommand();

        // If the user clicks the "Save" button, the data is written to the .csv file
        // and the textfields are reset to blank values
        if (click.equals("Save")) {

            String file = "Gradebook.csv";

            try {
                FileWriter writer = new FileWriter(file, true);
                PrintWriter buff = new PrintWriter(writer);
                buff.write("First Name" + ",Last Name" + ",Course Name" + ",Grade" + ", ");
                buff.println();
                buff.write(tf1.getText() + ",");
                buff.write(tf2.getText() + ",");
                buff.write(tf3.getText() + ",");
                buff.write(cbox.getSelectedItem().toString());
                buff.println();
                buff.close();
                tf1.setText(" ");
                tf2.setText(" ");
                tf3.setText(" ");

            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }

        // If the user clicks the "Clear" button, the textfields are reset to blank
        // values
        else if (click.equals("Clear")) {
            tf1.setText(" ");
            tf2.setText(" ");
            tf3.setText(" ");
        }

        // If the user clicks the "Saved Entries" button, the .csv file is read and the
        // results are displayed
        else if (click.equals("Saved Entries")) {
            String fileName = "Gradebook.csv";

            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
// end of program