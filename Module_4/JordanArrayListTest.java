/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021
*/

/*Java program to find maximum and minimum values of a list in a range. 
CodeVsColor. (n.d.). 
https://www.codevscolor.com/java-find-max-min-list-in-range#:~:text=%20Steps%20to%20find%20maximum%20and%20minimum%20values,the%20maximum%20and%20minimum...%205%20Exit.%20More%20. 
Modified by Ahriika Jordan 2021
*/

import java.util.ArrayList;

public class JordanArrayListTest {
    public static void main (String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        
        //Asks user to enter integers, and notifies them they cannot enter more numbers after entering a "0."
        System.out.print("Enter integers (no new numbers can be entered after 0): ");
        int value;
        int max = numberList.get();
        int j;

        //If the value entered by the user is not a 0, the number entered is added to the list.
        do {
            value = input.nextInt();

            if (list.contains(value) && value !=0)
            list.add(value);
        }while (value !=0);


        //If the value entered by the user is a 0, the number is added to the list.
        //The program determines what the maximum value is in the list.
        do {
        for (int j = 0; j <= numberList(); j++){
            if (numberList.get(j) != 0){
                numberList.get(j) = Math.max;
            }

            //If there is no value entered, the maximum value is 0 by default.
            else{
                Math.max = 0;
            }
        }while (value = 0);
    }

    //The system displays the maximum value entered into the list.
    System.out.println("The maxiumum number entered is: " + value);

    }
}