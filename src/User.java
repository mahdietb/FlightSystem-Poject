public class User {

    private String userName;
    private String password;
    private long charge;

    public User(String userName, String password, long charge) {
        this.userName = userName;
        this.password = password;
        this.charge = charge;
    }

    public long getCharge() {
        return charge;
    }

    public void setCharge(long charge) {
        this.charge = charge;
    }

    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", charge=" + charge +
                '}';
    }
}
