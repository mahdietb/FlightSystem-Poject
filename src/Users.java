import java.util.ArrayList;
import java.util.Objects;


public class Users {
    private Fill fill = new Fill();
    private Admins admin = new Admins();
    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<String> name = new ArrayList<>();

    public static ArrayList<String> getName() {
        return name;
    }

    public static void setName(ArrayList<String> name) {
        Users.name = name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        Users.users = users;
    }

    public void signUp() {
        String userName = null;
        String password = null;
        System.out.println("please fill the wanted information to sign up");
        System.out.print("username = ");
        userName = fill.get(userName);
        System.out.println();
        System.out.print("password = ");
        password = fill.get(password);
        users.add(new User(userName, password, 0));
        System.out.println("your signup completed successfully");
        System.out.println(users);
    }


    public int signIn(int check,String[]user) {
        String password = null;
        String username = null;
        admin.Empty();

        System.out.println(users);

        System.out.println("welcome please enter your information");
        System.out.print("username = ");
        username = fill.get(username);
        System.out.println();
        System.out.print("password = ");
        password = fill.get(password);
        for (int i = 0; i < users.size(); i++) {

            if (Objects.equals(username, admin.getAdmins().get(0).getUserName()) && Objects.equals(password, admin.getAdmins().get(0).getPassword())) {
                check = 1;
            } else if (Objects.equals(users.get(i).getUserName(), username) && Objects.equals(users.get(i).getPassword(), password)) {
                user[0]=username;
                check = 2;
                name.add(0, users.get(i).getUserName());
            } else {
                System.out.println("sorry the password is wrong");

            }
        }
        return check;
    }


    public void changePassword() {
        int flag = 0;
        String password = null;
        String newPassword = null;
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
        while (flag == 0) {
            System.out.println("your password = ");
            password = fill.get(password);
            for (int i = 0; i < users.size(); i++) {
                String checkPassword = users.get(i).getPassword();
                if (Objects.equals(checkPassword, password)) {
                    System.out.println("enter the new password you want =");
                    newPassword = fill.get(newPassword);
                    users.get(i).setPassword(newPassword);
                    System.out.println(users.get(i).getPassword());
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("your password is not found please try again =");
            }
        }
    }

    public void addCharge() {
        long addingCharge = 0;
        int[] array = new int[1];
        String[] userNameArray = new String[1];

        System.out.println("please enter the amount you want to add = ");
        addingCharge = fill.get(addingCharge);
        long charge = 0;
        for (int i = 0; i < users.size(); i++) {
            if (Objects.equals(name.get(0), users.get(i).getUserName())) {

                charge = users.get(i).getCharge();

                charge = addingCharge + charge;
                users.get(i).setCharge(charge);

            }

        }
    }

//    public void returnLastCharge(long Charge) {
//
//
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i).getUserName());
//            if (Objects.equals(name.get(0), users.get(i).getUserName())) {
//
//                lastCharge = users.get(i).getCharge();
//                if (x == 1) {
//                    lastCharge = lastCharge - price;
//                    users.get(i).setCharge(lastCharge);
//                }
//            }
//        }
//
//    }

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
