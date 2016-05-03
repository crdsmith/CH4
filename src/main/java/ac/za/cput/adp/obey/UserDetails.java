package ac.za.cput.adp.obey;

/**
 *
 */
public class UserDetails {
    private String avatar;
    private String screenName;
    private String emailAddress;
    private String password;
    private int membershipNumber;
    private String joinDate;


    public UserDetails(String avatar, String screenName, String emailAddress, String password, int membershipNumber, String joinDate) {
        this.avatar = avatar;
        this.screenName = screenName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.membershipNumber = membershipNumber;
        this.joinDate = joinDate;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
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
}
