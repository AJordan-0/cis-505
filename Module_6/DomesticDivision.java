public class DomesticDivision extends Division {

    String state;

    protected DomesticDivision(String companyName, int accountNumber, String state) {
        super(companyName, accountNumber);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String display() {
        String result;
        result = "CompanyName: " + this.companyName + " AccountNumber: " + this.accountNumber + " State: " + this.state;
        return result;
    }

}
