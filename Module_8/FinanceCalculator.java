/*Alexander, A. (2018, February 28). Java Date/Calendar example: How to get today's date (now).
https://alvinalexander.com/java/java-today-get-todays-date-now/#:~:text=Date%20today%20%3D%20new%20Date%28%29%3B%20you%20can%20still,method%20to%20convert%20this%20to%20a%20java.util.Date%20reference.%E2%80%9D. 
Modified by Ahriika Jordan 2021
*/

import java.util.*;
import javafx.application.Application;

public class FinanceCalculator extends JordanEnhancedFutureValueApp {

    private static int MONTHS_IN_YEAR = 12;

    static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        int months = years * MONTHS_IN_YEAR;
        double interestRate = rate;
        interestRate = (1 + rate / 100);
        double presentValue = (monthlyPayment * months) + rate;

        double futureValue = presentValue * (Math.pow(interestRate, months));

        Date today = Calendar.getInstance().getTime();

        return monthlyPayment;
    
        private void clearFormFields(){
            txtMonthlyPayment.ToString();
            txtInterestRate.ToString();
            txtResults.ToString();
            lblFutureValueDate.ToString();
            int cbYears = 0;
        }
    }
}