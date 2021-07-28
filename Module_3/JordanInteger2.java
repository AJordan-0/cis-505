/*Boyini, K. (2018, November 12). Java Program to convert integer to boolean. https://www.tutorialspoint.com/java-program-to-convert-integer-to-boolean. 
Modified by Ahriika Jordan 2021
*/

/*Java Program to Check Whether a Number is Even or Odd. Programiz. (n.d.). 
https://www.programiz.com/java-programming/examples/even-odd#:~:text=Now%2C%20to%20check%20whether%20num%20is%20even%20or,is%20even.%20Else%2C%20we%20print%20num%20is%20odd. 
*/

/*Java Program to Check Whether a Number is Prime or Not. Programiz. (n.d.). https://www.programiz.com/java-programming/examples/prime-number. 
Modified by Ahriika Jordan 2021
*/

/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021
*/

/*Pedamkar, P. (2021, April 12). Java Getter Setter: Adding Setter and Getter Methods in Java. EDUCBA. https://www.educba.com/java-getter-setter/. 
Modified by Ahriika Jordan 2021
*/

public class JordanInteger2 {

    // setting length of names
    private int ahriika = 0;
    private int grace = 0;

    /**
     * Method with one argument, which is used to get and set the user's first name.
     * 
     * @param ahriika int
     * @return returns the result.
     */
    public int getValue() {
        return ahriika;
    }

    public void setValue(int ahriika) {
        this.ahriika = ahriika;
    }

    /**
     * Method to determine if the int is even, odd, and prime.
     * 
     * @param ahriika int
     * @return returns true or false results
     */
    public boolean isEven() {
        if (ahriika % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isOdd() {
        if (ahriika % 2 != 0)
            return true;
        else
            return false;
    }

    public boolean isPrime() {
        boolean prime1 = true;
        for (int i = 2; i <= ahriika / 2;) {
            if (ahriika % i == 0)
                return false;
        }
        return prime1;
    }

    /**
     * Method to determine if the int is even, odd, and prime.
     * 
     * @param grace Integer
     * @return returns true or false results.
     */
    public static boolean isEven(Integer grace) {

        if (grace % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOdd(Integer grace) {

        if (grace % 2 != 0)
            return true;
        else
            return false;
    }

    public static boolean isPrime(Integer grace) {
        boolean prime = false;

        for (int i = 2; i <= grace / 2;) {
            if (grace % i == 0)
                prime = true;
        }
        return prime;
    }

    /**
     * Method to establish both int and Integer variables.
     * 
     * @param ahriika int
     * @return returns int and Integer results for the variable 'ahriika'.
     */

    public boolean equals(int variable) {
        return variable == ahriika;
    }

    public boolean equals(Integer variable) {
        return variable == ahriika;
    }

    public String toString() {
        String returnResult = "The number: " + getValue() + " is prime: " + isPrime() + ", is odd: " + isOdd()
                + ", and is even: " + isEven();
        return returnResult;
    }

    /**
     * Main class is used to create new instances.
     * 
     * @param JordanInteger2
     * @return prints the results.
     */
    public static void main(String[] args) {
        JordanInteger2 ji2 = new JordanInteger2();
        ji2.setValue(12);
        System.out.println(ji2.getValue());
        System.out.println(ji2.toString());

        JordanInteger2 ji3 = new JordanInteger2();
        ji3.setValue(9);
        System.out.println(ji3.getValue());
        System.out.println(ji3.toString());

        Integer int1 = new Integer(13);
        System.out.println(ji2.equals(int1));

        Integer int2 = new Integer(12);
        System.out.println(ji2.equals(int2));
    }
}