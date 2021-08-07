/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021
*/

/*Gallagher, J. (2020, March 17). How to Use for and for each Loops in Java. 
Career Karma. https://careerkarma.com/blog/java-for-each-loops/.
Modified by Ahriika Jordan 2021 
*/

/*How to iterate through ArrayList of objects in Java. HowToDoInJava. (2020, August 30). 
https://howtodoinjava.com/java/collections/arraylist/iterate-through-objects/#:~:text=There%20are%20five%20ways%20to%20loop%20ArrayList.%201.,arraylist%20of%20objects%20using%20foreach%20loop.%20Program%20output. 
Modified by Ahriika Jordan 2021
*/

import java.util.ArrayList;
import java.util.Arrays;

public class JordanExceptionTest2 {
    public static void main(String[] args) {

        // The ArrayList method will accept an array of objects.

        ArrayList<String> array = new ArrayList<String>(Arrays.asList("Ahriika", "would", "like", "to", "resubmit",
                "this", "assignment", "after", "making", "revisions"));
        {

            // for loop will print the objects in the array
            for (String loop : array) {
                System.out.println(loop);
            }

            /**
             * Try/catch function which will print the object the user would like to see
             * again, and catch any exceptions.
             * 
             * @param String user accepts the user input.
             * @return displays the desired object or displays an "out of bounds" message.
             */
            try {
                System.out.println("Which element would you like to see again? ");
                String user = System.console().readLine();
                System.out.println("The requested element is: " + user);
            }

            catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Out of Bounds.");
            }
        }
    }
}