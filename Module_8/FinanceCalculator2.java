import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import javafx.scene.control.Label;

class FinanceCalculator2 extends JordanEnhancedFutureValueApp2 implements ActionListener {

    private static int MONTHS_IN_YEAR = 12;
    JTextField monthlyPayment;
    JTextField interestRate;
    static JButton btnCalculate;
    static JButton btnClear;
    JTextArea result;
    double rate;
    int years;
    int cbox;
    Label lblFutureValueDate;

    FinanceCalculator2() {
    }

    public static void main(String[] args) {

        FinanceCalculator2 action = new FinanceCalculator2();
        btnClear.addActionListener(action);
        btnCalculate.addActionListener(action);

        Calendar day = new GregorianCalendar();
        day.getTime();
        Label lblFutureValueDate = new Label("Calculation as of " + day);
    }

    static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        int months = years * MONTHS_IN_YEAR;
        double interestRate = (1 + rate / 100);
        double presentValue = monthlyPayment * months;
        double futureValue = presentValue * (Math.pow(interestRate, months));
        return futureValue;
    }

    public void actionPerformed(ActionEvent e) {

        String click = e.getActionCommand();
        if (click.equals("Clear")) {
            monthlyPayment.setText(" ");
            interestRate.setText(" ");
        } else if (click.equals("Calculate")) {
            result.show();
        }
    }

    public void clearFormFields() {
        monthlyPayment.toString();
        interestRate.toString();
        result.toString();
        lblFutureValueDate.toString();
        cbox = 0;
    }
}