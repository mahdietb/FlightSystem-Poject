import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Users {
    Scanner get = new Scanner(System.in);
    private ArrayList<User> users = new ArrayList<>();

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    private Admin admin = new Admin("mahdiehtb", "756402mt");


    private Menu menu;

    public void signUp() {

        System.out.println("please fill the wanted information to sign up");
        System.out.print("username = ");
        String userName = get.next();
        System.out.println();
        System.out.print("password = ");
        String password = get.next();
        users.add(new User(userName, password));
    }


    public String signIn() {

        users.add(new User("mahdiehtb", "756402mt"));
        System.out.println("welcome please enter your information");
        System.out.print("username = ");
        String username = get.next();
        System.out.println();
        System.out.print("password = ");
        String password = get.next();
        for (int i = 0; i < users.size(); i++) {
            String usernameCheck = String.valueOf(users.get(i).getUserName());
            String passwordCheck = String.valueOf(users.get(i).getPassword());
            if ((Objects.equals(username, admin.getUserName())) && (Objects.equals(password, admin.getPassword()))) {
                menu.enteringAdminMenu();
            } else if (Objects.equals(usernameCheck, username) && (Objects.equals(passwordCheck, password))) {

            }
        }

        return username;
    }


    public void changePassword() {
        int flag = 0;
        String password;
        String newPassword;
        while (flag == 0) {

            System.out.println("your password = ");
            password = get.next();
            System.out.println("enter the new password you want =");
            newPassword = get.next();
            for (int i = 0; i < users.size(); i++) {
                String checkPassword = users.get(i).getPassword();
                if (Objects.equals(checkPassword, password)) {
                    users.get(i).setPassword(newPassword);
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("your password is not found please try again =");
            }
        }
    }

    public void addCharge() {
        long addingCharge;
        System.out.println("please enter the amount you want to add = ");
        addingCharge = get.nextInt();
        long charge;
        String userName = signIn();

        for (int i = 0; i < users.size(); i++) {

            String usernameCheck = String.valueOf(users.get(i).getUserName());
        if (Objects.equals(userName, usernameCheck)){
            charge=users.get(i).getCharge();
            users.get(i).setCharge(addingCharge+charge);
        }
        }
    }
}
