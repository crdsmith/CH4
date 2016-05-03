package ac.za.cput.adp.violate;

/**
 *
 */
public class Password {
    private String emailAddress;
    private String password;

    private MembershipDetails membershipDetails;
    private User user;

    public Password(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMembershipNumber() {
        return membershipDetails.getMembershipNumber();
    }

    public String getScreenName() {
        return user.getScreenName();}
}
