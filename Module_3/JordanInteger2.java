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
    private static int Ahriika = 7;
    private static int Daniel = 6;
    private static int Grace = 5;

    // default name called will be "Ahriika"
    public int getName(int Ahriika) {
        return Ahriika;
    }

    public void setName(int Ahriika) {
        this.Ahriika = Ahriika;
    }

    // This section establishes if the length of the name is Even, Odd, or Prime
    public boolean isEven() {
        if (Ahriika % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isOdd() {
        if (Ahriika % 2 != 0)
            return true;
        else
            return false;
    }

    public boolean isPrime() {
        for (int i = 2; i <= Ahriika / 2;) {
            if (Ahriika % i == 0)
                return false;
            else
                return true;
        }
        return isPrime();
    }

    // This section establishes if the length of the name is Even(int), Odd(int), or
    // Prime(int)
    public static void isEven(int Daniel) {

        boolean bool = (Daniel == 6);
        if (Daniel % 2 == 0)
            System.out.println(bool);
        else
            System.out.println(bool);
    }

    public static void isOdd(int Daniel) {

        boolean bool = (Daniel == 6);
        if (Daniel % 2 != 0)
            System.out.println(bool);
        else
            System.out.println(bool);
    }

    public static void isPrime(int Daniel) {
        boolean bool = (Daniel == 6);
        for (int i = 2; i <= Daniel / 2;) {
            if (Daniel % i == 0)
                System.out.println(bool);
            else
                System.out.println(bool);
        }
    }

    // This section establishes if the length of the name is Even(Integer),
    // Odd(Integer), or Prime(Integer)
    public static void isEven(Integer Grace) {

        boolean bool = (Grace == 5);
        if (Grace % 2 == 0)
            System.out.println(bool);
        else
            System.out.println(bool);
    }

    public static void isOdd(Integer Grace) {

        boolean bool = (Grace == 5);
        if (Grace % 2 != 0)
            System.out.println(bool);
        else
            System.out.println(bool);
    }

    public static void isPrime(Integer Grace) {
        boolean bool = (Grace == 5);
        for (int i = 2; i <= Grace / 2;) {
            if (Grace % i == 0)
                System.out.println(bool);
            else
                System.out.println(bool);
        }
    }

    // Displays the results of each name's length, and whether it is even, odd,
    // and/or prime
    public static void main(String[] args) {

        System.out.println("The length of the name 'Ahriika' is: " + Ahriika + ", the number is even: "
                + (Ahriika % 2 == 0) + ", the number is odd: " + (Ahriika % 2 != 0) + ", the number is prime: "
                + (Ahriika % Ahriika == 0));

        System.out.println("The length of the name 'Daniel' is: " + Daniel + ", the number is even: "
                + (Daniel % 2 == 0) + ", the number is odd: " + (Daniel % 2 != 0) + ", the number is prime: "
                + (Daniel % Daniel == 0));

        System.out.println("The length of the name 'Grace' is: " + Grace + ", the number is even: " + (Grace % 2 == 0)
                + ", the number is odd: " + (Grace % 2 != 0) + ", the number is prime: " + (Grace % Grace == 0));
    }
}