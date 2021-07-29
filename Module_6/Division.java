/*Java Create and Write To Files. (n.d.). https://www.w3schools.com/java/java_files_create.asp. 
Modified by Ahriika Jordan 2021
*/

/*Java User Input (Scanner). Java User Input (Scanner class). (n.d.). https://www.w3schools.com/java/java_user_input.asp.
Modified by Ahriika Jordan 2021
*/

/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021
*/

public abstract class Division {

    /**
     * The Division class establishes the company name and account number variables.
     * 
     * @param companyName   String
     * @param accountNumber int
     * @return returns the initialized company name and account number. The class
     *         ends with the establishment of the display() method.
     */

    String companyName;
    int accountNumber;

    protected Division(String companyName, int accountNumber) {
        this.companyName = companyName;
        this.accountNumber = accountNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int accountNumber() {
        return accountNumber;
    }

    public abstract String display();
}