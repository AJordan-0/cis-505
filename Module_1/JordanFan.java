/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021
*/

public class JordanFan {

    // List of static values, including Speed, Radius, and Color
    static class FAN {
        static int STOPPED = 0;
        static int SLOW = 1;
        static int MEDIUM = 2;
        static int FAST = 3;
        static final int[] SPEED = { 0, 1, 2, 3 };
        static final int[] RADIUS = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        static final String COLOR = "WHITE";

        // Specification of both int[] and String values being utilized
        final static JordanFan.FAN SPEED(int[] RADIUS, String COLOR) {
            return null;
        }
    }

    // Initial default values for Speed, Radius, and Color are established here
    private static int SPEED() {
        return 0;
    }

    private static int RADIUS() {
        return 6;
    }

    private static String COLOR() {
        return "WHITE";
    }

    // Get and Set statements to both get a value and set it to the default value
    public void setSPEED(int SPEED) {
        SPEED = 0;
    }

    public static int[] getSPEED(int STOPPED, int SLOW, int MEDIUM, int FAST) {
        return FAN.SPEED;
    }

    public void setRADIUS(int RADIUS) {
        RADIUS = 6;
    }

    public int[] getRADIUS() {
        return FAN.RADIUS;
    }

    public void setCOLOR(String COLOR) {
        COLOR = "WHITE";
    }

    public static String getCOLOR() {
        return FAN.COLOR;
    }

    // The portion of the program for determining if the fan is on or off
    boolean on = false;

    void FANOn() {
        on = true;
    }

    void FANOff() {
        on = false;
    }

    // This is the portion of code that establishes what to display if the default
    // value is not applicable
    public void setSPEED() {
        if ((on && JordanFan.SPEED() >= 1) && (on && JordanFan.SPEED() <= 3))
            getSPEED(1, 2, 3, 4);
    }

    public void setRADIUS() {
        if (JordanFan.RADIUS() < 0 || JordanFan.RADIUS() >= 10 && JordanFan.RADIUS() != 6)
            getRADIUS();
    }

    public void setCOLOR() {
        if (JordanFan.COLOR() != "WHITE")
            getCOLOR();
    }

    /*
     * This is the instance builder and the statement(s) that will display when the
     * code is run. The first statement will display the default values, and the
     * second statement will display non-default values.
     */
    public static void main(String args[]) {
        int[] f1 = FAN.SPEED;
        int[] f2 = FAN.RADIUS;
        String f3 = FAN.COLOR;
        int f4 = JordanFan.SPEED();
        int f5 = JordanFan.RADIUS();
        String f6 = JordanFan.COLOR();

        System.out.println(
                "The description of the Speed, Radius, and Color of the fan is: " + f1 + ", " + f2 + ", " + f3 + ".");
        System.out.println(
                "The description of the Speed, Radius, and Color of the fan is: " + f4 + ", " + f5 + ", " + f6 + ".");
    }
}