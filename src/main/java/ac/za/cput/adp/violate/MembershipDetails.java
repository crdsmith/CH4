package ac.za.cput.adp.violate;

/**
 *
 */
public class MembershipDetails {
    private int membershipNumber;
    private String joinDate;

    private Password password;
    private  User user;

    public MembershipDetails(int membershipNumber, String joinDate) {
        this.membershipNumber = membershipNumber;
        this.joinDate = joinDate;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(int membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getEmailAddress() {
        return password.getEmailAddress();
    }

    public String getScreenName() {
        return user.getScreenName();}
}
