
package Lab6;

public class Member {
    private String memberName;
    private String membershipType;
    private boolean newsletterSelected; 
    private int numberOfMonths;

    // Constructor
    public Member(String memberName, String membershipType, boolean newsletterSelected, int numberOfMonths) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    // Getter methods
    public String getMemberName() { return memberName; }
    public String getMembershipType() { return membershipType; }
    public int getNumberOfMonths() { return numberOfMonths; }

   
    public String getNewsletterText() {
        if (newsletterSelected == true) {
            return "Yes";
        } else {
            return "No";
        }
    }
    
    public double getMonthlyFee() {
        if (membershipType.equals("Premium")) {
            return 2500.0;
        } else {
            return 1000.0; 
        }
    }

    
    public double getMembershipFee() {
        double total = getMonthlyFee() * numberOfMonths;
        
    
        if (newsletterSelected == true) {
            total = total + 200.0;
        }
        return total;
    }
}
