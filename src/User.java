import java.util.Scanner;

public class User {
    Scanner get=new Scanner(System.in);
    private String userName;
    private String password;
    private  long charge;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
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



}

