public class InternationalDivision extends Division {
    String countryName;
    String language;

    protected InternationalDivision(String companyName, int accountNumber, String countryName, String language) {
        super(companyName, accountNumber);
        this.countryName = countryName;
        this.language = language;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String display() {
        String result;
        result = "CompanyName: " + this.companyName + " AccountNumber: " + this.accountNumber + " CountryName: "
                + this.countryName + " Language: " + this.language;
        return result;
    }
}
