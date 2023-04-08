import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Users {
    Scanner get = new Scanner(System.in);
    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<String> name = new ArrayList<>();

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    private Admin admin = new Admin("mahdiehtb", "756402mt");


    private Menu menu;

    public void signUp() {
        users.add(new User("mahdiehtb", "756402mt",0));
        System.out.println("please fill the wanted information to sign up");
        System.out.print("username = ");
        String userName = get.next();
        System.out.println();
        System.out.print("password = ");
        String password = get.next();
        users.add(new User(userName, password,0));
    }


    public void signIn(int[] check, String[] username) {


        System.out.println("welcome please enter your information");
        System.out.print("username = ");
        username[0] = get.next();

        System.out.println();
        System.out.print("password = ");
        String password = get.next();
        for (int i = 0; i < users.size(); i++) {
            String usernameCheck = String.valueOf(users.get(i).getUserName());
            String passwordCheck = String.valueOf(users.get(i).getPassword());
            if ((Objects.equals(username[0], admin.getUserName())) && (Objects.equals(password, admin.getPassword()))) {
                check[0] = 1;
            } else if (Objects.equals(usernameCheck, username[0]) && (Objects.equals(passwordCheck, password))) {
                check[0] = 2;
                name.add(0, usernameCheck);
            }
        }


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
        int[] array = new int[1];
        String[] userNameArray = new String[1];

        System.out.println("please enter the amount you want to add = ");
        addingCharge = get.nextInt();
        long charge = 0;
        for (int i = 0; i < users.size(); i++) {
            if (Objects.equals(name.get(0), users.get(i).getUserName())) {

                charge = users.get(i).getCharge();

                charge = addingCharge + charge;
                users.get(i).setCharge(charge);

            }

        }
    }

    public long returnCharge() {
        long charge = 0;

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getUserName());
            if (Objects.equals(name.get(0), users.get(i).getUserName())) {

                charge = users.get(i).getCharge();

            }

        }


        return charge;
    }
}
