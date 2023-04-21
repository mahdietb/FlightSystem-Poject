import java.util.Scanner;

public class OriginalMenu {
    private UsersMenu usersMenu = new UsersMenu();
    private AdminMenu adminMenu = new AdminMenu();
    private Users users = new Users();
    Scanner get = new Scanner(System.in);

    public String printWelcomeMenu() {
        for (int i = 0; i < 47; i++) {
            System.out.print(":");
        }
        System.out.println();
        System.out.println("    WELCOME TO AIRLINE RESERVATION SYSTEM");
        for (int i = 0; i < 47; i++) {
            System.out.print(":");
        }
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < 15; i++) {
            System.out.print(".");

        }
        System.out.print("MENU OPTION");
        for (int i = 0; i < 15; i++) {
            System.out.print(".");

        }
        System.out.println();
        System.out.println("<1> sign up");
        System.out.println("<2> sign in");
        System.out.print("option = ");
        return get.next();
    }

    public void mainMenu() {

        String x = printWelcomeMenu();

        while (true) {
            int signInCheck = 0;
            String[]user=new String[1];

            switch (x) {

                case "1":

                    users.signUp();

                    break;


                case "2":

                    signInCheck = users.signIn(signInCheck,user);
                    System.out.println(signInCheck);

                    if (signInCheck == 1) {
                        adminMenu.enteringAdminMenu();
                    } else if (signInCheck == 2) {
                        usersMenu.enteringUserMenu(user[0]);
                    }

                    break;


            }

            x = printWelcomeMenu();


        }

    }
}
