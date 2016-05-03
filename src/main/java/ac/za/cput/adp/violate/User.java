package ac.za.cput.adp.violate;

/**
 *
 */
public class User {
    private String avatar;
    private String screenName;

    private MembershipDetails membershipDetails;
    private Password password;

    public User(String avatar, String screenName) {
        this.avatar = avatar;
        this.screenName = screenName;
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

    public int getMembershipNumber() {
        return membershipDetails.getMembershipNumber();
    }

    public String getEmailAddress() {
        return password.getEmailAddress();
    }
}
