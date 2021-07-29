/**
 * Main class used to display the results of both the international and domestic
 * division businesses.
 * 
 * @param InternationalDivision class
 * @param DomesticDivision      class
 * @return prints the results.
 */

public class UseDivision {

    public static void main(String[] args) {
        InternationalDivision intDiv1 = new InternationalDivision("Google", 53481, "Russia", "Russian");
        InternationalDivision intDiv2 = new InternationalDivision("Microsoft", 78412, "Spain", "Spanish");
        DomesticDivision domDiv1 = new DomesticDivision("Apple", 48916, "CA");
        DomesticDivision domDiv2 = new DomesticDivision("Sony", 62213, "NY");
        System.out.println(intDiv1.display());
        System.out.println(intDiv2.display());
        System.out.println(domDiv1.display());
        System.out.println(domDiv2.display());
    }
}
