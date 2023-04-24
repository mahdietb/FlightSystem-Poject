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
        int[] userCheck= new int [1];
        int []passCheck=new int [1];
        System.out.println("please fill the wanted information to sign up");
        System.out.print("username = ");
        userName = fill.get(userName);
        System.out.println();
        System.out.print("password = ");
        password = fill.get(password);
        flag(userName,password,userCheck,passCheck);
        printError(userCheck, passCheck);
        if ((userCheck[0]==0 )&&(passCheck[0]==0)){
        users.add(new User(userName, password, 0));
        System.out.println("your signup completed successfully");
        System.out.println(users);}
    }



    public int signIn(int check, String[] user) {
        String password = null;
        String username = null;
        admin.beingEmpty();

        System.out.println(users);

        System.out.println("welcome please enter your information");
        System.out.print("username = ");
        username = fill.get(username);
        System.out.println();
        System.out.print("password = ");
        password = fill.get(password);
        for (User value : users) {

            if (Objects.equals(username, admin.getAdmins().get(0).getUserName()) && Objects.equals(password, admin.getAdmins().get(0).getPassword())) {
                check = 1;
            } else if (Objects.equals(value.getUserName(), username) && Objects.equals(value.getPassword(), password)) {
                user[0] = username;
                check = 2;
                name.add(0, value.getUserName());
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
        for (User user : users) {
            System.out.println(user);
        }
        while (flag == 0) {
            System.out.println("your password = ");
            password = fill.get(password);
            for (User user : users) {
                String checkPassword = user.getPassword();
                if (Objects.equals(checkPassword, password)) {
                    System.out.println("enter the new password you want =");
                    newPassword = fill.get(newPassword);
                    user.setPassword(newPassword);
                    System.out.println(user.getPassword());
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("your password is not found please try again =");
            }
        }
    }

    /**
     * for adding charge for users
     */
    public void addCharge() {
        long addingCharge = 0;
        int[] array = new int[1];
        String[] userNameArray = new String[1];

        System.out.println("please enter the amount you want to add = ");
        addingCharge = fill.get(addingCharge);
        long charge = 0;
        for (User user : users) {
            if (Objects.equals(name.get(0), user.getUserName())) {

                charge = user.getCharge();

                charge = addingCharge + charge;
                user.setCharge(charge);

            }

        }
    }

    /**
     * check if any users with this new user info does not exist
     * @param name name of the user
     * @param pass password of user
     * @param flag1 check for name
     * @param flag2 check for pass
     */
    public void flag(String name, String pass, int[] flag1, int[] flag2) {

        for (User user : users) {
            if (Objects.equals(user.getUserName(), name)) {
                flag1[0] = 1;
            } else if (Objects.equals(user.getPassword(), pass)) {
                flag2[0] = 1;
            }
        }
    }

    /**
     * printing error for existing username and password
     * @param existentOfName check for name
     * @param existentOfPass check for pass
     */
    public void printError(int[] existentOfName,int[] existentOfPass){
        if (existentOfName[0]==1){
            System.out.println("sorry this username is already taken please choose another one");
        } else if (existentOfPass[0]==1) {
            System.out.println("sorry this password is already taken please choose another one");

        }
    }
}
